package com.ake.designpattern.visitor.demo4;

/**
 * TODO
 *
 * @author : Saturday
 * date 2022/4/2
 * @version V1.0
 */
public class Client {



    public static void main(String[] args) {
        Role role = new KongFuRole();
        KongFuRole kongFuRole = new KongFuRole();

        Actor actor = new OldActor();
        /**
         * 这边方法接收者的类型是Actor类型，
         * 参数的类型是role类型，所以就是编译的时候，决定的是
         * 调用Actor抽象类的act(Role role)方法，运行的时候，不会再去检测
         * 对应的参数的类型了，指挥去重新检测方法接收者的类型，所以
         * 最终还是调用oldActor的弗雷的方法Actor.act(Role role)
         */
        actor.act(role);

        /**
         * 这边参数的类型是KongfuRole， 编译的时候，默认的是
         * 调用弗雷Actor.act(KongfuRole role)方法，但是在
         * 运行的时候，回去重新确定调用者的真是类型，这个时候
         * 发现是OldActor类型的，所以就会调用OldActor.act(KongfuRole role)
         * 方法，也就是这边有一个关键的点就是：在运行的时候
         * 会重新的检查方法的接收者的类型，但是不会重新去检查
         * 参数的类型。这或许就是JVM本身的一种机制。
         */
        actor.act(kongFuRole);

        /**
         * 这边的一种说法就是，在方法的重载的时候，就已经决定了要调用哪个方法，
         * 也就是在编译十七，就已经决定了，要调用act(Role role)方法。
         * 而方法的执行者，确实在运行时指定的。
         */
    }
}
