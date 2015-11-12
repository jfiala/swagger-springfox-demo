package at.fwd.swagger.spring.demo.user.model.facebook;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



public class FacebookUser   {

	@NotNull
	@Min(value=1)
	@Max(value=Long.MAX_VALUE)
	Long id;
	
	@NotNull
	@Size(min=5, max=100)
	@ApiModelProperty(notes="...")
	String name;

	Location location;
	
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	  

}
