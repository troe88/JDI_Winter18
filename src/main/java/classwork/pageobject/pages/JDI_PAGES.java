package classwork.pageobject.pages;

import java.util.Objects;

/**
 * Created by Dmitry_Lebedev1 on 2/2/2018.
 */

public enum JDI_PAGES {
    HOME, SERVICE, CONTACT_FORM, METALS_COLORS("Metals & Colors"), DATES(2), SIMPLE_TABLE(2);

    private String value;
    private int level;

    JDI_PAGES() {
    }

    JDI_PAGES(String value) {
        this.value = value;
    }

    JDI_PAGES(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        if (Objects.isNull(value)) {
            return name().replaceAll("_", " ");
        } else {
            return value;
        }
    }
}
