package pe.chema.fitnowchema.models;

import android.os.Bundle;

import javax.xml.transform.Source;

/**
 * Created by mac on 10/17/17.
 */

public class Workout {
    private int id;
    private String type;
    private int image;
    private String place;
    private String date;
    private String hour_start;
    private String hour_finish;
    private int distance;
    private int members;

    public Workout(int id,String type, int image, String place, String date, String hour_start, String hour_finish, int distance, int members) {
        this.id=id;
        this.type = type;
        this.image = image;
        this.place = place;
        this.date = date;
        this.hour_start = hour_start;
        this.hour_finish = hour_finish;
        this.distance = distance;
        this.members = members;
    }

    public Workout() {
    }

    public int getId() {
        return id;
    }

    public Workout setId(int id) {
        this.id = id;
        return this;
    }

    public int getImage() {
        return image;
    }

    public Workout setImage(int image) {
        this.image = image;
        return this;
    }

    public String getPlace() {
        return place;
    }

    public Workout setPlace(String place) {
        this.place = place;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Workout setDate(String date) {
        this.date = date;
        return this;
    }

    public String getHour_start() {
        return hour_start;
    }

    public Workout setHour_start(String hour_start) {
        this.hour_start = hour_start;
        return this;
    }

    public String getType() {
        return type;
    }

    public Workout setType(String type) {
        this.type = type;
        return this;
    }

    public String getHour_finish() {
        return hour_finish;
    }

    public Workout setHour_finish(String hour_finish) {
        this.hour_finish = hour_finish;
        return this;
    }

    public int getDistance() {
        return distance;
    }

    public Workout setDistance(int distance) {
        this.distance = distance;
        return this;
    }

    public int getMembers() {
        return members;
    }

    public Workout setMembers(int members) {
        this.members = members;
        return this;
    }
}
