package com.dercraker.Dto;

import org.bson.types.ObjectId;

import java.util.Date;

public class UpdateUserDto {
    private ObjectId Userid;
    private String FirstName;
    private String LastName;
    private Date BirthDate;
    private String Sex;

    public UpdateUserDto(ObjectId userid, String firstName, String lastName, Date birthDate, String sex) {
        Userid = userid;
        FirstName = firstName;
        LastName = lastName;
        BirthDate = birthDate;
        Sex = sex;
    }

    public ObjectId getUserid() {
        return Userid;
    }

    public void setUserid(ObjectId userid) {
        Userid = userid;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }
}
