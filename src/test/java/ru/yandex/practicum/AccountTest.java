package ru.yandex.practicum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * @author Pekhov A.V.
 * @created 21/01/2022 - 17:46
 */

public class AccountTest {

    @Test
    public void correctHolderNameTest() {
        assertTrue(new Account("ALEXEY PEKHOV").checkNameToEmboss());
    }

    @Test
    public void lessWhen3CharHolderNameTest() {
        assertFalse(new Account("AL").checkNameToEmboss());
    }

    @Test
    public void moreWhen19CharHolderNameTest() {
        assertFalse(new Account("ALEXEY PEKOVMOREWHENNINETEEN").checkNameToEmboss());
    }

    @Test
    public void holderNameStartsWithSpaceTest() {
        assertFalse(new Account(" ALEXEY PEKOV").checkNameToEmboss());
    }

    @Test
    public void holderNameEndsWithSpaceTest() {
        assertFalse(new Account("ALEXEY PEKOV ").checkNameToEmboss());
    }

    @Test
    public void twoSpaceInHolderNameTest() {
        assertFalse(new Account("ALEXEY PEK OV").checkNameToEmboss());
    }

}
