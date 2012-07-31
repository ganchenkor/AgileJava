package pkg.chess;

import java.util.ArrayList;
import pkg.util.StringUtil;
import pkg.chess.Piece;

/**
 * Represents a chess chess
 */
public class Board {
    static final String LINE_END = System.getProperty("line.separator");
    private ArrayList<ArrayList<Piece>> board = new ArrayList<ArrayList<Piece>>();
    private int pieceCount = 0;

    /**
     * Represents of how many pieces exists on the chess
     * @return pieces.size()
     */

    public void initialize(){
        Piece.resetCounts();
        addBlackBackRank();
        addBlackPawnRank();
        addBlankRank();
        addBlankRank();
        addBlankRank();
        addBlankRank();
        addWhitePawnRank();
        addWhiteBackRank();
    }

    int pieceCount() {
        return pieceCount;
    }

    private void addBlackBackRank() {
        ArrayList<Piece> rank = new ArrayList<Piece>();
        rank.add(Piece.createBlack(Piece.ROOK));
        rank.add(Piece.createBlack(Piece.KNIGHT));
        rank.add(Piece.createBlack(Piece.BISHOP));
        rank.add(Piece.createBlack(Piece.QUEEN));
        rank.add(Piece.createBlack(Piece.KING));
        rank.add(Piece.createBlack(Piece.BISHOP));
        rank.add(Piece.createBlack(Piece.KNIGHT));
        rank.add(Piece.createBlack(Piece.ROOK));
        add(rank);
    }

    private void addWhiteBackRank() {
        ArrayList<Piece> rank = new ArrayList<Piece>();
        rank.add(Piece.createWhite(Piece.ROOK));
        rank.add(Piece.createWhite(Piece.KNIGHT));
        rank.add(Piece.createWhite(Piece.BISHOP));
        rank.add(Piece.createWhite(Piece.QUEEN));
        rank.add(Piece.createWhite(Piece.KING));
        rank.add(Piece.createWhite(Piece.BISHOP));
        rank.add(Piece.createWhite(Piece.KNIGHT));
        rank.add(Piece.createWhite(Piece.ROOK));
        add(rank);
    }

    private void addWhitePawnRank(){
        ArrayList<Piece> rank = new ArrayList<Piece>();
        rank.add(Piece.createWhite(Piece.PAWN));
        rank.add(Piece.createWhite(Piece.PAWN));
        rank.add(Piece.createWhite(Piece.PAWN));
        rank.add(Piece.createWhite(Piece.PAWN));
        rank.add(Piece.createWhite(Piece.PAWN));
        rank.add(Piece.createWhite(Piece.PAWN));
        rank.add(Piece.createWhite(Piece.PAWN));
        rank.add(Piece.createWhite(Piece.PAWN));
        add(rank);
    }

    private void addBlackPawnRank(){
        ArrayList<Piece> rank = new ArrayList<Piece>();
        rank.add(Piece.createBlack(Piece.PAWN));
        rank.add(Piece.createBlack(Piece.PAWN));
        rank.add(Piece.createBlack(Piece.PAWN));
        rank.add(Piece.createBlack(Piece.PAWN));
        rank.add(Piece.createBlack(Piece.PAWN));
        rank.add(Piece.createBlack(Piece.PAWN));
        rank.add(Piece.createBlack(Piece.PAWN));
        rank.add(Piece.createBlack(Piece.PAWN));
        add(rank);
    }

    private void add(ArrayList<Piece> rank) {
        board.add(rank);
        pieceCount = pieceCount + rank.size();
    }

    private void addBlankRank(){
        Piece blank = Piece.noPiece();
        ArrayList<Piece> rank = new ArrayList<Piece>();
        rank.add(blank);
        rank.add(blank);
        rank.add(blank);
        rank.add(blank);
        rank.add(blank);
        rank.add(blank);
        rank.add(blank);
        rank.add(blank);
        board.add(rank);
    }


    public String print(){
        StringBuilder builder = new StringBuilder();
        for (ArrayList<Piece> rank:board){
            StringBuilder line = new StringBuilder();
            for (Piece peice: rank)
                line.append(peice.getRepresentation());
            builder.append(StringUtil.appendNewLine(line.toString()));
        }
       return builder.toString();
    }

}
