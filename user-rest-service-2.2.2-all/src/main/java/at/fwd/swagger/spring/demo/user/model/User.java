package at.fwd.swagger.spring.demo.user.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import at.fwd.swagger.spring.demo.user.model.showcase.ShowcaseDatatypeDate;
import at.fwd.swagger.spring.demo.user.model.showcase.ShowcaseDatatypeMath;
import at.fwd.swagger.spring.demo.user.model.showcase.ShowcaseDatatypePrimitives;

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
    
    @ApiModelProperty(notes = "Name of the user", required = true, position = 1)
	private String name;
    
    // TODO Swagger-Springfox-2.0.0: Strange behaviour after added @ApiModelProperty to enum attribute
    // BEFORE: "state":{"type":"string","enum":["ACTIVE","DISABLED"]}
    // AFTER: "state":{"type":"string","description":"Current state"}
    @ApiModelProperty(notes = "Current state")
    private State state;
    
    @JsonIgnore
	private String hiddenString;
   
    @ApiModelProperty(notes="demo for java.lang.Byte[]")
    private Byte[] photo;
    
    @ApiModelProperty(notes="demo for java.util.List")
    private List<Category> categories;
    
    private List<Location> locations;
    
    @ApiModelProperty(notes="demo for java.util.Map")
    private Map<String, Location> locationMap;
    


    private ShowcaseDatatypePrimitives primitives;
    
    private ShowcaseDatatypeMath math;
    
    private ShowcaseDatatypeDate date;
    
    public User() {
    	categories = new ArrayList<Category>();
    	locations = new ArrayList<Location>();
    	locationMap = new HashMap<String, Location>();
    }
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHiddenString() {
		return hiddenString;
	}
	public void setHiddenString(String hiddenString) {
		this.hiddenString = hiddenString;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public Byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(Byte[] photo) {
		this.photo = photo;
	}
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}


	public List<Location> getLocations() {
		return locations;
	}

	public Map<String, Location> getLocationMap() {
		return locationMap;
	}

	public void setLocationMap(Map<String, Location> locationMap) {
		this.locationMap = locationMap;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

	public ShowcaseDatatypePrimitives getPrimitives() {
		return primitives;
	}

	public void setPrimitives(ShowcaseDatatypePrimitives primitives) {
		this.primitives = primitives;
	}

	public ShowcaseDatatypeMath getMath() {
		return math;
	}

	public void setMath(ShowcaseDatatypeMath math) {
		this.math = math;
	}

	public ShowcaseDatatypeDate getDate() {
		return date;
	}

	public void setDate(ShowcaseDatatypeDate date) {
		this.date = date;
	}

    
    
    
}

