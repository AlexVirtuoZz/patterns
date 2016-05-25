package epam.pattern.state.example1;

/**
 * Created by Alex on 25.05.2016.
 * This Pattern implementation uses CONTEXT to change its BEHAVIOR depending on STATE
 */
public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.setStation(new Radio7());

        for (int i = 0; i < 10; i++){
            radio.play();
            radio.nextStation();
        }
    }
}
