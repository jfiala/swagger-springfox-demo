package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.Map;
import java.util.HashMap;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-25T20:06:58.230+01:00")
public class ModelMap extends HashMap<String, Object>  {
  

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelMap {\n");
    sb.append("    ").append(StringUtil.toIndentedString(super.toString())).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
