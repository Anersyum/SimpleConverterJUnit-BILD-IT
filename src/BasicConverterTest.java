import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class BasicConverterTest {

	static BasicConverter converter;
	
	@BeforeClass
	public static void initializeConverter() {
		
		converter = new BasicConverter();
	}
	
	@Test
	public void shouldThrowErrorIfWrongResultOfKilogramToPoundConversion() {
		
		double[][] values = {{100.0, 220.46}, {150.0, 330.69}};
		
		for (int i = 0; i < 2; i++) {
			assertEquals(values[i][1], converter.kilogramToPound(values[i][0]));
		}
	}
	
	@Test
	public void shouldThrowErrorIfWrongResultOfPoundToKilogramConversion() {
		
		double[][] values = {{100.0, 220.46}, {150.0, 330.69}};
		
		for (int i = 0; i < 2; i++) {
			assertEquals(values[i][0], converter.poundToKilogram(values[i][1]));
		}
	}
	
	@Test
	public void shouldThrowErrorIfWrongResultOfFarenheitToCelsiusConversion() {
		
		double[][] values = {{100.0, 37.777}, {150.0, 65.555}};
		
		for (int i = 0; i < 2; i++) {
			assertEquals(values[i][1], converter.farenheitToCelsius(values[i][0]));
		}
	}
	
	@Test
	public void shouldThrowErrorIfWrongResultOfCelsiusToFarenheitConversion() {
		
		double[][] values = {{100.0, 37.77778}, {150.0, 65.55556}};
		
		for (int i = 0; i < 2; i++) {
			assertEquals(values[i][0], converter.celsiusToFarenheit(values[i][1]));
		}
	}
	
	@Test
	public void shouldThrowErrorIfWrongResultOfCentimeterToInchConversion() {
		
		double[][] values = {{100.0, 39.37}, {150.0, 59.055}};
		
		for (int i = 0; i < 2; i++) {
			assertEquals(values[i][1], converter.centimeterToInch(values[i][0]));
		}
	}
	
	@Test
	public void shouldThrowErrorIfWrongResultOfInchToCentimeterConversion() {
		
		double[][] values = {{100.0, 39.3701}, {150.0, 59.05515}};
		
		for (int i = 0; i < 2; i++) {
			assertEquals(values[i][0], converter.inchToCentimeter(values[i][1]));
		}
	}
}
