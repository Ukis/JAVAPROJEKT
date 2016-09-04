package projekt.model;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Łukasz on 2016-09-03.
 */
@Data
@Entity
public class Movie {

    @Id
    @GeneratedValue
    private Long id;

    @Size(min = 2, max = 50)
    private String title;


    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "movies")
    private Set<User> users = new HashSet<>();


    @Size(min = 2, max = 50)
    private String polishTitle;

    private Integer duration;

    private Integer year;

    private URL posterURL;

    private URL websiteURL;

    private Float rate;

    private Integer votes;

    private String genre;

    private String countries;

    private String plot;
}
