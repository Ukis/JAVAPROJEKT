package projekt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import projekt.model.User;

import java.util.List;
import java.util.Optional;

/**
 * Created by Łukasz on 2016-09-03.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>
{

        Optional<User> findByUsername(String username);
        Optional<User> findById(Long id);
        List<User> findAll();

    }


