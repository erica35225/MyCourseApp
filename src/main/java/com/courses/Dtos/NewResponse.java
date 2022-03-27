package com.courses.Dtos;

import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

//package com.courses.Dtos;
//
//import com.fasterxml.jackson.annotation.*;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//        "id",
//        "email",
//        "first_name",
//        "last_name"
//})
//public class Data {
//
//    @JsonProperty("id")
//    private Integer id;
//    @JsonProperty("email")
//    private String email;
//    @JsonProperty("first_name")
//    private String firstName;
//    @JsonProperty("last_name")
//    private String lastName;
//    @JsonIgnore
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
//
//    @JsonProperty("id")
//    public Integer getId() {
//        return id;
//    }
//
//    @JsonProperty("id")
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    @JsonProperty("email")
//    public String getEmail() {
//        return email;
//    }
//
//    @JsonProperty("email")
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    @JsonProperty("first_name")
//    public String getFirstName() {
//        return firstName;
//    }
//
//    @JsonProperty("first_name")
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    @JsonProperty("last_name")
//    public String getLastName() {
//        return lastName;
//    }
//
//    @JsonProperty("last_name")
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
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
//    public String value;
//
//    public void setValue(String value) {
//        this.value = value;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//}
@Configuration
@NoArgsConstructor
public class NewResponse {
    List<UserInfo> users;
    boolean hasFile;

    public NewResponse(List<UserInfo> users, boolean hasFile) {
        this.users = users;
        this.hasFile = hasFile;
    }

    public void setUsers(List<UserInfo> users) {
        this.users = users;
    }

    public void setHasFile(boolean hasFile) {
        this.hasFile = hasFile;
    }

    public List<UserInfo> getUsers() {
        return users;
    }

    public boolean isHasFile() {
        return hasFile;
    }
}