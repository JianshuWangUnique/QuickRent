package quickRent.variable;

import javax.persistence.*;

@Entity
@Table(name = "Room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //租用户的ID
    @Column(name = "rentUser")
    private Integer rentUser;

    @Column(name = "price")
    private Integer price;

    @Column(name = "place")
    private String place;

    @Column(name = "distance")
    private Integer distance;

    //是否被预定
    @Column(name = "status")
    private Integer status;

    //是否被审核
    @Column(name = "checked")
    private Integer checked;

    public Integer getId() {
        return id;
    }

    @OneToOne(cascade=CascadeType.ALL,optional=true)
    @JoinColumn(name="userID")
    public Integer getRentUser() {
        return rentUser;
    }

    public Integer getPrice() {
        return price;
    }

    public String getPlace() {
        return place;
    }

    public Integer getDistance() {
        return distance;
    }

    public Integer getStatus() {
        return status;
    }

    public Integer getChecked() {
        return checked;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRentUser(Integer rentUser) {
        this.rentUser = rentUser;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setChecked(Integer checked) {
        this.checked = checked;
    }
}
