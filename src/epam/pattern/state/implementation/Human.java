package epam.pattern.state.implementation;

/**
 * Created by Alex on 25.05.2016.
 * This is Pattern's CONTEXT
 */
public class Human {
    Location location;

    void setLocation(Location location){
        this.location = location;
    }

    void move(){
        location.changeLocation(this);
    }

}
