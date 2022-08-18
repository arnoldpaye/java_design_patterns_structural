package flyweight_pattern_example;

public interface Vehicle {
  String getType();
  int[] getLocation();
  void setLocation(int latitude, int longitude);
}
