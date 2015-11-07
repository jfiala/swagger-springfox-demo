package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.View;
import java.util.Map;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-07T12:33:00.957+01:00")
public class ModelAndView   {
  
  private Boolean empty = null;
  private Object model = null;
  private Map<String, Object> modelMap = new HashMap<String, Object>();
  private Boolean reference = null;
  private View view = null;
  private String viewName = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("empty")
  public Boolean getEmpty() {
    return empty;
  }
  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("model")
  public Object getModel() {
    return model;
  }
  public void setModel(Object model) {
    this.model = model;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("modelMap")
  public Map<String, Object> getModelMap() {
    return modelMap;
  }
  public void setModelMap(Map<String, Object> modelMap) {
    this.modelMap = modelMap;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("reference")
  public Boolean getReference() {
    return reference;
  }
  public void setReference(Boolean reference) {
    this.reference = reference;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("view")
  public View getView() {
    return view;
  }
  public void setView(View view) {
    this.view = view;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("viewName")
  public String getViewName() {
    return viewName;
  }
  public void setViewName(String viewName) {
    this.viewName = viewName;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAndView {\n");
    
    sb.append("    empty: ").append(StringUtil.toIndentedString(empty)).append("\n");
    sb.append("    model: ").append(StringUtil.toIndentedString(model)).append("\n");
    sb.append("    modelMap: ").append(StringUtil.toIndentedString(modelMap)).append("\n");
    sb.append("    reference: ").append(StringUtil.toIndentedString(reference)).append("\n");
    sb.append("    view: ").append(StringUtil.toIndentedString(view)).append("\n");
    sb.append("    viewName: ").append(StringUtil.toIndentedString(viewName)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
