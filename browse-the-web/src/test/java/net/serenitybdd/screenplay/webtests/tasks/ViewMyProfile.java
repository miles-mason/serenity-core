package net.serenitybdd.screenplay.webtests.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.tasks.Click;
import net.serenitybdd.screenplay.webtests.pages.HomePage;
import net.thucydides.core.annotations.Step;

public class ViewMyProfile implements Performable {

    Target theProfileButton = Target.the("View profile button").locatedBy(HomePage.VIEW_PROFILE);

    @Step("{0} views her profile")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(theProfileButton));
    }
}