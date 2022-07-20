package ir.Modibit;

public class allcheat extends characters{


    public allcheat(int maxround) {
        super(maxround);
        setName("Always Cheating");
    }

    @Override
    public boolean play(int round, boolean move) {
        setchoice(false,round);
        return false;
    }
}
