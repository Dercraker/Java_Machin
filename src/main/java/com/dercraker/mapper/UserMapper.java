package com.dercraker.mapper;

import com.dercraker.models.UserInformation;
import org.bson.Document;

public class UserMapper {
    public static Document UserToDocument(UserInformation user){
        return new Document()
                .append("FirstName", user.getFirstName())
                .append("LastName", user.getLastName())
                .append("BirthDay", user.getBirthDay())
                .append("Sex", user.getSex());
    }
}
