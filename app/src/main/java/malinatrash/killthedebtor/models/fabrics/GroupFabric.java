package malinatrash.killthedebtor.models.fabrics;

import java.util.ArrayList;
import java.util.Arrays;

import malinatrash.killthedebtor.models.Group;

public class GroupFabric {

    public static GroupFabric shared = new GroupFabric();

    Group ist20_1 = new Group("ИСТб-20-1", StudentFabric.shared.get_ist_20_1_students());
    Group ist20_2 = new Group("ИСТб-20-2", StudentFabric.shared.get_ist_20_2_students());
    Group ist20_3 = new Group("ИСТб-20-3", StudentFabric.shared.get_ist_20_3_students());
    Group ist21_1 = new Group("ИСТб-21-1", StudentFabric.shared.get_ist_21_1_students());
    Group ist21_2 = new Group("ИСТб-21-2", StudentFabric.shared.get_ist_21_2_students());
    Group asu20_1 = new Group("АСУб-20-1", StudentFabric.shared.get_asu_20_1_students());
    Group asu20_2 = new Group("АСУб-20-2", StudentFabric.shared.get_asu_20_2_students());
    Group asu_21_1 = new Group("АСУб-21-1", StudentFabric.shared.get_asu_21_1_students());
    Group asu_21_2 = new Group("АСУб-21-2", StudentFabric.shared.get_asu_21_2_students());
    Group asu_21_3 = new Group("АСУб-21-3", StudentFabric.shared.get_asu_21_3_students());

    GroupFabric() {
    }

    public ArrayList<Group> getWebProgGroups() {
        ArrayList<Group> webProgGroups = new ArrayList<>(Arrays.asList(
                ist20_1, ist20_2, ist20_3, asu20_1, asu20_2
        ));
        return webProgGroups;
    }

    public ArrayList<Group> getTechProgGroups() {
        ArrayList<Group> techProgGroups = new ArrayList<>(Arrays.asList(
                ist21_1,
                ist21_2,
                asu_21_1,
                asu_21_2,
                asu_21_3
        ));
        return techProgGroups;
    }

    public ArrayList<Group> getOOPArshGroups() {
        ArrayList<Group> techProgGroups = new ArrayList<>(Arrays.asList(
                ist21_2, asu_21_1
        ));
        return techProgGroups;
    }

    public ArrayList<Group> getMobileGroups() {
        ArrayList<Group> mobileGroups = new ArrayList<>(Arrays.asList(
                ist20_1, ist20_2, ist20_3, asu20_1, asu20_2
        ));
        return mobileGroups;
    }

    public ArrayList<Group> getModelingGroups() {
        ArrayList<Group> modelingGroups = new ArrayList<>(Arrays.asList(
                asu20_1, asu20_2, ist20_1, ist20_2, ist20_3
        ));
        return modelingGroups;
    }

    public ArrayList<Group> getDataAnalyticsGroups() {
        ArrayList<Group> dataAnalyticsGroups = new ArrayList<>(Arrays.asList(
                ist21_1, ist21_2, asu_21_1, asu_21_2, asu_21_3
        ));
        return dataAnalyticsGroups;
    }

    public ArrayList<Group> getOperationResearchGroups() {
        ArrayList<Group> buisnesProcessGroups = new ArrayList<>(Arrays.asList(
                ist21_1, ist21_2, asu_21_1, asu_21_2, asu_21_3
        ));
        return buisnesProcessGroups;
    }

    public ArrayList<Group> getOOPMalanGroups() {
        ArrayList<Group> dataAnalyticsGroups = new ArrayList<>(Arrays.asList(
                ist21_1, asu_21_2, asu_21_3
        ));
        return dataAnalyticsGroups;
    }

    public ArrayList<Group> getBuisnesProcessGroups() {
        ArrayList<Group> buisnesProcessGroups = new ArrayList<>(Arrays.asList(
                ist21_1, ist21_2, asu_21_1, asu_21_2, asu_21_3
        ));
        return buisnesProcessGroups;
    }
}
