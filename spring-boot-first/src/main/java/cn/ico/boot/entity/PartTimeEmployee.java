package cn.ico.boot.entity;

import javax.persistence.Entity;

@Entity
public class PartTimeEmployee extends Employee {
    protected Float hourlyWage;
}
