package Lesson_1.JavaConfig;

public class Reception {


    private Location location;

    public Location getLocation(){
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void getCabinet(){

        location.getCabinet();
    }

}
