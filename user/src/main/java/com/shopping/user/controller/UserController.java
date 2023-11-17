package com.shopping.user.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.shopping.user.entity.User;
import com.shopping.user.service.Userservice;

@RestController
public class UserController {
@Autowired
Userservice userService;
// http://localhost:8071/user - Post
@RequestMapping("/addshopping")
@PostMapping
public User addUser(@RequestBody User user)
{
return userService.save(user);
}
@GetMapping(path="/{id}")
public User getUser(@PathVariable long id)
{
return userService.getUser(id);
}
@PutMapping(path="/{id}")
public User updateUser(@RequestBody User user, @PathVariable long id)
{
return userService.update(id,user);
}
@DeleteMapping(path="/{id}")
public String deleteUser(@PathVariable long id)
{
return userService.delete(id); 
}
// http://localhost:8071/user Get
@GetMapping
public List<User> getAllUser()
{
return userService.getUserlist();
}
}