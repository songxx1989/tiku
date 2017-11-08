package net.huatech.tiku.bean;

import javax.persistence.*;

@Entity
@Table(name = "level")
public class LevelBean {
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LevelBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
