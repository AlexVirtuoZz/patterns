package epam.pattern.state.implementation;

/**
 * Created by Alex on 25.05.2016.
 * STATE option # 2
 */
public class River implements Location {
    @Override
    public void changeLocation(Human human) {
        System.out.println("I am Fisherman !");
        human.setLocation(new Meadow());
    }
}
