package classwork.pageobject.pages;

/**
 * Created by Dmitry_Lebedev1 on 1/31/2018.
 */
public class HomePage extends CommonPage {
    public Boolean isLoggedIn(String userName) {
        return header.isLoggedIn(userName);
    }
}
