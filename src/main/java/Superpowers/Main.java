package Superpowers;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
  static Scanner key = new Scanner(System.in);

  public static void main(String[] args) {
       play();
       //playAgain();
    
  }

  private static void play() {
    System.out.println("Choose a number to play story! \n 1 = Super Hero Interaction \n 2 = Human Interaction");
      int ch = key.nextInt(); 
      if(ch == 1 || ch == 2){
        chooseStory(ch);
      } else {
        System.out.println("Are you competent enough? Please follow directions;");
        play();
      }
  }

  public static void playAgain(){
    System.out.println("Would you like to play again? Type Y for yes or N for no");
    String in = key.nextLine();
    if( in == "Y" || in == "y"){
      play();
    } else if (in == "N" || in == "n"){
      System.out.println("Thank you for tuning into Faith's stories.");
    } else {
      System.out.println("Please be competent enough to follow directions. \n Type Y for yes or N for no");
      playAgain();
    }

  }

  public static void runSuperHeroInteraction() {
    String ability = "";
    SuperHuman spiderMan = new SuperHuman("SpiderMan", "Spider", HeroStatus.HERO);
    System.out.println(spiderMan.getAlias() + " goes bad. They have been consumed by the darkness.");
    System.out.println("What new ability does " + spiderMan.getAlias() + " have?");
    ability = key.next();
    spiderMan.setAbility(ability);
    System.out.print(spiderMan.getAlias() + " now has the the ability to " + spiderMan.getAbility());

    System.out.println("What does he say in battle?");
    System.out.println(spiderMan.catchPhrase());

  }

  public static void runHumanInteraction(){
    LocalDate date1 = LocalDate.of(1945, 4, 28);
    LocalDate date2 = LocalDate.of(1965, 7, 15);

    Human hu1 = new Human("Billy", 67, date1);
    Human hu2 = new Human("Christina", 58, date2);
    System.out.println("Here is the first human's gender: " + hu1.getGender() + " Looks like Billy doesn't know who they are.");
    String str = "";
    System.out.println("Enter an address for " + hu2.getName());
    str = key.next();
    hu2.setAddress(str);
    System.out.println(hu2.getName() + " now lives at " + hu2.getAddress()); 

  }

  public static void chooseStory(int choice){
    if(choice == 1){
      System.out.println("You have chosen a super story!");
      runSuperHeroInteraction();
    }
    if(choice == 2){
      System.out.println("You have chosen a basic story!");
      runHumanInteraction();
    }


   
  }
 
  
}