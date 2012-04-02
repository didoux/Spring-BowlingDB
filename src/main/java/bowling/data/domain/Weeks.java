

/**
 * Created by IntelliJ IDEA.
 * User: pnamatya
 * Date: 4/1/12
 * Time: 9:28 PM
 * To change this template use File | Settings | File Templates.
 */
package bowling.data.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: pnamatya
 * Date: 4/1/12
 * Time: 6:49 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="weeks")
public class Weeks implements Serializable {
    public Long id;
    private int weekNumber;
    private Date dateTime;
    private Team team;

    @Id
    @Column(name =  "id")
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "weekNumber")
    public int getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(int number) {
        this.weekNumber = number;
    }

    @Column(name = "dateTime")
    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    @ManyToOne
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
