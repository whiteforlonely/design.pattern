package com.ake.designpattern.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapUtils {

	/**
	 * 使用 Map按key进行排序
	 * @param map
	 * @return
	 */
	public static Map<Integer, Integer> sortMapByKey(Map<Integer, Integer> map) {
		if (map == null || map.isEmpty()) {
			return null;
		}

		Map<Integer, Integer> sortMap = new TreeMap<Integer, Integer>(
				new MapKeyComparator());

		sortMap.putAll(map);

		return sortMap;
	}
	
	/**
	 * 使用 Map按value进行排序
	 * @param map
	 * @return
	 */
	public static Map<Integer, Integer> sortMapByValue(Map<Integer, Integer> oriMap, boolean isDesc) {
		if (oriMap == null || oriMap.isEmpty()) {
			return new TreeMap<Integer, Integer>();
		}
		Map<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
		List<Map.Entry<Integer, Integer>> entryList = new ArrayList<Map.Entry<Integer, Integer>>(
				oriMap.entrySet());
		if(isDesc)
			Collections.sort(entryList, new MapValueDescComparator());
		else
			Collections.sort(entryList, new MapValueAscComparator());
		
		Iterator<Map.Entry<Integer, Integer>> iter = entryList.iterator();
		Map.Entry<Integer, Integer> tmpEntry = null;
		while (iter.hasNext()) {
			tmpEntry = iter.next();
			sortedMap.put(tmpEntry.getKey(), tmpEntry.getValue());
		}
		return sortedMap;
	}
	
	static class MapKeyComparator implements Comparator<Integer>{

		@Override
		public int compare(Integer str1, Integer str2) {
			
			return str1.compareTo(str2);
		}
	}
	static class MapValueAscComparator implements Comparator<Map.Entry<Integer, Integer>> {
		@Override
		public int compare(Entry<Integer, Integer> me1, Entry<Integer, Integer> me2) {

			return me1.getValue().compareTo(me2.getValue());
		}
	}
	static class MapValueDescComparator implements Comparator<Map.Entry<Integer, Integer>> {
		@Override
		public int compare(Entry<Integer, Integer> me1, Entry<Integer, Integer> me2) {

			return me2.getValue().compareTo(me1.getValue());
		}
	}
	
	
	public static boolean isEmpty(Map<?, ?> map) {
        return (map == null || map.isEmpty());
    }
	
	 public static boolean isNotEmpty(Map<?, ?> map) {
	       return !MapUtils.isEmpty(map);
	 }
	
	public static void main(String[] args) {
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

		map.put(1, 52);
		map.put(2, 9);
		map.put(3, 18);
		map.put(4, 10);

//		Map<String, String> resultMap = sortMapByKey(map);	//按Key进行排序
		Map<Integer, Integer> resultMap = sortMapByValue(map, false); //按Value进行排序

		for (Map.Entry<Integer, Integer> entry : resultMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
