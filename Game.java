import java.io.*;

public class Game {

  // The BufferedReader used throughout
  	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

 
	public static void main(String[] args) throws Exception {
    // Ask a game to play

    System.out.print("Card (c) or Die (d) game? ");
    String ans=br.readLine();
   
    GameFactory factory = new GameFactory();

    GamePlayInterface PresentGame = factory.GameChoice(ans);

	 // play current game

    if (PresentGame != null) {   
    
		PresentGame.InitGame();
    	PresentGame.PlayGame();		
	   PresentGame.DeclareWinner();	
	   
	   }
	   
	 else System.out.println("I dont know that game"); 


                                                         } 
  //}nput not understood");
                                                         }
  //}