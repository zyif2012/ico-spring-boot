package cn.ico.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Employee {

    private @Id @GeneratedValue Long id;
    private String name;
    private String detail;

    private Employee(){}

    public Employee(String name, String detail) {
        this.name=name;
        this.detail =detail;
    }
}
