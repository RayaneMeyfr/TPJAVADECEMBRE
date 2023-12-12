# Diagramme de Classe

```plantuml
@startuml
class Thermometre {
  -temperature: double
  
  +getTemperatureCelsius(): double
  +getTemperatureFahrenheit(): double
  +getTemperatureKelvin(): double
  
  +setTemperatureCelsius(celsius: double): void
  +setTemperatureFahrenheit(fahrenheit: double): void
  +setTemperatureKelvin(kelvin: double): void
}
@enduml

