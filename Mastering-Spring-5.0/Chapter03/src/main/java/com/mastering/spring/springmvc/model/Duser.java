package com.mastering.spring.springmvc.model;

import java.util.Date;

public class Duser {

    private Date birth;

    private String name;

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return String
                .format("Duser [name=%s, birth=%s]",
                        name, birth);
    }
}
