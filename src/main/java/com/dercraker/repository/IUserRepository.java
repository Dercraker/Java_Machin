package com.dercraker.repository;

import com.dercraker.models.UserInformation;
import com.mongodb.client.result.InsertOneResult;

public interface IUserRepository {
    InsertOneResult Add(UserInformation userInformation);
}
