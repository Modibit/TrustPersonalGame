package ir.Modibit;

public class imitative extends characters {

    public imitative(int maxround) {
        super(maxround);
        setName("Imitative");
    }

    @Override
    public boolean play(int round, boolean move) {

        if (move == false) {
            setchoice(false, round);
            return false;
        }
        setchoice(true, round);
        return true;
    }
}
