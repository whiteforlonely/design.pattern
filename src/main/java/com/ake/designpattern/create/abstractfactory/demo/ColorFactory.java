package com.ake.designpattern.create.abstractfactory.demo;

import com.ake.designpattern.common.Colors;
import com.ake.designpattern.util.StringUtil;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		if (StringUtil.isEmpty(color)) {
			return null;
		}
		
		if (color.equals(Colors.BLUE)) {
			return new Blue();
		}else if (color.equals(Colors.RED)) {
			return new Red();
		}else if (color.equals(Colors.GREEN)) {
			return new Green();
		}
		
		return null;
	}

	@Override
	public Shape getShape(String  type) {
		// TODO Auto-generated method stub
		return null;
	}

}
