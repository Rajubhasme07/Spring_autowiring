package mybeans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Add_customer {
public static void main (String[] agrs){
	
	
	
	Resource resource=new ClassPathResource("applicationContext.xml");
	BeanFactory factory=new XmlBeanFactory(resource);
	
	
	Customer r=(Customer) factory.getBean("cus");
	System.out.println(r);

}
	
	
	
}
