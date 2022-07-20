package ir.Modibit;

public class grudge extends characters {
    public grudge(int maxround) {
        super(maxround);
        setName("Grudge");
    }

    private boolean cheat = false;

    @Override
    public boolean play(int round, boolean move) {
        if (round == 0) {
            setchoice(true, round);
            return true;
        }
        if (move == false) {
            cheat = true;
        }
        if (cheat) {
            setchoice(false, round);
            return false;
        }
        setchoice(true, round);
        return true;


    }
}
