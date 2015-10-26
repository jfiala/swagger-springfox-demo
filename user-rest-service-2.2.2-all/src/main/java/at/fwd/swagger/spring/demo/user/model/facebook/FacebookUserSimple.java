package at.fwd.swagger.spring.demo.user.model.facebook;

import io.swagger.annotations.ApiModelProperty;

/**
 * TODO: complete api
 * 
 * @author johannes.fiala@fwd.at
 *
 */
public class FacebookUserSimple {

	@ApiModelProperty(notes="Page ID. No access token is required to access this field")
	Long id;
	
	@ApiModelProperty(notes="Information about the Page")
	String name;
	
	String about;
	
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

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFounded() {
		return founded;
	}

	public void setFounded(String founded) {
		this.founded = founded;
	}

	String description;
	
	String founded;
		
}
