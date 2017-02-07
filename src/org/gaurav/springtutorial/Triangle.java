package org.gaurav.springtutorial;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;

public class Triangle implements ApplicationContextAware, BeanNameAware, Shape {

	private Point pointA, pointB, pointC;
	private ApplicationContext context = null;
	private String beanName = null;

	public void draw() {
		System.out.println(pointA.toString() + " " + pointB.toString() + " " + pointC.toString());
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;

	}

	@Override
	public void setBeanName(String beanName) {

		this.beanName = beanName;
	}

	public Point getPointA() {
		return pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

}
