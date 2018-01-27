package test.org.wojcieszko.ticTacToe.views;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.wojcieszko.ticTacToe.model.Board;
import org.wojcieszko.ticTacToe.model.TicTac;
import org.wojcieszko.ticTacToe.views.ShowBoard;

/**
 * ShowBoard Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>sty 27, 2018</pre>
 */
public class ShowBoardTest {

    private Board board;
    private ShowBoard showBoard;

    @Before
    public void before() throws Exception {
        this.board = new Board();
        this.showBoard = new ShowBoard();


    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testUpdate() {
        board.addObserver(showBoard);
        board.setData(1, 2, TicTac.TIC);


    }

    /**
     * Method: show(Board board)
     */
    @Test
    public void testShow() throws Exception {

//TODO: Test goes here... 
    }


} 
