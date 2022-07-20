package ir.Modibit;

public class Detective extends characters {
    private boolean[] Ochoice = new boolean[4];

    public Detective(int maxround) {
        super(maxround);
        setName("Detective");
    }

    @Override
    public boolean play(int round, boolean move) {
        switch (round) {
            case 0:
                setchoice(true, 0);
                Ochoice[round] = move;
                return true;
            case 1:
                setchoice(false, 1);
                Ochoice[round] = move;
                return false;
            case 2:
                setchoice(true, 2);
                Ochoice[round] = move;
                return true;
            case 3:
                setchoice(true, 3);
                Ochoice[round] = move;
                return true;

            default:
                if (Ochoice[0] == true && Ochoice[1] == true && Ochoice[2] == true && Ochoice[3] == true) {
                    setchoice(false, round);
                    return false;
                } else if (move == false) {
                    setchoice(false, round);
                    return false;
                }
                setchoice(true, round);
                return true;

        }
    }

}
