package at.fwd.swagger.spring.demo.simple.minimum;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * User object (shows long, String, enum, Byte[])
 * 
 * @author johannes.fiala@fwd.at
 *
 */
public class MinimumUser {

	 private long id;
    
    private String firstname;
    
    private String lastname;
   
    private MinimumState state;
    
    
    public MinimumUser() {
    	
    }
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public MinimumState getState() {
		return state;
	}

	public void setState(MinimumState state) {
		this.state = state;
	}
	


    
    
}

