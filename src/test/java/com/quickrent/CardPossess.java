package quickRent.variable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CardPossess {

    @Id
    @GeneratedValue
    Integer id;

    //用户ID
    Integer user;

    String cardName;

    public Integer getId() {
        return id;
    }

    public Integer getUser() {
        return user;
    }

    public String getCardName() {
        return cardName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
}
