package classwork.pageobject.pages;

import classwork.pageobject.entities.SimpleTableData;
import com.epam.jdi.uitests.web.selenium.elements.complex.table.EntityTable;
import com.epam.jdi.uitests.web.selenium.elements.complex.table.Table;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JTable;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Dmitry_Lebedev1 on 2/2/2018.
 */
public class SimpleTablePage extends CommonPage {

    @JTable(
            root =  @FindBy(css = "table tbody"),
            row = @FindBy(xpath = ".//tr[%s]//td"),
            column = @FindBy(xpath = ".//tr//td[%s]"),
            header = {"Type", "Now", "Plans"}
    )
    EntityTable<SimpleTableData, SimpleTableWrapper> simpleTable =
            new EntityTable<>(SimpleTableData.class, SimpleTableWrapper.class);

    public void method() {

    }
}
