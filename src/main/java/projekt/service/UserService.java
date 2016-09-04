package projekt.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import projekt.model.User;
import projekt.repository.UserRepository;

import java.util.List;

/**
 * Created by Łukasz on 2016-09-03.
 */

public interface UserService {

    public List<User> getAllUsers();

}
