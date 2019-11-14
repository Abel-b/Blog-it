package models;


import java.time.LocalDateTime;

public class Post {

    private int id;
    private String title;
    private String content;
    private LocalDateTime createdAt;


    public int getId() {
        return this.id = 0;
    }

    public String getTitle() {
        return this.title = "Motivation";
    }

    public String  getContent() {
        return this.content = "This is a content part";
    }

    public LocalDateTime getCreatedAt(){
        return this.createdAt = LocalDateTime.now();
    }


    public void setId(int id) {
        this.id = id;
    }
}
