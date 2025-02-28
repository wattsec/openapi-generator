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
import java.util.List;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0-SNAPSHOT")
public class ArrayAnyOf extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ArrayAnyOf.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ArrayAnyOf.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ArrayAnyOf' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Integer> adapterInteger = gson.getDelegateAdapter(this, TypeToken.get(Integer.class));

            final Type typeInstanceListString = new TypeToken<List<String>>(){}.getType();
            final TypeAdapter<List<String>> adapterListString = (TypeAdapter<List<String>>) gson.getDelegateAdapter(this, TypeToken.get(typeInstanceListString));

            return (TypeAdapter<T>) new TypeAdapter<ArrayAnyOf>() {
                @Override
                public void write(JsonWriter out, ArrayAnyOf value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `Integer`
                    if (value.getActualInstance() instanceof Integer) {
                        JsonPrimitive primitive = adapterInteger.toJsonTree((Integer)value.getActualInstance()).getAsJsonPrimitive();
                        elementAdapter.write(out, primitive);
                        return;
                    }
                    // check if the actual instance is of the type `List<String>`
                    if (value.getActualInstance() instanceof List<?>) {
                        JsonPrimitive primitive = adapterListString.toJsonTree((List<String>)value.getActualInstance()).getAsJsonPrimitive();
                        elementAdapter.write(out, primitive);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: Integer, List<String>");
                }

                @Override
                public ArrayAnyOf read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize Integer
                    try {
                        // validate the JSON object to see if any exception is thrown
                        if (!jsonElement.getAsJsonPrimitive().isNumber()) {
                            throw new IllegalArgumentException(String.format("Expected json element to be of type Number in the JSON string but got `%s`", jsonElement.toString()));
                        }
                        actualAdapter = adapterInteger;
                        ArrayAnyOf ret = new ArrayAnyOf();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Integer failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Integer'", e);
                    }
                    // deserialize List<String>
                    try {
                        // validate the JSON object to see if any exception is thrown
                        if (!jsonElement.isJsonArray()) {
                            throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
                        }

                        JsonArray array = jsonElement.getAsJsonArray();
                        // validate array items
                        for(JsonElement element : array) {
                            if (!element.getAsJsonPrimitive().isString()) {
                                throw new IllegalArgumentException(String.format("Expected array items to be of type String in the JSON string but got `%s`", jsonElement.toString()));
                            }
                        }
                        actualAdapter = adapterListString;
                        ArrayAnyOf ret = new ArrayAnyOf();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for List<String> failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'List<String>'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for ArrayAnyOf: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ArrayAnyOf() {
        super("anyOf", Boolean.FALSE);
    }

    public ArrayAnyOf(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Integer", Integer.class);
        schemas.put("List<String>", List.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ArrayAnyOf.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * Integer, List<String>
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof Integer) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof List<?>) {
            List<?> list = (List<?>) instance;
            if (list.get(0) instanceof String) {
                super.setActualInstance(instance);
                return;
            }
        }

        throw new RuntimeException("Invalid instance type. Must be Integer, List<String>");
    }

    /**
     * Get the actual instance, which can be the following:
     * Integer, List<String>
     *
     * @return The actual instance (Integer, List<String>)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Integer`. If the actual instance is not `Integer`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Integer`
     * @throws ClassCastException if the instance is not `Integer`
     */
    public Integer getInteger() throws ClassCastException {
        return (Integer)super.getActualInstance();
    }

    /**
     * Get the actual instance of `List<String>`. If the actual instance is not `List<String>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<String>`
     * @throws ClassCastException if the instance is not `List<String>`
     */
    public List<String> getListString() throws ClassCastException {
        return (List<String>)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ArrayAnyOf
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with Integer
        try {
            if (!jsonElement.getAsJsonPrimitive().isNumber()) {
                throw new IllegalArgumentException(String.format("Expected json element to be of type Number in the JSON string but got `%s`", jsonElement.toString()));
            }
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Integer failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with List<String>
        try {
            if (!jsonElement.isJsonArray()) {
                throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
            }
            JsonArray array = jsonElement.getAsJsonArray();
            // validate array items
            for(JsonElement element : array) {
                if (!element.getAsJsonPrimitive().isString()) {
                    throw new IllegalArgumentException(String.format("Expected array items to be of type String in the JSON string but got `%s`", jsonElement.toString()));
                }
            }
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for List<String> failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for ArrayAnyOf with anyOf schemas: Integer, List<String>. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of ArrayAnyOf given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ArrayAnyOf
     * @throws IOException if the JSON string is invalid with respect to ArrayAnyOf
     */
    public static ArrayAnyOf fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ArrayAnyOf.class);
    }

    /**
     * Convert an instance of ArrayAnyOf to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

