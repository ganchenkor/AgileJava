package pkg.chess;

import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: Rom4G
 * Date: 5/18/12
 * Time: 11:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class PawnTest extends TestCase{
    public void testCreate(){
        assertCreatePawn(Pawn.WHITE, Pawn.WHITE_REPRESENTATION);
        assertCreatePawn(Pawn.BLACK, Pawn.BLACK_REPRESENTATION);
    }

    private void assertCreatePawn(String color, char representation){
        Pawn pawn = new Pawn(color, representation);
        assertEquals(color, pawn.getColor());
        assertEquals(representation, pawn.getRepresentation());
    }

    public void testCreateWithDefault() {
        Pawn pawn = new Pawn();
        assertEquals(Pawn.WHITE, pawn.getColor());
        assertEquals(Pawn.WHITE_REPRESENTATION, pawn.getRepresentation());
    }
}
