package com.ake.designpattern.visitor.demo;

/**
 * 访问者模式
 * 访问者有专门继承的接口
 * computer也有多个的继承的接口
 * 虽说是这样，但是总的来说，还是不明白这个观察者模式的意思是什么，想要解决的问题是什么？
 * 意图：主要将数据结构与数据操作分离，这时页面上说的，
 * 首先这个使用的规则，或者是使用的本质方法是什么，就是创建访问者和被访问者的
 * 之前的一个分离，稳定的数据接口和易变的操作的耦合性问题，
 * 在数据基类里面有一个方法接受访问者，将自身的引用传递给访问者。
 * 这边要使用的话， 还有一个关键的前提就是结构对象，并且这个结构对象需要有遍历自身各个对象的方法。
 * 在gof中是这样子定义的：表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素类的前提下定义作用于这些元素的新操作。
 * @author Saturday
 * @date 2018-6-4 上午11:03:34
 * @project design.pattern
 */
public class VisitorPatternDemo {

	
	public static void main(String[] args) {
		
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}

/*
 * 访问者模式把数据结构和作用于结构上的操作解耦合，使得操作集合可相对自由地演化。
访问者模式适用于数据结构相对稳定算法又易变化的系统。因为访问者模式使得算法操作增加变得容易。若系统数据结构对象易于变化，经常有新的数据对象增加进来，则不适合使用访问者模式。
访问者模式的优点是增加操作很容易，因为增加操作意味着增加新的访问者。访问者模式将有关行为集中到一个访问者对象中，其改变不影响系统数据结构。其缺点就是增加新的数据结构很困难。

访问者模式结构图中包含以下5个角色：

　　（1）Visitor（抽象访问者）：抽象访问者为对象结构中每一个具体元素类ConcreteElement声明一个访问操作，从这个操作的名称或参数类型可以清楚知道需要访问的具体元素的类型，具体访问者则需要实现这些操作方法，定义对这些元素的访问操作。

　　（2）ConcreteVisitor（具体访问者）：具体访问者实现了抽象访问者声明的方法，每一个操作作用于访问对象结构中一种类型的元素。

　　（3）Element（抽象元素）：一般是一个抽象类或接口，定义一个Accept方法，该方法通常以一个抽象访问者作为参数。

　　（4）ConcreteElement（具体元素）：具体元素实现了Accept方法，在Accept方法中调用访问者的访问方法以便完成一个元素的操作。

　　（4）ObjectStructure（对象结构）：对象结构是一个元素的集合，用于存放元素对象，且提供便利其内部元素的方法。

要说上面的这个介绍的更加的清晰

适用于对原有系统的重构
 * */