package projekt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import projekt.model.Movie;
import projekt.model.User;
import projekt.service.MovieService;
import projekt.service.UserService;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static projekt.controller.MovieController.BASEE_PATH;
import static projekt.controller.UserController.BASE_PATH;

/**
 * Created by Łukasz on 2016-09-03.
 */
@Controller
@RequestMapping(BASEE_PATH)
public class MovieController {

    @Autowired
    private MovieService service;


    static final String BASEE_PATH = "/movies";


    @RequestMapping(method = GET)
    ModelAndView listView() {
        final List<Movie> movies = service.getAllMovies();
        return new ModelAndView(BASEE_PATH + "/list").addObject("moviesModelList", movies);
    }
}
