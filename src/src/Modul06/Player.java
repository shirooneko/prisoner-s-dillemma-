package Modul06;

public class Player {
    private int Strategi;
    private int Skor;

    public Player(int strategi) {
        Strategi = strategi;
        Skor = 0;
    }

    public int getStrategi() {
        return Strategi;
    }

    public void setStrategi(int strategi) {
        Strategi = strategi;
    }

    public int getSkor() {
        return Skor;
    }

    public void setSkor(int skor) {
        Skor = skor;
    }
}

