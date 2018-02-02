package classwork.pageobject.sections;

import classwork.pageobject.pages.JDI_PAGES;
import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;

/**
 * Created by Dmitry_Lebedev1 on 2/2/2018.
 */
public class JDIMenu<T extends JDI_PAGES> extends Menu<T> {
    public void mySelect(JDI_PAGES t) {
        if (t.getLevel() == 2) {
            super.select(JDI_PAGES.SERVICE.toString());
        }
        super.select(t.toString());
    }
}
