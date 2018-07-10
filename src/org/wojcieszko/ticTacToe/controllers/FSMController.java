package org.wojcieszko.ticTacToe.controllers;



import Action.FSMAction;
import FSM.FSM;
import org.junit.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FSMController {

    private String _configFileName = "resource/configP1P2.xml";

    @Test
    public void testFSM() {
        try {
            FSM f = new FSM(this.getClass().getClassLoader().getResourceAsStream(_configFileName), new FSMAction() {
                @Override
                public boolean action(String curState, String message, String nextState, Object args) {
                    System.out.println("Action: " + message + " : " + nextState);
                    return true;
                }
            });
            f.setAction("START", "MOVELEFT", new FSMAction() {
                @Override
                public boolean action(String curState, String message, String nextState, Object args) {
                    System.out.println("Customized moveLeft!");
                    return true;
                }
            });
            System.out.println(f.getCurrentState());
            f.ProcessFSM("FIGHT");
            System.out.println(f.getCurrentState());
            f.ProcessFSM("MOVE");
            System.out.println(f.getCurrentState());
            f.ProcessFSM("STOP");
            System.out.println(f.getCurrentState());
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(FSMController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(FSMController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FSMController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}

