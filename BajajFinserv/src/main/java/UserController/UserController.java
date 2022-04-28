package UserController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entity.Users;
import Repository.UserRepository;

@RestController
	@RequestMapping("/bajaj/code")
	public class UserController {

	  @Autowired
	  private UserRepository userRepository;

	 
	  @PostMapping("/users")
	  public List<Users> getAllUsers() {
	    return userRepository.findAll();
	  }

	 
	  @PostMapping("/users/{id}")
	  public ResponseEntity<Users> getUsersById(@PathVariable(value = "id") Long userId)
	      throws AttributeNotFoundException {
	    Users user =
	        userRepository
	            .findById(userId)
	            .orElseThrow();
	    return ResponseEntity.ok().body(user);
	  }

	  @PostMapping("/users")
	  public Users createUser(@Validated @RequestBody Users user) {
	    return userRepository.save(user);
	  }

	 
	  @PostMapping("/users/{id}")
	  public ResponseEntity<Users> updateUser(
	      @PathVariable(value = "id") int userId, @Validated @RequestBody Users userDetails)
	      throws AttributeNotFoundException {

	    Users user =
	        userRepository
	            .findById((long) userId)
	            .orElseThrow();

	    user.setEmailid(userDetails.getEmailid());
	    user.setUserId(userDetails.getUserId());
	    user.setStatus(false);
	    user.setCollegeRollNo(userId);
	    
	    
	    final Users updatedUser = userRepository.save(user);
	    return ResponseEntity.ok(updatedUser);
	  }

	  
	 
	}


