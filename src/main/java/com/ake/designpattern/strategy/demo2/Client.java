package com.ake.designpattern.strategy.demo2;

public class Client {

	public static void main(String[] args) {
		Player player = new Player();
		player.buy(5000d);
		System.out.println("player need pay: "+player.calLastAmount());
		player.buy(12000d);
		System.out.println("player need pay: "+player.calLastAmount());
		player.buy(12000d);
		System.out.println("player need pay: "+player.calLastAmount());
		player.buy(12000d);
		System.out.println("player need pay: "+player.calLastAmount());
		player.buy(12000d);
		System.out.println("player need pay: "+player.calLastAmount());
	}
}
