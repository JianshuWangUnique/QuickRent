package quickRent.variable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    @JoinColumn(nullable = false)
    private String userName;

    @JoinColumn(nullable = false)
    private String password;

    private Integer power;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getId() {
        return id;
    }

    public Integer getPower() {
        return power;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }
}
