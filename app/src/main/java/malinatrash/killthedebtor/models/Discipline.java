package malinatrash.killthedebtor.models;


import java.io.Serializable;
import java.util.ArrayList;

public class Discipline implements Serializable {
    private final String title;
    private final ArrayList<Group> groups;
    private final String imageURL;

    public Discipline(String title, String imageURL, ArrayList<Group> groups) {
        this.title = title;
        this.groups = groups;
        this.imageURL = imageURL;
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