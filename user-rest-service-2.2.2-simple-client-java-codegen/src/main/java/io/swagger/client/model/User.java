package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.Category;
import java.util.Map;
import io.swagger.client.model.Location;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * User object
 **/
@ApiModel(description = "User object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-25T15:27:58.667+01:00")
public class User   {
  
  private List<Category> categories = new ArrayList<Category>();
  private Long id = null;
  private Map<String, Location> locationMap = new HashMap<String, Location>();
  private List<Location> locations = new ArrayList<Location>();
  private String name = null;
  private List<String> photo = new ArrayList<String>();

public enum StateEnum {
  ACTIVE("ACTIVE"),
  DISABLED("DISABLED");

  private String value;

  StateEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private StateEnum state = null;

  
  /**
   * demo for java.util.List
   **/
  @ApiModelProperty(value = "demo for java.util.List")
  @JsonProperty("categories")
  public List<Category> getCategories() {
    return categories;
  }
  public void setCategories(List<Category> categories) {
    this.categories = categories;
  }

  
  /**
   * ID of the user
   **/
  @ApiModelProperty(required = true, value = "ID of the user")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * demo for java.util.Map
   **/
  @ApiModelProperty(value = "demo for java.util.Map")
  @JsonProperty("locationMap")
  public Map<String, Location> getLocationMap() {
    return locationMap;
  }
  public void setLocationMap(Map<String, Location> locationMap) {
    this.locationMap = locationMap;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("locations")
  public List<Location> getLocations() {
    return locations;
  }
  public void setLocations(List<Location> locations) {
    this.locations = locations;
  }

  
  /**
   * Name of the user
   **/
  @ApiModelProperty(required = true, value = "Name of the user")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * demo for java.lang.Byte[]
   **/
  @ApiModelProperty(value = "demo for java.lang.Byte[]")
  @JsonProperty("photo")
  public List<String> getPhoto() {
    return photo;
  }
  public void setPhoto(List<String> photo) {
    this.photo = photo;
  }

  
  /**
   * Current state
   **/
  @ApiModelProperty(value = "Current state")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    categories: ").append(StringUtil.toIndentedString(categories)).append("\n");
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    locationMap: ").append(StringUtil.toIndentedString(locationMap)).append("\n");
    sb.append("    locations: ").append(StringUtil.toIndentedString(locations)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    photo: ").append(StringUtil.toIndentedString(photo)).append("\n");
    sb.append("    state: ").append(StringUtil.toIndentedString(state)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
