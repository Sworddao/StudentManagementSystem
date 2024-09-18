package models;

public class Stream {
    public String Science;
    public String Commerce;
    public String Management;

    public Stream(String science, String commerce, String management) {
        Science = science;
        Commerce = commerce;
        Management = management;
    }

    public String getScience() {
        return Science;
    }

    public void setScience(String science) {
        Science = science;
    }

    public String getCommerce() {
        return Commerce;
    }

    public void setCommerce(String commerce) {
        Commerce = commerce;
    }

    public String getManagement() {
        return Management;
    }

    public void setManagement(String management) {
        Management = management;
    }
}
