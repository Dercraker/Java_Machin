package com.dercraker;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import io.github.cdimascio.dotenv.Dotenv;
import org.bson.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        String connectionString = "";
        Dotenv dotenv = null;
        dotenv = Dotenv.configure().load();

        try (MongoClient mongoClient = MongoClients.create(dotenv.get("ConnectionString"))) {
            List<Document> databases = mongoClient.listDatabases().into(new ArrayList<>());
            databases.forEach(db -> logger.info("", db.toJson()));
        }
    }
}