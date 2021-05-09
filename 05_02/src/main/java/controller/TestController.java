package controller;

import domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.TestService;

import java.util.List;


@Controller
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getUsers(@RequestParam("id") long id, @RequestParam("nick_name") String nick_name, Model model) {

        List<Users> temp = testService.getUsers();

        for(Users user: temp){
            System.out.println("id : " + user.getId());
            System.out.println("server : " + user.getChar_server());
            System.out.println("nickName : " + user.getNick_name());
            System.out.println("class : " +  user.getChar_class());
            System.out.println("---------------------------");

        }

        model.addAttribute("id", id);
        model.addAttribute("nick_name", nick_name);

        return "/get";
    }
    @ResponseBody
    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String postUsers(@RequestBody List<Users> ret) {

        List<Users> temp = testService.postUsers();

        for(Users user: temp){
            System.out.println("id : " + user.getId());
            System.out.println("server : " + user.getChar_server());
            System.out.println("nickName : " + user.getNick_name());
            System.out.println("class : " +  user.getChar_class());
            System.out.println("---------------------------");

        }

        return "clear";
    }

    @RequestMapping(value = "/patch", method = RequestMethod.PATCH)
    public String patchUsers() {

        List<Users> temp = testService.patchUsers();

        for(Users user: temp){
            System.out.println("id : " + user.getId());
            System.out.println("server : " + user.getChar_server());
            System.out.println("nickName : " + user.getNick_name());
            System.out.println("class : " +  user.getChar_class());
            System.out.println("---------------------------");

        }

        return "clear";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public String deleteUsers() {

        List<Users> temp = testService.deleteUsers();

        for(Users user: temp){
            System.out.println("id : " + user.getId());
            System.out.println("server : " + user.getChar_server());
            System.out.println("nickName : " + user.getNick_name());
            System.out.println("class : " +  user.getChar_class());
            System.out.println("---------------------------");

        }

        return "clear";
    }
}


