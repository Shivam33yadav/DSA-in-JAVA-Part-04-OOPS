public class Interfac {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        
    }
    
}

interface ChessPlayer {// chessplayer k pass uska ek func ho jo move btaye so we make a blueprint of moves
    void moves();//interface crecated and make the class

}
 class Queen implements ChessPlayer{
      public void moves(){
      System.out.println("up, down, left, right, diagonal (in all four dirns)");
 }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down, left, right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down, left, right , diagonal(by 1 step)");
    }
}