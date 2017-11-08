package net.huatech.tiku.bean;

import javax.persistence.*;

@Entity
@Table(name = "question")
public class QuestionBean {
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private int cid;

    @Column(nullable = false)
    private int lid;

    @Column(nullable = false)
    private String text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "QuestionBean{" +
                "id=" + id +
                ", cid=" + cid +
                ", lid=" + lid +
                ", text='" + text + '\'' +
                '}';
    }
}
