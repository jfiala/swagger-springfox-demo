package at.fwd.swagger.spring.demo.simple.withdocs;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * User object (shows long, String, enum, Byte[])
 * 
 * @author johannes.fiala@fwd.at
 *
 */
@ApiModel(description="User object")
public class User {

	@ApiModelProperty(notes = "ID of the user", required = true, position = 2)
    private long id;
    
    private String firstname;
    
    @ApiModelProperty(notes = "Name of the user", required = true, position = 1)
    private String lastname;
   
    @ApiModelProperty(notes = "Current state")
    private State state;
    
    
    @JsonIgnore
	private String hiddenString;
    

    public User() {
    	
    }
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getHiddenString() {
		return hiddenString;
	}
	public void setHiddenString(String hiddenString) {
		this.hiddenString = hiddenString;
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

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	


    
    
}

