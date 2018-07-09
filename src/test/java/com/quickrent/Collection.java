package quickRent.variable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Collection {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer user;

    private Integer room;

    public Integer getId() {
        return id;
    }

    public Integer getUser() {
        return user;
    }

    public Integer getRoom() {
        return room;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }
}


