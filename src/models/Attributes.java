package models;

public class Attributes {
    private double stdAttendance;
    private int stdAssignments;
    public boolean Achievements;

    public Attributes(double stdAttendance, int stdAssignments, boolean achievements) {
        this.stdAttendance = stdAttendance;
        this.stdAssignments = stdAssignments;
        Achievements = achievements;

    }

    public double getStdAttendance() {
        return stdAttendance;
    }

    public void setStdAttendance(double stdAttendance) {
        this.stdAttendance = stdAttendance;
    }

    public int getStdAssignments() {
        return stdAssignments;
    }

    public void setStdAssignments(int stdAssignments) {
        this.stdAssignments = stdAssignments;
    }

    public boolean isAchievements() {
        return Achievements;
    }

    public void setAchievements(boolean achievements) {
        Achievements = achievements;
    }
}


