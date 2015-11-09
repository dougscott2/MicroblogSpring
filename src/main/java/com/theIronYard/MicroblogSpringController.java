package com.theIronYard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 * Created by DrScott on 11/9/15.
 */
@Controller
public class MicroblogSpringController {
    ArrayList<Message> messages = new ArrayList();


    @RequestMapping("/")
    public String home(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        model.addAttribute("username", username);
        model.addAttribute("messages", messages);
        return "home";
    }
    @RequestMapping("/login")
    public String login(HttpServletRequest request, String username){
        HttpSession session = request.getSession();
        session.setAttribute("username", username);
        return "redirect:/";
    }
    @RequestMapping("/addMessage")
    public String addMessage ( String post){
        int id = messages.size()+1;
        Message message = new Message(id, post);
        messages.add(message);
        return "redirect:/";
    }
    @RequestMapping("/deleteMessage")
    public String deleteMessage (HttpServletRequest request, Integer id){
        messages.remove(id-1);
        int idCount = 1;
        for (Message message: messages){
            message.id = idCount;
            idCount++;
        }
        return "redirect:/";
    }




}
