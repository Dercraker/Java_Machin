package com.dercraker.models;

import org.bson.types.ObjectId;

import java.sql.Date;
import java.util.UUID;

public class Activity {
    private ObjectId ActivityId;
    private String Name;
    private Date ActivityDate;
    private Double RPE;
    private Long Duration;
    private Double Charge;

    public Activity(String name, Date activityDate, Double RPE, Long duration, Double charge) {
        Name = name;
        ActivityDate = activityDate;
        this.RPE = RPE;
        Duration = duration;
        Charge = charge;
    }

    public Activity(ObjectId activityId, String name, Date activityDate, Double RPE, Long duration, Double charge) {
        ActivityId = activityId;
        Name = name;
        ActivityDate = activityDate;
        this.RPE = RPE;
        Duration = duration;
        Charge = charge;
    }

    public ObjectId getActivityId() {
        return ActivityId;
    }

    public void setActivityId(ObjectId activityId) {
        ActivityId = activityId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getActivityDate() {
        return ActivityDate;
    }

    public void setActivityDate(Date activityDate) {
        ActivityDate = activityDate;
    }

    public Double getRPE() {
        return RPE;
    }

    public void setRPE(Double RPE) {
        this.RPE = RPE;
    }

    public Long getDuration() {
        return Duration;
    }

    public void setDuration(Long duration) {
        Duration = duration;
    }

    public Double getCharge() {
        return Charge;
    }

    public void setCharge(Double charge) {
        Charge = charge;
    }

}
