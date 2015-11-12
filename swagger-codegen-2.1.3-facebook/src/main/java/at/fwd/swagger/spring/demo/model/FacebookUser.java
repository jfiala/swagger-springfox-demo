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
  
  private FacebookMetadata metadata = null;

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

public FacebookMetadata getMetadata() {
	return metadata;
}

public void setMetadata(FacebookMetadata metadata) {
	this.metadata = metadata;
}
  
  
}


