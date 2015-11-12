package at.fwd.swagger.spring.demo.simple.minimum;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * User object (shows long, String, enum, Byte[])
 * 
 * @author johannes.fiala@fwd.at
 *
 */
public class MinimumUser {

	private long id;
    
	@NotNull
    private String firstname;
    
	@Min(value=5)
	@Max(value=10)
    private String lastname;
   
    private MinimumState state;
   
    private String location;
    
    
   

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

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

