package behavior.state;


import java.util.ArrayList;
import java.util.List;

public class SolidState implements State {
    private static final String NAME = "solid";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void freeze(StateContext context) {
        System.out.println("Nothing happened!");
        ArrayList<Object> objects = new ArrayList<>();
    }

    @Override
    public void heat(StateContext context) {
        context.setState(new LiquidState());
    }
}
