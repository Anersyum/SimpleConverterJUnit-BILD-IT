
public class BasicConverter {

	// conversion rates
	private final double KILOGRAM_TO_POUND = 2.2046;
	private final double CENTIMETER_TO_INCH = 0.393701;

	public double kilogramToPound(double kilogram) {
		
		return (int)(kilogram * KILOGRAM_TO_POUND * 1000) / 1000.0;
	}

	public double poundToKilogram(double pound) {
		
		double poundToKilogramConversionRate = 1 / KILOGRAM_TO_POUND;

		return (int)(poundToKilogramConversionRate * pound * 1000) / 1000.0;
	}

	public double centimeterToInch(double centimeter) {
		
		return (int) (centimeter * CENTIMETER_TO_INCH * 1000) / 1000.0;
	}

	public double inchToCentimeter(double inch) {
		
		double inchToCentimeterConversionRate = 1 / CENTIMETER_TO_INCH;

		return (int)(inchToCentimeterConversionRate * inch * 1000) / 1000.0;
	}

	public double celsiusToFarenheit(double celsius) {
		
		return (int)(((celsius * 9 / 5) + 32) * 1000) / 1000.0;
	}

	public double farenheitToCelsius(double farenheit) {
		
		return (int)(((farenheit - 32) * 5 / 9) * 1000) / 1000.0;
	}
}
