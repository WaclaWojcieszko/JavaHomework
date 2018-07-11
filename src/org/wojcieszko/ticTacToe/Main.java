package org.wojcieszko.ticTacToe;

import Action.FSMAction;
import FSM.FSM;
import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.wojcieszko.ticTacToe.controllers.ControllerAI1;
import org.wojcieszko.ticTacToe.controllers.ControllerMan;
import org.wojcieszko.ticTacToe.controllers.IStrategy;
import org.wojcieszko.ticTacToe.model.Board;
import org.wojcieszko.ticTacToe.model.TicTac;
import org.wojcieszko.ticTacToe.views.ShowBoard;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {


    static IStrategy playerFactory(String who) {
        if (who.equals("man")) {
            return new ControllerMan();
        } else if (who.equals("ai")) {
            return new ControllerAI1();
        }
        return null;
    }

    public FSM getFSM() throws IOException, SAXException, ParserConfigurationException {

        String _configFileName = "resource/configP1P2.xml";


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


        return f;


    }

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, ConfigurationException {

        Board board = new Board();
        ShowBoard showBoard = new ShowBoard();
        board.addObserver(showBoard);

        Configurations configs = new Configurations();
        Configuration config = configs.properties(new File("D:\\Sobotniekodzenie\\IdeaProjects\\JavaHomework\\src\\resource\\player.properties"));


        IStrategy player1 = playerFactory(config.getString("player1"));
        IStrategy player2 = playerFactory(config.getString("player2"));


        Main tralala = new Main();
        FSM fsm = tralala.getFSM();
        fsm.ProcessFSM("FIGHT");


        System.out.println(fsm.getCurrentState());

//        for (int x = 0; x < board.getData().length; ++x) {
//            for (int y = 0; y < board.getData().length; ++y) {
//                board.setData(x, y, TicTac.TIC);
//            }
//        }
//
//        board.setData(0, 0, TicTac.EMPTY);
//        board.setData(1,1,TicTac.EMPTY);

        while (true) {
            switch (fsm.getCurrentState()) {
                case "P1TURN": {
                    player1.makeMove(board, TicTac.TIC);
                    fsm.ProcessFSM("MOVE");
                    break;
                }
                case "P2TURN": {
                    player2.makeMove(board, TicTac.TAC);
                    fsm.ProcessFSM("MOVE");
                    break;
                }

            }
            if (!board.ifFreeSpace() == true) {
                fsm.ProcessFSM("STOP");
                break;
            }

        }

    }

}