package epam.pattern.state.example2;

/**
 * Created by Alex on 25.05.2016.
 * This is Pattern's CONTEXT
 */
public class Human {
    private Activity activity;

    void setState(Activity activity){
        this.activity = activity;
    }

    void doSomething(){
        activity.doSomething(this);
    }
}
