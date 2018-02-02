package classwork.pageobject;

import classwork.pageobject.pages.JDI_PAGES;
import com.epam.jdi.uitests.core.preconditions.PreconditionsState;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Created by Dmitry_Lebedev1 on 1/31/2018.
 */
public class TestOne extends TestNGBase {

    @BeforeSuite(alwaysRun = true)
    public static void setUp() {
        WebSite.init(JDISite.class);
    }

    @BeforeMethod
    public void beforeMethod() {
        JDISite.homePage.open();
        PreconditionsState.isInState(JDIPreconditions.IS_LOGGED_IN);
    }

//    @Test
//    public void test() {
//        JDISite.homePage.open();
//        JDISite.login(new User("epam", "1234"));
//    }

    @Test
    public void contactFormPage() {
        JDISite.homePage.header.menu.select(JDI_PAGES.CONTACT_FORM.toString());
        JDISite.contactFormPage.checkOpened();
    }

    @Test
    public void datesPage() {
        JDISite.homePage.header.menu.mySelect(JDI_PAGES.DATES);
        JDISite.datesPage.checkOpened();
    }

    @Test
    public void simpleTableTest() {
        JDISite.homePage.header.menu.mySelect(JDI_PAGES.SIMPLE_TABLE);
        JDISite.simpleTablePage.checkOpened();
        JDISite.simpleTablePage.method();
    }
}
