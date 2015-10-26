package io.swagger.client.model;

//import .StringUtil;



//import io.swagger.annotations.*;
//import com.fasterxml.jackson.annotation.JsonProperty;


//@ApiModel(description = "")
// @javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavascriptClientCodegen", date = "2015-10-26T19:08:42.244+01:00")
public class View  /*  */ {
  
  private String contentType = null;

  
  /**
   **/
  //@ApiModelProperty(value = "")
  //@JsonProperty("contentType")
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
