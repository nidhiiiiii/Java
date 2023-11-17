package com.shopping.user.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shopping.user.entity.User;
import com.shopping.user.repository.UserRepository;
@Service
public class Userservice {
@Autowired
UserRepository userRepository;
public User save(User users)
{
return userRepository.save(users);
}
public User getUser(long id)
{
return userRepository.findById(id).get();
}
public User update(long id,User user)
{
User users =userRepository.findById(id).get();
users.setName(user.getName());
users.setType(user.getType());
users.setPassword(user.getPassword());
return userRepository.save(users);
}
public String delete(long id)
{
userRepository.deleteById(id);
return "Entity with this id is deleted"+id;
}
public List<User> getUserlist()
{
return userRepository.findAll();
}
}
