

public class GameFactory{
  public GamePlayInterface GameChoice(String choice)  {
    
    
    if (choice.equals("c")) {
      return new CardGame();
    }

    else if (choice.equals("d")) {
      return new DieGame();
    }

    else {
      return null;
    }
  }
}