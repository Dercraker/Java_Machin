package com.dercraker.models;

import org.bson.types.ObjectId;

import java.util.Date;
import java.util.List;

public class UserInformation {
    private ObjectId UserId;
    private String FirstName;
    private String LastName;
    private Date BirthDay;
    private String Sex;
    private List<Activity> Activities;

    public UserInformation() {
    }

    public UserInformation(ObjectId userId, String firstName, String lastName, Date birthDay, String sex, List<Activity> activities) {

        UserId = userId;
        FirstName = firstName;
        LastName = lastName;
        BirthDay = birthDay;
        Sex = sex;
        Activities = activities;
    }

    public UserInformation(String firstName, String lastName, Date birthDay, String sex) {
        FirstName = firstName;
        LastName = lastName;
        BirthDay = birthDay;
        Sex = sex;
    }

    public ObjectId getUserId() {
        return UserId;
    }

    public void setUserId(ObjectId userId) {
        UserId = userId;
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

    public Date getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(Date birthDay) {
        BirthDay = birthDay;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public List<Activity> getActivities() {
        return Activities;
    }

    public void setActivities(List<Activity> activities) {
        Activities = activities;
    }
}

