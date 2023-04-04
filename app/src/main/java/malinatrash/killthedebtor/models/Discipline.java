package malinatrash.killthedebtor.models;


import java.io.Serializable;
import java.util.ArrayList;

public class Discipline implements Serializable {
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    private ArrayList<Group> groups;
    private String imageURL;

    public Discipline(String title, String imageURL, ArrayList<Group> groups) {
        this.title = title;
        this.groups = groups;
        this.imageURL = imageURL;
    }

    public Discipline() {
    }

    public String getTitle() {
        return title;
    }

    public String getImageURL() {
        return imageURL;
    }

    public int getGroupsCount() {
        return groups.size();
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }
}