package org.gaurav.springtutorial;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		//Instantiating using Bean Factory
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//Triangle triangle = (Triangle) factory.getBean("triangle");
		//triangle.draw();
		
		
		//Instantiating Using Application context
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
	}

}
