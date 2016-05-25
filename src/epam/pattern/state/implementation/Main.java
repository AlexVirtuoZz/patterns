package epam.pattern.state.implementation;

/**
 * Created by Alex on 25.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setLocation(new River());
        for (int i = 0; i < 10; i++)
            human.move();
    }
}
