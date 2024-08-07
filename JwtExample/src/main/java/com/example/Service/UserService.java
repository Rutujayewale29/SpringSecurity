package com.example.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.Entity.User;

@Service
public class UserService {
private List<User>list=new ArrayList<>();

public UserService() {
list.add(new User(UUID.randomUUID().toString(),"Rutuja yewale","rutujayewale007@gmail.com"));
list.add(new User(UUID.randomUUID().toString(),"ketan yewale","ky007@gmail.com"));
list.add(new User(UUID.randomUUID().toString(),"RK","rk007@gmail.com"));
list.add(new User(UUID.randomUUID().toString(),"tanmay yewale","Tyewale007@gmail.com"));
list.add(new User(UUID.randomUUID().toString(),"rohini yewale","ryewale007@gmail.com"));

}
public List<User>getUser()
{
	return this.list;
   	
}
}
