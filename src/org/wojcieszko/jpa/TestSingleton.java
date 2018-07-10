package org.wojcieszko.jpa;

import org.junit.Test;

public class TestSingleton {

    @Test
    public void testSingleton() {
        Single.getInstance().doSth();
        Single.getInstance().doSth();
    }
}
