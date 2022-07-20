package ir.Modibit;

public class innocent extends characters {

    public innocent(int maxround) {
        super(maxround);
        setName("Innocent");
    }

    @Override
    public boolean play(int round, boolean move) {
        setchoice(true, round);
        return true;
    }
}
