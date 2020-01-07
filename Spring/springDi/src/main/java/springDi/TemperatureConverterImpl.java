package springDi;

public class TemperatureConverterImpl implements TemperatureConverter {
	private double fixedval;

	public TemperatureConverterImpl(double fixedval) {
		super();
		this.fixedval = fixedval;
	}
	
	public TemperatureConverterImpl(String fixedval) {
		super();
		this.fixedval = Double.parseDouble(fixedval);
	}
	
	public double ctof(double cel)
	{
		System.out.println("ctof()");
		return(cel*9/5)+fixedval;
	}
	
	
}
