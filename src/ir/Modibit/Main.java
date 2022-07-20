package ir.Modibit;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random=new Random();
        System.out.println(ANSI_YELLOW+"Hello My friend\n**Welcome to game**"+RED_BOLD_BRIGHT+"\nThis Program Produce by:");
        System.out.println(YELLOW_BOLD_BRIGHT+"-----------------------\n |$$Mohammad Moradi$$|\n-----------------------"+ANSI_RESET);
        boolean whileflag=true;
        while (whileflag) {
            int maxRound = random.nextInt(3) + 4;
            System.out.println(ANSI_YELLOW+"max round:" + maxRound+ANSI_RESET);
            System.out.println("\nChoose the mod :\n1.PC vs PC\n2.PC vs Human\n3.exit");

            switch (input.nextInt()) {
                case 1:
                    Play(pcPlay(maxRound), pcPlay(maxRound));
                    break;
                case 2:
                    Player player = new Player(maxRound);
                    Play(player, pcPlay(maxRound));
                    break;
                case 3:
                    whileflag=false;
                    break;
                default:
                    System.out.println("Wrong data input");
                    continue;
            }
        }

    }
    static void Play(characters a,characters b)
    {
        PlayMachine machine=new PlayMachine();
for (int i=0;i<a.choice.length||i<b.choice.length;i++)
    machine.Play(a,b);
        System.out.println("Final Score\nPlayer 1 :"+a.score+"\nPlayer 2 :"+b.score);
    }

    static characters pcPlay(int maxround) {

        Random random = new Random();
        characters Player;
        int choose=random.nextInt(8);
        switch (choose) {
            case 0:
                Player = new imitative(maxround);
                break;
            case 1:
                Player = new allcheat(maxround);
                break;
            case 2:
                Player = new innocent(maxround);
                break;
            case 3:
                Player = new grudge(maxround);
                break;
            case 4:
                Player = new Detective(maxround);
                break;
            case 5:
                Player = new Kimitative(maxround);
                break;
            case 6:
                Player=new simple(maxround);
                break;
            case 7:
                Player=new chance(maxround);
                break;
            default:
                Player=new Player(maxround);

        }
        return Player;
    }

}
