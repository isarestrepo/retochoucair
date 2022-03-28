package retochoucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import retochoucair.userinterface.RetoChoucairPageHome;

public class OpenHome implements Task {
    private retochoucair.userinterface.RetoChoucairPageHome RetoChoucairPageHome;
    public static OpenHome thePage() {
        return Tasks.instrumented(OpenHome.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(RetoChoucairPageHome));
    }
}