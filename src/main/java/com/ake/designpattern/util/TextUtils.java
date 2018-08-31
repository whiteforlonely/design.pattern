package com.ake.designpattern.util;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TextUtils
{
	public static String createBracketUrl(Map<String,String> paramMap,String content)
	{
		if(content==null || content.equals(""))
		{
			return "";
		}
		StringBuffer url = new StringBuffer("[url");
		if(!paramMap.isEmpty())
		{
			Set<Entry<String,String>> keys = paramMap.entrySet();
			Iterator<Entry<String,String>> it = keys.iterator();
			while(it.hasNext())
			{
				Entry<String,String> entry = it.next();
				String key = entry.getKey();
				String value = entry.getValue();
				url.append(",").append(key).append("=").append(value);
			}
		}
		url.append("]").append(content).append("[/url]");
		return url.toString();
	}
}
