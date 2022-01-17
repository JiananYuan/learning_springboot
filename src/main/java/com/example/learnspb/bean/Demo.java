package com.example.learnspb.bean;

import javax.persistence.*;

@Entity
@Table(name = "DEMO", schema = "ROOT")
public class Demo {

    @Id
    @GeneratedValue
    private long id;//主键.

    @Column(name = "name")
    private String name;//测试名称.

    public Demo() {
        super();
    }

    public Demo(String name) {
        super();
        // this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
