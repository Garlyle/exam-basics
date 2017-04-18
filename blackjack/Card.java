public class Card {
  private static final String[] COLORS = {"Club", "Heart", "Spade", "Diamond"};
  private static final String[] VALUES = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

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
  public String toString() {
    return VALUES[value] + " of " + COLORS[color];
  }
}
