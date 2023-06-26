package com.dercraker.repository;

import com.dercraker.models.UserInformation;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.InsertOneResult;
import org.bson.Document;

import static com.dercraker.mapper.UserMapper.UserToDocument;

public class UserRepository implements IUserRepository{
    private MongoCollection<Document> Collection;

    public UserRepository(MongoCollection<Document> collection) {
        Collection = collection;
    }

    @Override
    public InsertOneResult Add(UserInformation userInformation) {
        return Collection.insertOne(UserToDocument(userInformation));
    }
}
