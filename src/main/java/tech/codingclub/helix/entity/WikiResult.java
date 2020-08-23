package tech.codingclub.helix.entity;

public class WikiResult {
    private  String imageUrl;
    private  String text_result;
    private  String query;

    public String getImageUrl() {
        return imageUrl;
    }

    public String getQuery() {
        return query;
    }

    public WikiResult(String query, String result, String imageUrl) {
       this.query=query;
       this.text_result=result;
       this.imageUrl=imageUrl;
    }
  public WikiResult()
  {

  }
    public String getText_result() {
        return text_result;
    }
}
