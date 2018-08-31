package com.ake.designpattern.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5
{
    
    public MD5()
    {
    }
    
    private final static String[] hexDigits = { "0", "1", "2", "3", "4", "5",
    "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };
    
    /**
     * 转换字节数组�?16进制字串
     * 
     * @param b
     *            字节数组
     * @return 16进制字串
     */
    public static String byteArrayToString(byte[] b)
    {
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < b.length; i++)
        {
            /** 若使用本函数转换则可得到加密结果�?16进制表示，即数字字母混合的形 */
            resultSb.append(byteToHexString(b[i]));
            // 使用本函数则返回加密结果�?10进制数字字串，即全数字形�?
            // resultSb.append(byteToNumString(b[i]));
        }
        return resultSb.toString();
    }
    
    private static String byteToHexString(byte b)
    {
        int n = b;
        if (n < 0)
        {
            n = 256 + n;
        }
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }
    
    public static String encode(String origin,String charname)
	{
		String resultString = null;

		try
		{
			resultString = new String(origin);
			MessageDigest md = MessageDigest.getInstance("MD5");
			resultString = byteArrayToString(md.digest(resultString.getBytes(charname)));
		} catch (Exception ex)
		{

		}
		return resultString;
	}
    
    public static String encode(String origin)
    {
        String resultString = "";
            try
            {
                resultString = new String(origin);
                MessageDigest md = MessageDigest.getInstance("MD5");
                resultString = byteArrayToString(md.digest(resultString.getBytes()));
            } catch (NoSuchAlgorithmException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }       
        return resultString;
    }
    public static void main(String[] args)
    {
        System.out.println(MD5.encode("xcdl8911"));
    }
    
}
