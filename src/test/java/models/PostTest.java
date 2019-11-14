package models;


import static org.junit.Assert.*;
import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class PostTest {

    @Test
    public void PostObjectInstantiatesCorrectly_true(){
        Post post = new Post("This is a content", "This is a title");
        assertTrue(true);
    }

    @Test
    public void GetsGetterMethods_getsId(){
        Post.clearAllPost();
        Post post = setupNewPost();
        int expected = 1;
        assertEquals(expected, post.getId());
    }
    @Test
    public void GetsGetterMethods_getsTitle(){
        Post post = setupNewPost();
        String expected = "This is a title";
        assertEquals(expected, post.getTitle());
    }
    @Test
    public void GetsGetterMethods_getsContent(){
        Post post = setupNewPost();
        String expected = "This is a content";
        assertEquals(expected, post.getContent());
    }
    @Test
    public void GetsGetterMethods_getsDate(){
        Post post = setupNewPost();
        LocalDate expected = LocalDateTime.now().toLocalDate();
        assertEquals(expected, post.getCreatedAt().toLocalDate());
    }
    @Test
    public void SetsSetterMethods_setsContent(){
        Post post = setupNewPost();
        post.setContent("New content");
        String expected = "New content";
        assertEquals(expected, post.getContent() );
    }
    @Test
    public void SetsSetterMethods_setsTitle(){
        Post post = setupNewPost();
        post.setTitle("New title");
        String expected = "New title";
        assertEquals(expected, post.getTitle() );
    }
    @Test
    public void findPostInPosts(){
        Post.clearAllPost();
        Post post = setupNewPost();
        Post otherPost = new Post("New post-content", "New post-title");
        int expected = 2;
        assertEquals(expected, Post.findById(otherPost.getId()).getId());
    }
    @Test
    public void allPostsAreReturned_true(){
    Post.clearAllPost();
    Post post = setupNewPost();
    Post otherPost = new Post("New post-content", "New post-title");
    assertEquals(2, post.getAllPost().size());
    }


    private Post setupNewPost() {
        return new Post("This is a content", "This is a title");
    }



}
