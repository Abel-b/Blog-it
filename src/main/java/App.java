import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/", (request, response) -> { //URL to make new post on POST route
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/posts/new", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "postform.hbs");
        }, new HandlebarsTemplateEngine());
        post("/posts/new", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
//            String content = request.queryParams("content");
//            Post newPost = new Post(content);
            return new ModelAndView(model, "displayBlogs.hbs");
        }, new HandlebarsTemplateEngine());
        get("/posts", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "displayBlogs.hbs");
        }, new HandlebarsTemplateEngine());
        get("/posts/:id", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            int idOfPostToFind = Integer.parseInt(req.params(":id")); //pull id - must match route segment
//            Post foundPost = Post.findById(idOfPostToFind); //use it to find post
//            model.put("post", foundPost); //add it to model for template to display
            return new ModelAndView(model, "post-detail.hbs"); //individual post page.
        }, new HandlebarsTemplateEngine());

}
}
