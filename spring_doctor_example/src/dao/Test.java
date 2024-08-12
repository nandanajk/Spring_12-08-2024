package dao;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import bean.Doctor;

public class Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Resource resource=new ClassPathResource("applicationContext.xml");
    BeanFactory factory=new XmlBeanFactory(resource);
    Doctor doctor=(Doctor)factory.getBean("d2");
    doctor.display();
  
    Doctor doctor2=(Doctor)factory.getBean("d1");
    doctor2.display();
	}

}
