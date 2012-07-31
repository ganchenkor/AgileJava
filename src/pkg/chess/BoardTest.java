package pkg.chess;

import junit.framework.TestCase;
import static pkg.chess.Board.LINE_END;
import pkg.util.StringUtil;

/**
 * Created with IntelliJ IDEA.
 * User: Rom4G
 * Date: 5/18/12
 * Time: 11:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class BoardTest extends TestCase{
    private Board board;

    protected void setUp(){
        board = new Board();
    }
    public void testCreate() {
        board.initialize();
        assertEquals(16, Piece.whitePieceCount());
        assertEquals(16, Piece.blackPieceCount());
        assertEquals(32, board.pieceCount());
        String blankRank = StringUtil.appendNewLine("........");
        assertEquals(StringUtil.appendNewLine("RNBQKBNR") +
                    StringUtil.appendNewLine("PPPPPPPP") +
                    blankRank + blankRank + blankRank + blankRank +
                    StringUtil.appendNewLine("pppppppp") +
                    StringUtil.appendNewLine("rnbqkbnr"),
                board.print());
    }
}
