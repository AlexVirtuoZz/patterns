package epam.pattern.state.example2;

/**
 * Created by Alex on 25.05.2016.
 * STATE option # 2
 */
public class Work implements Activity{

    @Override
    public void doSomething(Human human) {
        System.out.println("WORKING...");
        human.setState(new Weekend());
    }
}
