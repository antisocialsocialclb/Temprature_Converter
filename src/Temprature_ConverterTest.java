import static org.junit.jupiter.api.Assertions.assertEquals;

class Temprature_ConverterTest {

    @org.junit.jupiter.api.Test
    void celcius_to_Fahrenheit() {
        double celcius = 25.0;
        double expected = 77.0;
        double result = Temprature_Converter.Celcius_to_Fahrenheit(celcius);
        assertEquals(expected, result, 0.01);
    }

    @org.junit.jupiter.api.Test
    void celcius_to_Kelvin() {
        double celcius = 25.0;
        double expected = 298.15;
        double result = Temprature_Converter.Celcius_to_Kelvin(celcius);
        assertEquals(expected, result, 0.01);
    }

    @org.junit.jupiter.api.Test
    void fahrenheit_to_Celcius() {
        double fahrenheit = 77.0;
        double expected = 25.0;
        double result = Temprature_Converter.Fahrenheit_to_Celcius(fahrenheit);
        assertEquals(expected, result, 0.01);
    }

    @org.junit.jupiter.api.Test
    void fahrenheit_to_Kelvin() {
        double fahrenheit = 77.0;
        double expected = 298.15;
        double result = Temprature_Converter.Fahrenheit_to_Kelvin(fahrenheit);
        assertEquals(expected, result, 0.01);
    }

    @org.junit.jupiter.api.Test
    void kelvin_to_Celcius() {
        double kelvin = 298.15;
        double expected = 25.0;
        double result = Temprature_Converter.Kelvin_to_Celcius(kelvin);
        assertEquals(expected, result, 0.01);
    }

    @org.junit.jupiter.api.Test
    void kelvin_to_Fahrenheit() {
        double kelvin = 298.15;
        double expected = 77.0;
        double result = Temprature_Converter.Kelvin_to_Fahrenheit(kelvin);
        assertEquals(expected, result, 0.01);
    }
}