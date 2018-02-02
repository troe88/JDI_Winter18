package classwork.pageobject.forms;

import classwork.pageobject.entities.User;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Dmitry_Lebedev1 on 1/31/2018.
 */
public class LoginForm extends Form<User> {
    @FindBy(id = "Login")
    public TextField login;

    @FindBy(id = "Password")
    public TextField password;

    @FindBy(css = "form [type='submit']")
    public Button submit;
}
