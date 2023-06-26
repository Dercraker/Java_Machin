package com.dercraker.repository;

import com.dercraker.Dto.UpdateUserDto;
import com.dercraker.models.UserInformation;
import com.mongodb.client.model.DeleteOneModel;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;

public interface IUserRepository {
    InsertOneResult Add(UserInformation userInformation);
    UserInformation GetUserInformation();

    DeleteResult Delete(UserInformation user);

}
