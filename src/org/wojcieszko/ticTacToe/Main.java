package org.wojcieszko.ticTacToe;

import Action.FSMAction;
import FSM.FSM;
import org.wojcieszko.ticTacToe.controllers.ControllerMan;
import org.wojcieszko.ticTacToe.controllers.IStrategy;
import org.wojcieszko.ticTacToe.model.Board;
import org.wojcieszko.ticTacToe.model.TicTac;
import org.wojcieszko.ticTacToe.views.ShowBoard;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main01(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer");
        String myInput = keyboard.nextLine();
        System.out.println(myInput);
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

    public static void main (String[] args) throws ParserConfigurationException, SAXException, IOException {

        Board board = new Board();
        ShowBoard showBoard = new ShowBoard();
        board.addObserver(showBoard);

        IStrategy player1 = new ControllerMan();
        IStrategy player2 = new ControllerMan();


        Main tralala = new Main();
        FSM fsm = tralala.getFSM();
        fsm.ProcessFSM("FIGHT");


        System.out.println(fsm.getCurrentState());

        for (int x = 0; x < board.getData().length; ++x){
            for (int y = 0; y < board.getData().length; ++y){
                board.setData(x, y, TicTac.TIC);
            }
        }

        board.setData(0, 0, TicTac.EMPTY);

        while (true){
            switch (fsm.getCurrentState()){
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
            if (!board.ifFreeSpace() == true){
                fsm.ProcessFSM("STOP");
            }


        }

//        f.ProcessFSM("FIGHT");
//        System.out.println(f.getCurrentState());
//        f.ProcessFSM("MOVE");
//        System.out.println(f.getCurrentState());
//        f.ProcessFSM("STOP");
//
//        System.out.println(f.getCurrentState());

    }
}