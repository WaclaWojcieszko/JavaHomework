package org.wojcieszko.jpa;

import org.junit.Test;

public class Single {
    private static Single instance = null;

    protected Single() {
        System.out.println("Constructing Singleton");
        // Exists only to defeat instantiation.
    }

    public static Single getInstance() {
        if (instance == null) {
            instance = new Single();
        }
        return instance;
    }

    public void doSth() {
        System.out.println("Doing Something");
    }

}
