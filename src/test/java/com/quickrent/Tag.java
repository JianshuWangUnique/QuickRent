package quickRent.variable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tag {

    @Id
    @GeneratedValue
    private Integer id;

    //房屋编号
    private Integer room;

    //标签名
    private String tagContent;

    public Integer getId() {
        return id;
    }

    public Integer getRoom() {
        return room;
    }

    public String getTagContent() {
        return tagContent;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    public void setTagContent(String tagContent) {
        this.tagContent = tagContent;
    }
}