/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.client.model.Animal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Cat
 */
@JsonPropertyOrder({
  Cat.JSON_PROPERTY_DECLAWED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0-SNAPSHOT")
@JsonIgnoreProperties(
  value = "className", // ignore manually set className, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the className to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "className", visible = true)

public class Cat extends Animal {
  public static final String JSON_PROPERTY_DECLAWED = "declawed";
  @javax.annotation.Nullable
  private Boolean declawed;

  public Cat() {

  }

  public Cat declawed(@javax.annotation.Nullable Boolean declawed) {
    
    this.declawed = declawed;
    return this;
  }

  /**
   * Get declawed
   * @return declawed
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DECLAWED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isDeclawed() {
    return declawed;
  }


  @JsonProperty(JSON_PROPERTY_DECLAWED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeclawed(@javax.annotation.Nullable Boolean declawed) {
    this.declawed = declawed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cat cat = (Cat) o;
    return Objects.equals(this.declawed, cat.declawed) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(declawed, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cat {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    declawed: ").append(toIndentedString(declawed)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

