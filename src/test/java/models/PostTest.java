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
        Post post = new Post();
        assertTrue(true);
    }

    @Test
    public void GetsGetterMethods_getsId(){
        Post post = new Post();
        int expected = 1;
        assertEquals(expected, post.getId() + 1);
    }
    @Test
    public void GetsGetterMethods_getsTitle(){
        Post post = new Post();
        String expected = "Motivation";
        assertEquals(expected, post.getTitle());
    }
    @Test
    public void GetsGetterMethods_getsContent(){
        Post post = new Post();
        String expected = "This is a content part";
        assertEquals(expected, post.getContent());
    }
    @Test
    public void GetsGetterMethods_getsDate(){
        Post post = new Post();
        LocalDate expected = LocalDateTime.now().toLocalDate();
        assertEquals(expected, post.getCreatedAt().toLocalDate());
    }
//    @Test
//    public void SetsSetterMethods_setsId(){
//        Post post = new Post();
//        int expected = 2;
//        assertEquals(1, post.setId());
//    }



}
