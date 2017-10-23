package cn.ico.boot.entity;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name="disc_type")
public abstract class Employee {
    @Id
    protected Integer employeeId;
}
