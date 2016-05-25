package epam.pattern.state.implementation;

/**
 * Created by Alex on 25.05.2016.
 * STATE option # 1
 */
public class Meadow implements Location {

    @Override
    public void changeLocation(Human human) {
        System.out.println("I am Mushroomer !");
        human.setLocation(new Forest());
    }
}
