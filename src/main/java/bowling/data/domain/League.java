package bowling.data.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: Dan
 * Date: 3/12/12
 * Time: 7:53 PM
 *
 */

/**
 * For a complete reference see
 * <a href="http://docs.jboss.org/hibernate/stable/annotations/reference/en/html_single/">
 * Hibernate Annotations Communit Documentations</a>
 */

@Entity
@Table(name = "League")
public class League implements Serializable {

    private Long id;
    private String name;
    private Date startDt;
    private String externalId;

    @OneToMany
    private Set<Team> teams;

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "start_dt")
    public Date getStartDt() {
        return startDt;
    }

    public void setStartDt(Date startDt) {
        this.startDt = startDt;
    }

    @Column(name = "external_id")
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }
}
