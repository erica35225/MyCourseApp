package com.courses.Dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

//
//
//package com.courses.Dtos;
//
//import java.util.HashMap;
//import java.util.Map;
//import javax.annotation.Generated;
//
//import com.fasterxml.jackson.annotation.JsonAnyGetter;
//import com.fasterxml.jackson.annotation.JsonAnySetter;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import com.fasterxml.jackson.annotation.JsonPropertyOrder;
//
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//        "data"
//})
//@Generated("jsonschema2pojo")
//public class UsersDto {
//
//    @JsonProperty("data")
//    private Data data;
//    @JsonIgnore
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
//
//    @JsonProperty("data")
//    public Data getData() {
//        return data;
//    }
//
//    @JsonProperty("data")
//    public void setData(Data data) {
//        this.data = data;
//    }
//
//    @JsonAnyGetter
//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    @JsonAnySetter
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }
//
//}
public class UsersDto{
    @JsonProperty("data")
    private List<UserInfo> records;

    public void setRecords(List<UserInfo> records) {
        this.records = records;
    }

    public List<UserInfo> getRecords() {
        return records;
    }
}