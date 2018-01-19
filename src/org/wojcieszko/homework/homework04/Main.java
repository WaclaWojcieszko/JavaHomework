package org.wojcieszko.homework.homework04;

public class Main {

    public static void main(String[] args) {

        public Boolean humanPlayer1 = true;
        public Boolean humanPlayer2 = false;
        public int allSpectators = 0;

        if (humanPlayer1 == true) {
            Human player1 = new Human();
        } else Ai player1 = new Ai();

        if (humanPlayer2 == true) {
            Human player2 = new Human();
        } else Ai player1 = new Ai();

        Model model = new Model();

        View view = new View();

        void addSpectator () {
            new Spectator();
        }

    }

}
