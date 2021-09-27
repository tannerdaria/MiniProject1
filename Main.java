import java.util.*;

/*
Mini Project 1
Group 2: Tanner Daria, Alex Hils, Graham Koenig, Maggie Korte
Date: 9/29
*/

class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the Guessing Game!");

    System.out.println("Please enter any positive whole number: ");

    Scanner s = new Scanner(System.in);
    Random r = new Random();

    int userNum = s.nextInt();
    int randomNum = r.nextInt(userNum);

    int numbersForGame = playGame(randomNum, userNum);

    System.out.println("A random number to guess has been generated.");

  } 

    public static int playGame(int guessNum, int originalNum){



    System.out.println("Please guess a number between 0 and " + originalNum);
      
    }
  
}