package springDi;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;


public class TemperatureConverterClient {

	public static void main(String args[]) throws Exception
	{
		Resource res= new ClassPathResource("temperatureConverter.xml");
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(res);
		TemperatureConverter temp=
				(TemperatureConverter) factory.getBean("temperatureConverter");
		double far = temp.ctof(30.0);
		System.out.println("30 C is "+far+"F");
	}
}
