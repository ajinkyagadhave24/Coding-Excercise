package springDi_Anno;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TemperatureConverterImpl implements TemperatureConverter{

	private ConvertServiceImpl convertService;
	
	public TemperatureConverterImpl(){
		System.out.println("TemperatureConverterImpl()");
		
	}
	@Autowired
	public TemperatureConverterImpl(ConvertServiceImpl convertService)
	{
		System.out.println("TemperatureConverterImpl(es)");
	}
	
	public double ctof(double cel)
	{
		System.out.println("ctof()");
		return(cel*9/5)+ convertService.getFixedVal();
	}
	
	
	
}
