package tp2;

public class Thermometre {
    private double temperature;
    private String typeTemperature;

    public Thermometre(double temperature) {
        this.temperature = temperature;
        this.typeTemperature = "Celsius";
    }

    public Thermometre() {
        this.temperature = 0;
        this.typeTemperature = "Celsius";
    }

    public void afficheTemperature() {
        System.out.println(getTemperatureCelsius() + "°C");
        System.out.println(getTemperatureFahrenheit() + "°F");
        System.out.println(getTemperatureKelvin() + "°K");
    }

    public double getTemperatureCelsius() {
        if (typeTemperature.equals("Fahrenheit")) {
            typeTemperature = "Celsius";
            this.temperature = (this.temperature - 32) / 1.8;
        } else if (typeTemperature.equals("Kelvin")) {
            typeTemperature = "Celsius";
            this.temperature -= 273.15;
        }
        return this.temperature;
    }

    public double getTemperatureKelvin() {
        if (typeTemperature.equals("Celsius")) {
            typeTemperature = "Kelvin";
            this.temperature += 273.15;
        } else if (typeTemperature.equals("Fahrenheit")) {
            typeTemperature = "Kelvin";
            this.temperature = (this.temperature - 32) / 1.8 + 273.15;
        }
        return this.temperature;
    }

    public double getTemperatureFahrenheit() {
        if (typeTemperature.equals("Celsius")) {
            typeTemperature = "Fahrenheit";
            this.temperature = temperature * 1.8 + 32;
        } else if (typeTemperature.equals("Kelvin")) {
            typeTemperature = "Fahrenheit";
            this.temperature = (this.temperature - 273.15) * 1.8 + 32;
        }
        return this.temperature;
    }

    public void setTemperatureCelsius(double temperature) {
        this.temperature = temperature;
        typeTemperature = "Celsuis";
    }

    public void setTemperatureKelvin(double temperature) {
        this.temperature = temperature;
        typeTemperature = "Kelvin";
    }

    public void setTemperatureFahrenheit(double temperature) {
            this.temperature = temperature;
            typeTemperature = "Fahrenheit";
    }
}
