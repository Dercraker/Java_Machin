package com.dercraker;

import com.dercraker.models.Activity;
import com.dercraker.models.UserInformation;
import com.dercraker.repository.ActivityRepository;
import com.dercraker.repository.UserRepository;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import io.github.cdimascio.dotenv.Dotenv;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Date;
import java.util.*;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        String connectionString = "";
        Dotenv dotenv = null;
        dotenv = Dotenv.configure().load();

        try (MongoClient mongoClient = MongoClients.create(dotenv.get("ConnectionString"))) {
            MongoDatabase database = mongoClient.getDatabase("BestApplicationever");
            UserRepository userRepository = new UserRepository(database.getCollection("Users"));
            ActivityRepository activityRepository = new ActivityRepository(database.getCollection("Activities"));


            Date dateNow = new Date(1687784335L);

            userRepository.Add(new UserInformation("Antoine","UwU", dateNow, "Homme"));
            activityRepository.Add(new Activity("Vélo", dateNow, 5D, 60L));
        }
    }
}