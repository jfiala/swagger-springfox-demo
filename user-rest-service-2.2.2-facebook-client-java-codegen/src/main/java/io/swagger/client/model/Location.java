package io.swagger.client.model;

import io.swagger.client.StringUtil;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-12T12:51:40.668+01:00")
public class Location   {
  


  private String city = null;


  private String country = null;


  private Float latitude = null;


  private Float longitude = null;


  private String name = null;


  private String region = null;


  private String state = null;


  private String street = null;


  private String zip = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("city")
  
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("country")
  
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("latitude")
  
  public Float getLatitude() {
    return latitude;
  }
  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("longitude")
  
  public Float getLongitude() {
    return longitude;
  }
  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("region")
  
  public String getRegion() {
    return region;
  }
  public void setRegion(String region) {
    this.region = region;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("state")
  
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("street")
  
  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("zip")
  
  public String getZip() {
    return zip;
  }
  public void setZip(String zip) {
    this.zip = zip;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    city: ").append(StringUtil.toIndentedString(city)).append("\n");
    sb.append("    country: ").append(StringUtil.toIndentedString(country)).append("\n");
    sb.append("    latitude: ").append(StringUtil.toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(StringUtil.toIndentedString(longitude)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    region: ").append(StringUtil.toIndentedString(region)).append("\n");
    sb.append("    state: ").append(StringUtil.toIndentedString(state)).append("\n");
    sb.append("    street: ").append(StringUtil.toIndentedString(street)).append("\n");
    sb.append("    zip: ").append(StringUtil.toIndentedString(zip)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
