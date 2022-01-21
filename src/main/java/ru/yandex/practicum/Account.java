package ru.yandex.practicum;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Pekhov A.V.
 * @created 20/01/2022 - 16:13
 */

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        return !(name.startsWith(" ") || name.endsWith(" ") || name.length() < 3 || name.length() > 19 || StringUtils.countMatches(name, " ") != 1);
    }
}
