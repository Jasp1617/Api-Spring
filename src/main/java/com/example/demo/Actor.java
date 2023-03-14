package com.example.demo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;


@Entity
@Table(name = "actor")
public class Actor {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "actor_id")
Integer id;
@Column(name = "first_name")
String  firstName;
@Column(name = "last_name")
String lastName ;

public Actor() {
}

public Integer getId() {
    return id;
}
public void setId(Integer id) {
    this.id = id;
}
public String getFirstName() {
    return firstName;
}
public void setFirstName(String firstName) {
    this.firstName = firstName;
}
public String getLastName() {
    return lastName;
}
public void setLastName(String lastName) {
    this.lastName = lastName;
}
 

}
