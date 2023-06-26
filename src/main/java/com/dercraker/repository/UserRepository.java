package com.dercraker.repository;

import com.dercraker.Dto.UpdateUserDto;
import com.dercraker.mapper.UserMapper;
import com.dercraker.models.UserInformation;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;
import org.bson.Document;

import java.sql.Date;

import static com.dercraker.mapper.UserMapper.DocumentToUser;
import static com.dercraker.mapper.UserMapper.UserToDocument;

public class UserRepository implements IUserRepository {

    private MongoCollection<Document> Collection;

    public UserRepository(MongoCollection<Document> collection) {
        Collection = collection;
    }

    @Override
    public InsertOneResult Add(UserInformation userInformation) {
        return Collection.insertOne(UserToDocument(userInformation));
    }

    @Override
    public UserInformation GetUserInformation() {
        Document userDocument = Collection.find().first();
        return DocumentToUser(userDocument);
    }

    @Override
    public DeleteResult Delete(UserInformation user) {
        return Collection.deleteOne(UserToDocument(user));
    }

}
