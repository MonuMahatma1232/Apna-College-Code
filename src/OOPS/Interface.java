package OOPS;

public class Interface {
    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();

    }
}

interface ChessPlayer{
    void moves ();

}
class Queen implements ChessPlayer {
    public void moves(){
        System.out.println("up, down, left, fight, diagonals, (in all 4 direction");

    }

}
class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, fight");
    }
}
class king implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, fight diagonals, (in all 1 Staps");
    }
}