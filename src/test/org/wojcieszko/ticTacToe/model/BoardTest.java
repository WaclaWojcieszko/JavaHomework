package test.org.wojcieszko.ticTacToe.model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.wojcieszko.ticTacToe.model.Board;
import org.wojcieszko.ticTacToe.model.TicTac;

/**
 * Board Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>sty 27, 2018</pre>
 */
public class BoardTest {

    private Board board;

    @Before
    public void before() throws Exception {

        board = new Board();
        Assert.assertEquals(TicTac.EMPTY, board.getData(1, 1));
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getDim()
     */
    @Test
    public void testGetDim() throws Exception {
//TODO: Test goes here...
        Assert.assertEquals(3, board.getDim());
    }

    /**
     * Method: reset()
     */
    @Test
    public void testReset() throws Exception {
//TODO: Test goes here... 
    }


} 
