
import java.util.*;
import java.io.*;


public class DieGame implements GamePlayInterface {
	
    private RandomInterface r =new LinearCongruentialGenerator();
    private HashSet<Integer> numbersRolled=new HashSet<Integer>();
	

  public void InitGame() throws Exception {
 
      // The initialisation phase:

      // Actually there isn't anything to do here

        System.out.println();

  }
  
  
  public void PlayGame() throws Exception {

      // The main game:

      // Let the user roll the die twice
      for (int i=0; i<2; i++) {
        System.out.print("Hit <RETURN> to roll the die");
   	  Scanner sc = new Scanner(System.in);   
        String s1 = sc.nextLine();
        int dieRoll=(int)(r.next() * 6) + 1;

        System.out.println("You rolled " + dieRoll);
        System.out.println();
        numbersRolled.add(new Integer(dieRoll));
      }

      // Display the numbers rolled
      System.out.println("Numbers rolled: " + numbersRolled);      
  }

  public void DeclareWinner() throws Exception {

      // Declare the winner:

      // User wins if at least one of the die rolls is a 1
      if (numbersRolled.contains(new Integer(1))) {
        System.out.println("You won!");
      }
      else System.out.println("You lost!");
  }
    

  }