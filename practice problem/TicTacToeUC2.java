import java.util.Random;

public class TicTacToeUC2 {
    public static void main(String[] args) {
        Random random = new Random();
        
        // Generate random number: 0 or 1
        int toss = random.nextInt(2);
        
        String firstPlayer;
        String player1Symbol;
        String player2Symbol;
        
        // Output from Toss
        System.out.println("Tossing to decide who starts first...");
        
        if (toss == 0) {
            firstPlayer = "Player 1";
            player1Symbol = "X";
            player2Symbol = "O";
        } else {
            firstPlayer = "Player 2";
            player2Symbol = "X";
            player1Symbol = "O";
        }
        
        System.out.println("Result: " + firstPlayer + " won the toss and will start first!");
        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
    }
}
