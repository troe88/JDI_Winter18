package classwork.pageobject;

import classwork.pageobject.entities.User;
import classwork.pageobject.pages.ContactFormPage;
import classwork.pageobject.pages.DatesPage;
import classwork.pageobject.pages.HomePage;
import classwork.pageobject.pages.SimpleTablePage;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;

/**
 * Created by Dmitry_Lebedev1 on 1/31/2018.
 */

@JSite("https://epam.github.io/JDI")
public class JDISite extends WebSite {

    @JPage(url = "/index.html")
    public static HomePage homePage;

    @JPage(url = "/contacts.html", title = "Contact Form")
    public static ContactFormPage contactFormPage;

    @JPage(url = "/dates.html", title = "Dates")
    public static DatesPage datesPage;

    @JPage(url = "/simple-table.html", title = "Simple Table")
    public static SimpleTablePage simpleTablePage;


    public static void login(User user) {
        homePage.header.login(user);
    }
}
