import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
  private static final String[] COLORS = new String[]{"Clubs", "Diamonds", "Hearts", "Spades"};
  private static final String[] VALUES = new String[]{"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
  List<Card> cards;

  public Deck(int size) {
    cards = new ArrayList<>();
    Collections.shuffle(Arrays.asList(VALUES));
      for (int i = 0; i < size/4; i++) {
        for (String color : COLORS)
          cards.add(new Card(color, VALUES[i]));
        }
    Collections.shuffle(cards);
    cards.toString();
  }

  public String toString(){
    return cards.size() + " cards - " ;
  }

  public void shuffle() {
    Collections.shuffle(cards);
  }

  public Card draw() {
    if (cards.size() == 0) {
      return null;
    }
    Card removed = cards.remove(0);
    return removed;
  }
}
