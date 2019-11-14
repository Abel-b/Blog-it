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
        Post post = new Post("This is a content", "This is a title");
        int expected = 1;
        assertEquals(expected, post.getId());
    }
    @Test
    public void GetsGetterMethods_getsTitle(){
        Post post = new Post("This is a content", "This is a title");
        String expected = "This is a title";
        assertEquals(expected, post.getTitle());
    }
    @Test
    public void GetsGetterMethods_getsContent(){
        Post post = new Post("This is a content", "This is a title");
        String expected = "This is a content";
        assertEquals(expected, post.getContent());
    }
    @Test
    public void GetsGetterMethods_getsDate(){
        Post post = new Post("This is a content", "This is a title");
        LocalDate expected = LocalDateTime.now().toLocalDate();
        assertEquals(expected, post.getCreatedAt().toLocalDate());
    }
    @Test
    public void SetsSetterMethods_setsContent(){
        Post post = new Post("This is a content", "This is a title");
        post.setContent("New content");
        String expected = "New content";
        assertEquals(expected, post.getContent() );
    }
    @Test
    public void SetsSetterMethods_setsTitle(){
        Post post = new Post("This is a content", "This is a title");
        post.setTitle("New title");
        String expected = "New title";
        assertEquals(expected, post.getTitle() );
    }




}
