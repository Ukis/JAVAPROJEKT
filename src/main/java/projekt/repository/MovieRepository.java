package projekt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import projekt.model.Movie;
import projekt.model.User;

import java.util.List;
import java.util.Optional;

/**
 * Created by Łukasz on 2016-09-03.
 */
    @Repository
    public interface MovieRepository extends JpaRepository<Movie, Long> {

        Optional<Movie> findByTitle(String title);
        Optional<Movie> findById(Long id);
        List<Movie>  findAll();

    }

