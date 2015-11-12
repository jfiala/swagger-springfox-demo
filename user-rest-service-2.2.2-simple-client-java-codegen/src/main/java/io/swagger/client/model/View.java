package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-12T11:09:43.855+01:00")
public class View   {
  
  private String contentType = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("contentType")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class View {\n");
    
    sb.append("    contentType: ").append(StringUtil.toIndentedString(contentType)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
