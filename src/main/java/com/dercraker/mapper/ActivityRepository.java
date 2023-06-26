package com.dercraker.mapper;

import com.dercraker.models.Activity;
import org.bson.Document;

public class ActivityRepository {
    public static Document ActivityToDocument(Activity activity){
        return new Document()
                .append("Name", activity.getName())
                .append("ActivityDate", activity.getActivityDate())
                .append("RPE", activity.getRPE())
                .append("Duration", activity.getDuration())
                .append("Charge", activity.getCharge());
    }
}
