package com.example.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class JwtResponse {
private String jwttoken;
private String username;
public String getJwttoken() {
	return jwttoken;
}
public void setJwttoken(String jwttoken) {
	this.jwttoken = jwttoken;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}

}
