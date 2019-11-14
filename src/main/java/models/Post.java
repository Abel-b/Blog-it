package models;

import java.time.LocalDateTime;
import java.util.AbstractList;
import java.util.ArrayList;

public class Post {

    private String content;
    private String title;
    private static ArrayList<Post> postInstances = new ArrayList<Post>();
    private int id;
    private LocalDateTime createdAt;

    public Post(String content, String title){
        this.content = content;
        this.title = title;
        postInstances.add(this);
        id = postInstances.size();
        this.createdAt = LocalDateTime.now();
    }

    public static void clearAllPost(){
        postInstances.clear();
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
         this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public int getId() {
        return id;
    }
    //get all posts
    public ArrayList<Post> getAllPost(){
        return postInstances;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
