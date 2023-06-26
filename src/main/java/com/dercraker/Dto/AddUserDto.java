package com.dercraker.Dto;

import java.sql.Date;

public class AddUserDto {
    private String FirstName;
    private String Lastname;
    private Date BirthDay;
    private String Sex;

    public AddUserDto(String firstName, String lastname, Date birthDay, String sex) {
        FirstName = firstName;
        Lastname = lastname;
        BirthDay = birthDay;
        Sex = sex;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
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
}
