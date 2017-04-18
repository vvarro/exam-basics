public class Card {
  String color;
  String value;

  public String getColor() {
    return color;
  }

  public Card(String color, String value){
    this.color = color;
    this.value = value;
  }

  public String toString() {
    return value + " " + color;
  }
}
