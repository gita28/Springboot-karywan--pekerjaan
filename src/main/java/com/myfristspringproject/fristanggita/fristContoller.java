package com.myfristspringproject.fristanggita;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

@RestController
public class fristContoller {

    @Autowired
    private userRepo UserRepo;

    @GetMapping
    public String frist_apiString(){

return "Welcome to Spring bot"

}

@GetMapping(value="/user")
public List<user> getUser(){
return UserRepo.findAll();

}

@PostMapping(value="/save")
public String saveUser (User user) {
    UserRepo.save (user);
    return "Saved...";
}

@PutMapping(value ="update/{id}")
public String updateUser (@PathVariable long id, @RequestBody User user){
  User updateUser = UserRepo. fidById(id).get();
  updateUser.setFristName(user.getfristName)();
  updateUser.setLastName(user.lastName)
  updateUser.setOccupation (user.getOccupation)
  updateUser.setAge (User.getAge());
  UserRepo.save (updateUser);
  return "update...";
}

@DeleteMapping (value = "/delte/id")
public String deleteUser =UserRepo.findByid(id).get();
userRepo.delte(deleteUser);
return "delte user with the id: "+id;


}
