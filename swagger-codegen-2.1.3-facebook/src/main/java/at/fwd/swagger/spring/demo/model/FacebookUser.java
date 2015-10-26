package at.fwd.swagger.spring.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * 
 **/
@ApiModel(description = "")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FacebookUser  {
  
  private Long id = null;
  private String name = null;
  private String about = null;
  private String description = null;
  private String founded = null;
  private FacebookMetadata metadata = null;
  private String fakeProperty = null;
  
  
  /**
   * Page ID. No access token is required to access this field
   **/
  @ApiModelProperty(value = "Page ID. No access token is required to access this field")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Information about the Page
   **/
  @ApiModelProperty(value = "Information about the Page")
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
  @JsonProperty("about")
  public String getAbout() {
    return about;
  }
  public void setAbout(String about) {
    this.about = about;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("founded")
  public String getFounded() {
    return founded;
  }
  public void setFounded(String founded) {
    this.founded = founded;
  }

  
  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("metadata")
  public FacebookMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(FacebookMetadata metadata) {
    this.metadata = metadata;
  }

  
  /**
   * this has been added from generator
   **/
  @ApiModelProperty(value = "this has been added from generator")
  @JsonProperty("fakeProperty")
  public String getFakeProperty() {
    return fakeProperty;
  }
  public void setFakeProperty(String fakeProperty) {
    this.fakeProperty = fakeProperty;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacebookUser {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  about: ").append(about).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  founded: ").append(founded).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("  fakeProperty: ").append(fakeProperty).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


