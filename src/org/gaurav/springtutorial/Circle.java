package org.gaurav.springtutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {
	private Point center;

	@Override
	public void draw() {

		System.out.println("Center is " + center.getX() + "," + center.getY());
	}

	public Point getCenter() {
		return center;
	}
	
	@Autowired
	public void setCenter(Point center) {
		this.center = center;
	}

}
