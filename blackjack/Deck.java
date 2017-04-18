import java.util.ArrayList;
import java.util.Collections;

public class Deck {
  ArrayList<Card> deckOfCards;

  public Deck(int cards) {
    deckOfCards = new ArrayList<>();
    int currentColor = 0;

    for (int i = 0; i < cards; i++) {
      Card newCard;
      do {
        newCard = new Card(currentColor, (int) (Math.random() * Card.possibleValues()));
      } while (contains(newCard));
        deckOfCards.add(newCard);
        currentColor++;
        if (currentColor >= Card.possibleColors()) {
          currentColor = 0;
        }
      }
    }

  public boolean contains(Card newCard) {
    for (Card card : deckOfCards) {
      if (card.equals(newCard)) {
        return true;
      }
    }
    return false;
  }

  public int countColors(int color) {
    int count = 0;
    for (Card card : deckOfCards) {
      if (card.color == color) {
        count++;
      }
    }
    return count;
  }

  public Card draw() {
    Card returnCard = deckOfCards.get(0);
    deckOfCards.remove(0);

    return returnCard;
  }

  public void shuffle() {
    Collections.shuffle(deckOfCards);
  }

  @Override
  public String toString() {
    String s = new String();
    s = deckOfCards.size() + " cards - ";

    for (int i = 0; i < Card.possibleColors(); i++) {
      s += countColors(i) + " " + Card.COLORS[i];
      if (i < Card.possibleColors() - 1) {
        s += ", ";
      }
    }
    return s;
  }
}
