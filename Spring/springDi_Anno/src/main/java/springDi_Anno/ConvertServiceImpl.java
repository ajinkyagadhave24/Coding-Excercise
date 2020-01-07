package springDi_Anno;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("convertService")
public class ConvertServiceImpl implements ConvertService{
	
	@Value("32.0")
	private double convertval;
	// temperatureConverterImpl
	
	public  ConvertServiceImpl()
	{
		System.out.println(" ConvertServiceImpl()");
	}
	
	public double getFixedVal() {
		System.out.println("getFixedVal()");
		return convertval;
	}
	
}
