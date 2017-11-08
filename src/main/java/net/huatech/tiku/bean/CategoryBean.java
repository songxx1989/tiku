package net.huatech.tiku.bean;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class CategoryBean {
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
        return "CategoryBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
