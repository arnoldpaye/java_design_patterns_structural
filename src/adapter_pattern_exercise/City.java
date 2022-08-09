package adapter_pattern_exercise;

public interface City {

  String getName();
  double getTemperature();
  String getTemperatureScale();
  boolean getHasWeatherWarning();
  void setHasWeatherWarning(boolean hasWeatherWarning);
}
