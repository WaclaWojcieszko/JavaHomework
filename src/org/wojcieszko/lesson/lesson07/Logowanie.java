package org.wojcieszko.lesson.lesson07;

import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Logowanie {

    @Test
    public void firstLoggerTest() {
        Logger.getAnonymousLogger().log(Level.INFO, "to jest w logu");
    }

    @Test
    public void secondLoggerTest() {
        Logger myLogger = Logger.getLogger(Logowanie.class.getName());
        myLogger.log(Level.INFO, "to jest w logu");
        myLogger.log(Level.INFO, "to też jest w logu");
    }

    static private Logger logger = Logger.getLogger(Logowanie.class.getName());


    //ten najlepiej
    @Test
    public void thirdLoggerTest() {
        logger.log(Level.INFO, "to jest w logu");
        logger.log(Level.INFO, "to też jest w logu");
    }

}
