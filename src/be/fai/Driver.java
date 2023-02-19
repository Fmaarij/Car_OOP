package be.fai;

import java.util.StringTokenizer;

public class Driver {
    //Property
    private String driverName = "Unknown";

    //Constructor no-args
    public Driver() {

    }

    //Constructor with 1 arg
    public Driver(String driverName) {
        this.driverName = driverName;
    }

    //getter and setter
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        String dName = driverName.trim();
        if(dName.length() >= 5 ){
            this.driverName = driverName;
        }else {
            this.driverName=this.driverName;
        }

    }

}