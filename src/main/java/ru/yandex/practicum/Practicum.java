package ru.yandex.practicum;

/**
 * @author Pekhov A.V.
 * @created 20/01/2022 - 16:12
 */

public class Practicum {

    public static void main(String[] args) {
        String cardHolderName = "ALEXEY PEKHOV";
        Account account = new Account(cardHolderName);
        account.checkNameToEmboss();
    }
}
