package ir.Modibit;

public class PlayMachine {
    private int BothWin = 2, WinCheat = 3, BothCheat = 0, LoseCheat = -1;
    private int round = 0;
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";
    private static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";
    private static final String BLUE_BOLD_BRIGHT = "\033[1;94m";
    // boolean Player1, Player2;


    int calculator(boolean p1, boolean p2) {
        if (p1 == false && p2 == false)
            return BothCheat;
        if (p1 == false && p2 == true)
            return WinCheat;
        if (p1 == true && p2 == false)
            return LoseCheat;
        if (p1 == true && p2 == true)
            return BothWin;
        return -1000;//for understand we have a mistake in calculate
    }

    void Play(characters P1, characters P2) {
        System.out.println(YELLOW_BOLD_BRIGHT + "Round:" + (round + 1) + ANSI_RESET);
        boolean p1, p2;
        if (round == 0) {
            p1 = P1.play(round, true);
            p2 = P2.play(round, true);
        } else {
            p1 = P1.play(round, P2.choice[round - 1]);
            p2 = P2.play(round, P1.choice[round - 1]);
        }
        P1.score += calculator(p1, p2);
        if (P1.choice[round] == true)
            System.out.print(ANSI_GREEN + "Cooperate" + ANSI_RESET);
        else
            System.out.print(ANSI_RED + "Cheat    " + ANSI_RESET);
        System.out.println(PURPLE_BOLD_BRIGHT + "\tPlayer 1 score :" + P1.score);
        P2.score += calculator(p2, p1);
        if (P2.choice[round] == true)
            System.out.print(ANSI_GREEN + "Cooperate" + ANSI_RESET);
        else
            System.out.print(ANSI_RED + "Cheat    " + ANSI_RESET);
        System.out.println(PURPLE_BOLD_BRIGHT + "\tPlayer 2 score :" + P2.score + ANSI_RESET + "\n");
        round++;
        if (!(P1 instanceof Player)&&P1.maxRound==round)
            System.out.println(BLUE_BOLD_BRIGHT+"Player 1 :" +P1.name+"\nPlayer 2 :"+P2.name+ANSI_RESET);

    }
}
