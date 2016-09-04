package projekt.model;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Łukasz on 2016-09-03.
 */

@Entity
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    @Size(min = 2, max = 50)
    private String firstName;


    @NotBlank
    @Size(min = 2, max = 50)
    private String lastName;

    @ManyToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinTable(name="user_movies",
            joinColumns={@JoinColumn(name="user_ID")},
            inverseJoinColumns={@JoinColumn(name="movie_ID")})
    private Set<Movie> movies = new HashSet<Movie>();

    @Email
    @NotEmpty
    @Column(unique = true)
    private String email;

    @Column(unique = true)
    @Size(min = 4)
    private String username;

    @NotEmpty
    private String password;

    private boolean accountNonExpired;

    private boolean accountNonLocked;

    private boolean credentialsNonExpired;

    private boolean enabled;

    @CreatedDate
    private LocalDateTime createdDate = LocalDateTime.now();


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", isEnabled=" + enabled +
                '}';
    }
}
