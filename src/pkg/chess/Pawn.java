package pkg.chess;

/**
 * Represents Pawn object which can be either BLACK OR WHITE
 */
public class Pawn {
    public static final String WHITE = "white";
    public static final String BLACK = "black";
    static final char WHITE_REPRESENTATION = 'p';
    static final char BLACK_REPRESENTATION = 'P';

    private String color = WHITE;
    private char representation = 'p';

    /**
     * Constructs a default white pawn
     */
    public Pawn () {
    }

    /**
     * Constructs a Pawn with provided color
     * @param color
     */

    public Pawn(String color, char representation){
        this.color = color;
        this.representation = representation;
    }
    /**
     * Getter to return color
     * @return color
     */
    public String getColor() {
        return color;
    }

    public char getRepresentation(){
        return representation;
    }
}
