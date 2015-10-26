package at.fwd.swagger.spring.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * 
 **/
@ApiModel(description = "")
public class FacebookMetadata  {
  
  private List<FacebookField> fields = new ArrayList<FacebookField>() ;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("fields")
  public List<FacebookField> getFields() {
    return fields;
  }
  public void setFields(List<FacebookField> fields) {
    this.fields = fields;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacebookMetadata {\n");
    
    sb.append("  fields: ").append(fields).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


