package epam.pattern.state.implementation;

/**
 * Created by Alex on 25.05.2016.
 * STATE option # 3
 */
public class Forest implements Location {
    @Override
    public void changeLocation(Human human) {
        System.out.println("I am Hunter!");
        human.setLocation(new River());
    }
}
