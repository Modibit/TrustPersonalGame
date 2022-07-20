package ir.Modibit;

import java.util.Scanner;

public class Player extends characters {
    private boolean choice;
    Scanner input = new Scanner(System.in);
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RED = "\u001B[31m";

    public Player(int maxround) {
        super(maxround);
    }

    @Override
    public boolean play(int round, boolean move) {

        System.out.println("\nChoose your move:" + ANSI_GREEN + "\n1.Cooperate" + ANSI_RED + "\n2.Cheat" + ANSI_RESET);
        switch (input.nextInt()) {
            case 1:
                choice = true;
                break;
            case 2:
                choice = false;
                break;
            default:
                System.out.println("wrong data\nchose again:");
                play(round, move);
                break;

        }

        setchoice(choice, round);
        return choice;
    }
}
