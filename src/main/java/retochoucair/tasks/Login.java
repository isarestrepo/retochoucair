package retochoucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import retochoucair.userinterface.RetoChoucairLoginPage;

public class Login implements Task {
    public static Login onThePage;

    public static Login onThePage(){
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("standard_user").into(RetoChoucairLoginPage.INPUT_USER),
                Enter.theValue("secret_sauce").into(RetoChoucairLoginPage.INPUT_PASSWORD),
                Click.on(RetoChoucairLoginPage.ENTER_BUTTON)
        );
    }
}
