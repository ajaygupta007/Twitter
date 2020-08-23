package tech.codingclub.helix.entity;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.Date;


public class WikipediaDownloader {
    private String keyword;
    private String result;
    public WikipediaDownloader(){

    }

    public WikipediaDownloader(String keyword){
        this.keyword=keyword;
    }


    public WikiResult getResult() {
        if(null == this.keyword || this.keyword.length() ==0){
            return null;
        }
        this.keyword = this.keyword.trim().replaceAll("[ ]+","_");

        String wikiUrl=getWikipediaUrlForQuery(this.keyword);
        String imageUrl=null;
        String response="";
        try {
            String wikipediaResponseHTML= HttpURLConnectionExample.sendGet(wikiUrl);
            //System.out.println(wikipediaResponseHTML);

            Document document= Jsoup.parse(wikipediaResponseHTML,"https://en.wikipedia.org");

            Elements childElements=document.body().select(".mw-parser-output >*");

            int state=0;

            for(Element childElement:childElements){

                if(state == 0){
                    if(childElement.tagName().equals("table")){
                        state=1;
                    }}
                else if(state==1){
                    if(childElement.tagName().equals("p")){
                        state = 2;
                        response=childElement.text();
                        break;
                    }
                }


                // System.out.println(childElement.tagName());

            }
            imageUrl=document.body().select(".infobox img").get(0).attr("src");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(imageUrl.startsWith(("//"))){
            imageUrl="https:"+imageUrl;
        }

        WikiResult wikiResult=new WikiResult(this.keyword,response,imageUrl);
        return wikiResult;
    }

    private String getWikipediaUrlForQuery(String cleanKeyword) {
        return "https://en.wikipedia.org/wiki/"+cleanKeyword;
    }


}

