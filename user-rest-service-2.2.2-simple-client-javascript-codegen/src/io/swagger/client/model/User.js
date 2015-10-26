package io.swagger.client.model;

//import .StringUtil;



//import io.swagger.annotations.*;
//import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * User object
 **/
//@ApiModel(description = "User object")
// @javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavascriptClientCodegen", date = "2015-10-26T19:08:42.244+01:00")
public class User  /*  */ {
  
  private String firstname = null;
  private Long id = null;
  private String lastname = null;

  
  /**
   **/
  //@ApiModelProperty(value = "")
  //@JsonProperty("firstname")
  public String getFirstname() {
    return firstname;
  }
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  
  /**
   * ID of the user
   **/
  //@ApiModelProperty(required = true, value = "ID of the user")
  //@JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Name of the user
   **/
  //@ApiModelProperty(required = true, value = "Name of the user")
  //@JsonProperty("lastname")
  public String getLastname() {
    return lastname;
  }
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    firstname: ").append(StringUtil.toIndentedString(firstname)).append("\n");
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    lastname: ").append(StringUtil.toIndentedString(lastname)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
