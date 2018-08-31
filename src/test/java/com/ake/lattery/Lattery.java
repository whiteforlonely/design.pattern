package com.ake.lattery;

import java.util.ArrayList;
import java.util.List;

public abstract class Lattery {

	private List<Integer> redBalls;
	private List<Integer> blueBalls;
	protected int totalRedBallCount;
	protected int totalBlueBallCount;
	protected int selectedRedBallCount;
	protected int selectedBlueBallCount;
	private int type;
	
	public static final int DOUBLE_COLOR_BALL = 1;
	public static final int BIG_HAPPY_THROUGH = 2;
	
	public Lattery(int type){
		this.type = type;
	}
	
	public int generateBall(List<Integer> balls){
		int position = (int)(Math.random() * balls.size());
		int result = balls.get(position);
		balls.remove(position);
		return result;
	}
	
	///初始化红球
	private void initRedBalls(){
		if (redBalls == null) {
			redBalls = new ArrayList<>();
		}else{
			redBalls.clear();
		}
		for (int i = 0; i < totalRedBallCount; i++) {
			redBalls.add((int)(Math.random() * redBalls.size()), i+1);
		}
		
//		System.err.println("init redballs: "+redBalls);
	}
	
	//初始化篮球
	private void initBlueBalls(){
		if (blueBalls == null) {
			blueBalls = new ArrayList<>();
		}else{
			blueBalls.clear();
		}
		for (int i = 0; i < totalBlueBallCount; i++) {
			blueBalls.add((int)(Math.random() * blueBalls.size()), i+1);
		}
		
//		System.out.println("init blue balls: "+blueBalls);
	}
	
	public List<Integer> generateRedBall(){
		if (redBalls == null || redBalls.size() != totalRedBallCount) {
			initRedBalls();
		}
		List<Integer> resultBalls = new ArrayList<>();
		for(int i = 0; i < selectedRedBallCount; i ++){
			int tempResult = generateBall(redBalls);
			resultBalls.add(tempResult);
		}
		
		System.out.println("generate redBalls: "+resultBalls);
		return resultBalls;
	}
	
	public List<Integer> generateBlueBall(){
		if (blueBalls == null || blueBalls.size() != totalBlueBallCount) {
			initBlueBalls();
		}
		List<Integer> resultBalls = new ArrayList<>();
		for(int i = 0; i < selectedBlueBallCount; i ++){
			int tempResult = generateBall(blueBalls);
			resultBalls.add(tempResult);
		}
		System.out.println("generate blueBalls: "+resultBalls);
		return resultBalls;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	
	
}
