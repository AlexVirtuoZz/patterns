package epam.pattern.state.example2;

/**
 * Created by Alex on 25.05.2016.
 * This Pattern's implementation uses STATE as a changer of CONTEXT'S BEHAVIOR
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setState(new Work());
        for (int i = 0; i < 10; i++)
        human.doSomething();
    }
}
