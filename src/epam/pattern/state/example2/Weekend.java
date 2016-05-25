package epam.pattern.state.example2;

/**
 * Created by Alex on 25.05.2016.
 * STATE option # 1
 */
public class Weekend implements Activity{
    private int counter;
    @Override
    public void doSomething(Human human) {
        System.out.println("SLEEPING...ZZZ...");
        if (++counter < 3) return;
        human.setState(new Work());
    }
}
