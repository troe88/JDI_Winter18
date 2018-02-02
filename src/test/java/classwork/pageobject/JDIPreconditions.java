package classwork.pageobject;

import classwork.pageobject.entities.User;
import com.epam.jdi.uitests.web.selenium.preconditions.WebPreconditions;

import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by Dmitry_Lebedev1 on 2/2/2018.
 */
public enum JDIPreconditions implements WebPreconditions {
    IS_LOGGED_IN(
            () -> JDISite.homePage.isLoggedIn("Piter Chailovskii"),
            () -> JDISite.login(new User("epam", "1234"))
    );


    private final BooleanSupplier checkAction;
    private final Runnable moveToAction;

    JDIPreconditions(BooleanSupplier checkAction, Runnable moveToAction) {
        this.checkAction = checkAction;
        this.moveToAction = moveToAction;
    }

    @Override
    public Boolean checkAction() {
        return checkAction.getAsBoolean();
    }

    @Override
    public void moveToAction() {
        moveToAction.run();
    }
}
