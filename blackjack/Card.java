public class Card {
  private final String[] COLORS = {"Club", "Heart", "Spade", "Diamond"};
  private final String[] VALUES = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

  int color;
  int value;

  Card(int color, int value) {
    this.color = color;
    this.value = value;
  }

  public int possibleColors() {
    return COLORS.length;
  }

  public int possibleValues() {
    return VALUES.length;
  }

  @Override
  public String toString() {
    return VALUES[value] + " of " + COLORS[color];
  }
}
