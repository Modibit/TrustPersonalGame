package ir.Modibit;

//Kindness Imitative
public class Kimitative extends characters {
    private int cheat = 0;

    public Kimitative(int maxround) {
        super(maxround);
        setName("Kindness Imitative");
    }

    @Override
    public boolean play(int round, boolean move) {
        if (move == false) {
            cheat++;
            if (cheat == 2) {
                setchoice(false, round);
                return false;
            }
        }
        cheat = 0;
        setchoice(true, round);
        return true;
    }
}

