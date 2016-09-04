package projekt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import projekt.model.User;
import projekt.service.UserService;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static projekt.controller.UserController.BASE_PATH;

/**
 * Created by Łukasz on 2016-09-03.
 */

@Controller
@RequestMapping(BASE_PATH)
public class UserController {

    @Autowired
    private UserService service;


    static final String BASE_PATH = "/users";


    @RequestMapping(method = GET)
    ModelAndView listView() {
        final List<User> users = service.getAllUsers();
        return new ModelAndView(BASE_PATH + "/list").addObject("userModelList", users);
    }
}
