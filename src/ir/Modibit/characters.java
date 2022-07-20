package ir.Modibit;

public abstract class characters implements Character {
    int score = 0;
    boolean[] choice;
    String name;
    int maxRound;

    void setName(String name) {
        this.name = name;
    }

    public characters(int maxround) {
        choice = new boolean[maxround];
        maxRound = maxround;
    }

    void setchoice(boolean choice, int round) {
        this.choice[round] = choice;
    }


}
