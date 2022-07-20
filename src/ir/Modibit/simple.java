package ir.Modibit;

public class simple extends characters {
    public simple(int maxround) {
        super(maxround);
        setName("Simple");
    }

    @Override
    public boolean play(int round, boolean move) {
        if (round == 0) {
            setchoice(true, round);
            return true;
        }
        if (move == true) {
            setchoice(choice[round - 1], round);
            return choice[round - 1];
        }
        setchoice(!choice[round - 1], round);
        return !choice[round - 1];
    }
}
