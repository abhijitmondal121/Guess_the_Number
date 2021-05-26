package com.company;
import java.util.Random;
import java.util.Scanner;

class game{
    public int number;
    public int inputnumber;
    public int noofguesses=0;

    public int getNoofguesses() {
        return noofguesses;
    }

    public void setNoofguesses(int noofguesses) {
        this.noofguesses = noofguesses;
    }

    game(){
        Random rand= new Random();
        this.number=rand.nextInt(100);
    }
    void takeuserInput(){
        System.out.println("Guess the number between 0 to 100:");
        Scanner sc=new Scanner(System.in);
        inputnumber=sc.nextInt();
    }
    boolean isCorrectNumber(){
        noofguesses++;
        if(inputnumber==number){
            System.out.printf("yess you gassed it...\n right it was %d\n You guessed it in %d attempts",number, noofguesses);
            return true;
        }
        else if(inputnumber<number){
            System.out.println("Too low......");
        }
        else if(inputnumber>number){
            System.out.println("Too high......");
        }

        return false;

    }
}

public class guess_the_number {
    public static void main(String[] args) {

        game g=new game();
        boolean b=false;
        while (!b) {
            g.takeuserInput();
            b = g.isCorrectNumber();

        }
    }
}
