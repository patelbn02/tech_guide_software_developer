package root.models;

import javax.persistence.*;

/**
 * Created by Neil Bharat Patel on 08/11/2016.
 * This is the Technology Stack Model
 */
@Entity
@Table(name = "tech_stack")
public class TechStack {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false)
    private String title;

    public void setId(Integer newId) {
        id = newId;
    }

    public Integer getId() {
        return id;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public String getTitle() {
        return title;
    }
}
