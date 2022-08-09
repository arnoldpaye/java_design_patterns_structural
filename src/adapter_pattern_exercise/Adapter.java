package adapter_pattern_exercise;

public class Adapter implements City {
  AsianCity asianCity;

  public Adapter(AsianCity asianCity) {
    this.asianCity = asianCity;
  }

  @Override
  public String getName() {
    return asianCity.getName();
  }

  @Override
  public double getTemperature() {
    return asianCity.getTemperature() * 9 / 5 + 32;
  }

  @Override
  public String getTemperatureScale() {
    return "Fahrenheit";
  }

  @Override
  public boolean getHasWeatherWarning() {
    return asianCity.getHasWeatherWarning();
  }

  @Override
  public void setHasWeatherWarning(boolean hasWeatherWarning) {
    asianCity.setHasWeatherWarning(hasWeatherWarning);
  }
}
