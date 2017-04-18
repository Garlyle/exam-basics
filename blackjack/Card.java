public class Card {
  public static final String[] COLORS = {"Clubs", "Hearts", "Spades", "Diamonds"};
  public static final String[] VALUES = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

  int color;
  int value;

  Card(int color, int value) {
    this.color = color;
    this.value = value;
  }

  public static int possibleColors() {
    return COLORS.length;
  }

  public static int possibleValues() {
    return VALUES.length;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Card) {
      Card other = (Card)obj;
      return this.color == other.color && this.value == other.value;
    }
    return false;
  }

  @Override
  public String toString() {
    return VALUES[value] + " " + COLORS[color];
  }
}
