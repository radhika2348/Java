package com.marmin.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class AppTest {
    public App add = new App();

    @Test
    void assertAdditionWorks() {
        boolean expected = true;
        boolean actual = (add.add(20, 30) == 50);
        Assertions.assertEquals(expected, actual);
    }
}
