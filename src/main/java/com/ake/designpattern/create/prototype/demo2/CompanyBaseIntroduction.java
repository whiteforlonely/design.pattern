package com.ake.designpattern.create.prototype.demo2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CompanyBaseIntroduction extends AbstractPrototype{

	private Map<String, String> introduceMap = new HashMap<String, String>();
	
	public CompanyBaseIntroduction(){}
	
	public CompanyBaseIntroduction(Map<String, String> map){
		introduceMap = map;
	}
	
	@Override
	public AbstractPrototype cloneMySelf() {
		AbstractPrototype object = new CompanyBaseIntroduction();
		return object;
	}
	
	@Override
	public void addSomeIntroduction(String topic, String content) {
		introduceMap.put(topic, content);
	}

	@Override
	public void deleteSomeIntroduction(String key) {
		if (introduceMap.containsKey(key)) {
			introduceMap.remove(key);
		}
	}

	@Override
	public void showIntroduction() {
		Iterator<String> it = introduceMap.keySet().iterator();
		String key, value;
		while (it.hasNext()) {
			key = it.next();
			value = introduceMap.get(key);
			
			System.out.println("key: " + key + ", value: " + value);
		}
	}
	
	public void addIntroduceMap(Map<String, String> map){
		introduceMap.putAll(map);
	}
	
	public Map<String, String> getIntroduceMap(){
		return introduceMap;
	}

	
}
