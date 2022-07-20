package ir.Modibit;

import java.util.Random;

public class chance extends characters {
    Random random = new Random();

    public chance(int maxround) {
        super(maxround);
        setName("With Chance");
    }

    @Override
    public boolean play(int round, boolean move) {
        boolean choice=random.nextBoolean();
        setchoice(choice,round);
        return choice;
    }


}
