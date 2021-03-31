package com.digital.innovation.one.heroesApi.models;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import org.springframework.data.annotation.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@DynamoDBTable(tableName ="Heroes_Table")
public class Hero {

    @Id
    @DynamoDBAutoGeneratedKey
    @DynamoDBHashKey (attributeName = "id")
    private String id;

    @DynamoDBAttribute (attributeName = "name")
    private String name;

    @DynamoDBAttribute (attributeName = "universe")
    private String universe;

    @DynamoDBAttribute (attributeName = "place_of_origin")
    private String place_of_origin;

    @DynamoDBAttribute (attributeName = "identity_is_secret")
    private Boolean identity_is_secret;

    //Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public String getPlace_of_origin() {
        return place_of_origin;
    }

    public void setPlace_of_origin(String place_of_origin) {
        this.place_of_origin = place_of_origin;
    }

    public Boolean getIdentity_is_secret() {
        return identity_is_secret;
    }

    public void setIdentity_is_secret(Boolean identity_is_secret) {
        this.identity_is_secret = identity_is_secret;
    }



    //Constructor

    public Hero(String name, String universe, String place_of_origin, Boolean identity_is_secret) {
        this.name = name;
        this.universe = universe;
        this.place_of_origin = place_of_origin;
        this.identity_is_secret = identity_is_secret;
    }

}