package tech.codingclub.helix.entity;

public class Tweet {
   Long id;
   String message;
  Long  created_at;
    Long author_id;

    public Tweet( String message,Long id, Long created_at, Long author_id) {
        this.id = id;
        this.message = message;
        this.created_at = created_at;
        this.author_id = author_id;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Long  getCreated_at() {
        return created_at;
    }

    public Long getAuthor_id() {
        return author_id;
    }
}
