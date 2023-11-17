package com.shopping.user.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="users")
public class User{
@Id
@GeneratedValue
long id;
String name;
String type; 
String password; 

public User(long id, String name, String type, String password) {
	super();
	this.id = id;
	this.name = name;
	this.type = type;
	this.password = password;
}
//public User(long id,String name,String type,String password) {
//super();
//}
public long getId() {
return id;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
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
public String getType() {
return type;
}
public void setType(String type) {
this.type = type;
}
public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}
}

