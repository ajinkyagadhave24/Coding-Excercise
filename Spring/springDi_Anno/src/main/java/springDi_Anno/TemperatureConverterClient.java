package springDi_Anno;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TemperatureConverterClient {

	public static void main(String[] args) throws Exception {
		ApplicationContext factory = new ClassPathXmlApplicationContext("anno.xml");
		TemperatureConverter temp =  (TemperatureConverter) factory.getBean("temperatureConverterImpl");
		double far = temp.ctof(30.0);
		System.out.println("30 C is "+far+" F");
	}

}
