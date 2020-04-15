package tnr.junitmetalink;

import org.junit.jupiter.api.*;
import org.squashtest.ta.galaxia.squash.tf.galaxia.annotations.TFMetadata;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AnimatedMenuTest {

    ArrayList<String> menuItem;
    @BeforeEach
    public void setUp(){
        menuItem = new ArrayList<String>();
        menuItem.add("Home");
        menuItem.add("About");
        menuItem.add("Testimonials");
        menuItem.add("News");
        menuItem.add("Contact");
    }

    //@TFMetadata(key = "linked-TC", value = "afcee4b8-d990-4644-9cbc-99b92dee4e12")
    @DisplayName("MenuTestimonials")
    @Test
    public void testMenuTestimonials(){
        Assertions.assertTrue(menuItem.contains("Testimonials"),"This menu does not contain a link to the Testimonials page");
    }

    //@TFMetadata(key = "linked-TC", value = "141714ad-e3cc-463b-bddb-df7231958630")
    @DisplayName("MenuBlog")
    @Test
    public void testMenuBlog(){
        //Assertions.assertTrue(menuItem.contains("Blog"),"<img src='https://image.shutterstock.com/image-photo/easter-bunny-rabbit-blue-painted-260nw-1032901177.jpg'/>");
		Assertions.assertTrue(menuItem.contains("Blog"),"<script>alert(\"booooooooo\")</script>");

    }

}
