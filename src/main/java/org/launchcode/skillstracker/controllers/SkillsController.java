package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @ResponseBody
    @GetMapping
    public String root() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>Skills that are being tracked</h2>" +
                "<ol>" +
                    "<li>C#</li>" +
                    "<li>C++</li>" +
                    "<li>Java</li>" +
                "</ol>";
    }

    @ResponseBody
    @PostMapping("form")
    public String formPost(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
        return "<html>" +
                    "<body>" +
                        "<h1>" + name + "</h1>" +
                        "<ol>" +
                            "<li>" + language1 + "</li>" +
                            "<li>" + language2 + "</li>" +
                            "<li>" + language3 + "</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }

    @ResponseBody
    @GetMapping("form")
    public String form() {
        return "<html>" +
                    "<body>" +
                        "<form action='/form' method='post'>" +
                            "<label>Name:</label><br>" +
                            "<input type = 'text' name = 'name'/><br>" +
                            "<label>My Favorite Language:</label><br>" +
                            "<select name='language1' id='id1'>" +
                                "<option value='nothing'>--Please pick an option--</option>" +
                                "<option value='java'>Java</option>" +
                                "<option value='c#'>C#</option>" +
                                "<option value='c++'>C++</option>" +
                                "<option value='javascript'>JavaScript</option>" +
                                "<option value='html'>html *barf*</option>" +
                            "</select><br>" +
                            "<label>My Second Favorite Language:</label><br>" +
                            "<select name='language2' id='id2'>" +
                                "<option value='nothing'>--Please pick an option--</option>" +
                                "<option value='java'>Java</option>" +
                                "<option value='c#'>C#</option>" +
                                "<option value='c++'>C++</option>" +
                                "<option value='javascript'>JavaScript</option>" +
                                "<option value='html'>html *barf*</option>" +
                            "</select><br>" +
                            "<label>My Third Favorite Language:</label><br>" +
                            "<select name='language3' id='id3'>" +
                                "<option value='nothing'>--Please pick an option--</option>" +
                                "<option value='java'>Java</option>" +
                                "<option value='c#'>C#</option>" +
                                "<option value='c++'>C++</option>" +
                                "<option value='javascript'>JavaScript</option>" +
                                "<option value='html'>html *barf*</option>" +
                            "</select><br>" +
                            "<input type = 'submit' value = 'Submit' />" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }
}
