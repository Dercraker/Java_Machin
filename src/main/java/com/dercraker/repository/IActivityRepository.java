package com.dercraker.repository;

import com.dercraker.models.Activity;
import com.mongodb.client.result.InsertOneResult;

public interface IActivityRepository {
    InsertOneResult Add(Activity activity);
}
