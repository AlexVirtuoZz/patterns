package epam.pattern.state.example1;

/**
 * Created by Alex on 25.05.2016.
 * STATE option # 3
 */
public class RadioNews implements Station{

    @Override
    public void play() {
        System.out.println("Playing Radio News");
    }
}
