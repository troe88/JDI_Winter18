package classwork.pageobject.sections;

import classwork.pageobject.entities.User;
import classwork.pageobject.forms.LoginForm;
import classwork.pageobject.pages.JDI_PAGES;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Dmitry_Lebedev1 on 1/31/2018.
 */
public class HeaderSection extends Section {

    @FindBy(css = ".m-l8")
    public JDIMenu menu;

    @FindBy(css = ".profile-photo")
    public Button expanderButton;

    public LoginForm loginForm;

    public void login(User user) {
        expanderButton.click();
        loginForm.loginAs(user);
    }

    public Boolean isLoggedIn(String userName) {
        return expanderButton.getText().equalsIgnoreCase(userName);
    }
}
