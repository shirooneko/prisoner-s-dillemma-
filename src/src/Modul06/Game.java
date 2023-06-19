package Modul06;

public class Game {
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public void hitungPayoff(){
        if (this.player1.getStrategi() == 0) {
            if (this.player2.getStrategi() == 0) {
                this.player1.setSkor(8);
                this.player2.setSkor(8);
            } else {
                this.player1.setSkor(4);
                this.player2.setSkor(10);
            }
        } else {
            if (this.player2.getStrategi() == 1){
                this.player1.setSkor(6);
                this.player2.setSkor(6);
            } else {
                this.player1.setSkor(4);
                this.player2.setSkor(10);
            }
        }
    }
}
