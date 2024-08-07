package com.example.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@ToString
public class User {
private String id;
private String name;
private String email;
public User(String id, String name, String email) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
}

}
