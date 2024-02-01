import java.util.Scanner;
import java.util.*;
import java.util.Random;

public class Main {

    private static final int Max_attempts = 5;
    Scanner sc=new Scanner(System.in);
    String name;


    public void name(){
        System.out.println("Enter the Username=");
        name=sc.nextLine();
        play();
    }
    public void play(){
        System.out.println("Welcome Number Guessing Game=  "+name);
        System.out.println("______Rules______");
        System.out.println("Total Rounds :3");
        System.out.println("Attempts each Round :5");
      //  System.out.println("Game is Running..");
        System.out.println();


    }
    public static void main(String[] args) {
        Main m1=new Main();

        Random rnd=new Random();
        Scanner sc=new Scanner(System.in);
        int totalscore=0;
        m1.name();



        for (int i=1;i<=3;i++){
            int number=rnd.nextInt(100) +1;
            int attempts=0;

            System.out.println("Round="+i);
            System.out.println("Attempts="+attempts);
            System.out.println("Guess the number Between 1 to 100.");

            while (attempts<Max_attempts){
                System.out.println("Enter the number:");
                int num=sc.nextInt();

                attempts=attempts+1;

                if(num==number){
                    int score= Max_attempts - attempts;
                    totalscore=totalscore+score;

                    System.out.println("guess the number Successfully.");
                    System.out.println("Attempts="+attempts);
                    System.out.println("Round Score="+score);
                    break;
                }
                else if (num<number){
                    System.out.println("The number is greater than "+num);
                    System.out.println("Attempts Left="+(Max_attempts-attempts));

                }
                else if(num > number){
                    System.out.println("The number is less than "+num);
                    System.out.println("Attempts Left="+(Max_attempts-attempts));
                }

            }
            if (attempts ==Max_attempts){
                System.out.println("Rounds="+i);
                System.out.println("Attempts=0");
                System.out.println("The Random Number is ="+number);
            }
        }
        System.out.println("++++Game Over++++");
        System.out.println("Total Score "+totalscore);




    }
}

