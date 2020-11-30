package com.ake.designpattern.create.prototype.demo3;

/*
 * 或者从这些例子中，我们可以大概的了解圆形模式的一些特点：
 * 创建对象，松耦合。
 * 每个模式都有一定的实现性的角色。
 * 对于原型模式，主要的角色是： 原型抽象类，原型实现类，都有一个clone方法，还有一个类的创建管理器（可能是专门管理原型
 * 实现类的实例的创建和对原型类的实例创建的缓存。）
 * 
 */
public class Client {

	public static void main(String[] args) {
		
		Manager manager = new Manager();
		MessageBox msgBox1 = new MessageBox('#');
		MessageBox msgBox2 = new MessageBox('@');
		UnderlinePen underlinePen = new UnderlinePen('`');
		
		manager.register("m#", msgBox1);
		manager.register("m@", msgBox2);
		manager.register("u_", underlinePen);
		
		Product p1 = manager.create("m#");
		p1.user("YOU ARE MY SUNSHINE!");
		
		Product p2 = manager.create("m@");
		p2.user("GAME OVER!");
		
		Product p3 = manager.create("u_");
		p3.user("This is what you say!");
		
		/*
		 	########################
			# YOU ARE MY SUNSHINE! #
			########################
			@@@@@@@@@@@@@@
			@ GAME OVER! @
			@@@@@@@@@@@@@@
			"This is what you say!"
			```````````````````````
		 */
		
	}
}
