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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.*;
import io.github.threetenjaxb.core.*;

/**
 * Order
 */
@JsonPropertyOrder({
  Order.JSON_PROPERTY_ID,
  Order.JSON_PROPERTY_PET_ID,
  Order.JSON_PROPERTY_QUANTITY,
  Order.JSON_PROPERTY_SHIP_DATE,
  Order.JSON_PROPERTY_STATUS,
  Order.JSON_PROPERTY_COMPLETE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0-SNAPSHOT")
@XmlRootElement(name = "Order")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "Order")
public class Order {
  public static final String JSON_PROPERTY_ID = "id";
  @XmlElement(name = "id")
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_PET_ID = "petId";
  @XmlElement(name = "petId")
  @javax.annotation.Nullable
  private Long petId;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  @XmlElement(name = "quantity")
  @javax.annotation.Nullable
  private Integer quantity;

  public static final String JSON_PROPERTY_SHIP_DATE = "shipDate";
  @XmlElement(name = "shipDate")
  @XmlJavaTypeAdapter(OffsetDateTimeXmlAdapter.class)
  @javax.annotation.Nullable
  private OffsetDateTime shipDate;

  /**
   * Order Status
   */
  @XmlType(name="StatusEnum")
  @XmlEnum(String.class)
  public enum StatusEnum {
    @XmlEnumValue("placed")
    PLACED(String.valueOf("placed")),
    
    @XmlEnumValue("approved")
    APPROVED(String.valueOf("approved")),
    
    @XmlEnumValue("delivered")
    DELIVERED(String.valueOf("delivered"));

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  @XmlElement(name = "status")
  @javax.annotation.Nullable
  private StatusEnum status;

  public static final String JSON_PROPERTY_COMPLETE = "complete";
  @XmlElement(name = "complete")
  @javax.annotation.Nullable
  private Boolean complete = false;

  public Order() {
  }

  public Order id(@javax.annotation.Nullable Long id) {
    
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "id")

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "id")
  public void setId(@javax.annotation.Nullable Long id) {
    this.id = id;
  }

  public Order petId(@javax.annotation.Nullable Long petId) {
    
    this.petId = petId;
    return this;
  }

  /**
   * Get petId
   * @return petId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "petId")

  public Long getPetId() {
    return petId;
  }


  @JsonProperty(JSON_PROPERTY_PET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "petId")
  public void setPetId(@javax.annotation.Nullable Long petId) {
    this.petId = petId;
  }

  public Order quantity(@javax.annotation.Nullable Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "quantity")

  public Integer getQuantity() {
    return quantity;
  }


  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "quantity")
  public void setQuantity(@javax.annotation.Nullable Integer quantity) {
    this.quantity = quantity;
  }

  public Order shipDate(@javax.annotation.Nullable OffsetDateTime shipDate) {
    
    this.shipDate = shipDate;
    return this;
  }

  /**
   * Get shipDate
   * @return shipDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIP_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "shipDate")

  public OffsetDateTime getShipDate() {
    return shipDate;
  }


  @JsonProperty(JSON_PROPERTY_SHIP_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "shipDate")
  public void setShipDate(@javax.annotation.Nullable OffsetDateTime shipDate) {
    this.shipDate = shipDate;
  }

  public Order status(@javax.annotation.Nullable StatusEnum status) {
    
    this.status = status;
    return this;
  }

  /**
   * Order Status
   * @return status
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "status")

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "status")
  public void setStatus(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
  }

  public Order complete(@javax.annotation.Nullable Boolean complete) {
    
    this.complete = complete;
    return this;
  }

  /**
   * Get complete
   * @return complete
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "complete")

  public Boolean getComplete() {
    return complete;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "complete")
  public void setComplete(@javax.annotation.Nullable Boolean complete) {
    this.complete = complete;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.petId, order.petId) &&
        Objects.equals(this.quantity, order.quantity) &&
        Objects.equals(this.shipDate, order.shipDate) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.complete, order.complete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, petId, quantity, shipDate, status, complete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    petId: ").append(toIndentedString(petId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
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

