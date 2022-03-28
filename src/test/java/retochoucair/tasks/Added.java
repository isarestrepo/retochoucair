package retochoucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import retochoucair.userinterface.RetoChoucairLoginPage;


public class Added implements Task {

    public static Added onThePage;

    public static Added onThePage(){
        return Tasks.instrumented(Added.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RetoChoucairLoginPage.ADD_TO_CART_ONE),
                Click.on(RetoChoucairLoginPage.ADD_TO_CART_TWO),
                Click.on(RetoChoucairLoginPage.BUTTON_SHOPPING),
                Click.on(RetoChoucairLoginPage.BUTTON_CHECKOUT),
                Enter.theValue("Maria").into(RetoChoucairLoginPage.INPUT_FIRST_NAME),
                Enter.theValue("Restrepo").into(RetoChoucairLoginPage.INPUT_LAST_NAME),
                Enter.theValue("01203445").into(RetoChoucairLoginPage.INPUT_POSTAL_CODE),
                Click.on(RetoChoucairLoginPage.BUTTON_CONTINUE),
                Click.on(RetoChoucairLoginPage.BUTTON_FINISH),
                Click.on(RetoChoucairLoginPage.CONFIRM_SHOPPING)
                );
    }

}
