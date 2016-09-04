package projekt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projekt.model.Movie;
import projekt.model.User;
import projekt.repository.MovieRepository;
import projekt.repository.UserRepository;

import java.util.List;

/**
 * Created by Łukasz on 2016-09-03.
 */

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

}
