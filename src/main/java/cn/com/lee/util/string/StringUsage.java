package cn.com.lee.util.string;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

/**
 * this class is used as a Demo to call StringUtil
 * @author lizhiwei
 *
 */
public class StringUsage {
	public static void main(String[] args) {

		/****examples****/
		//判空
		String tem1 = null;
		System.out.println(StringUtils.isEmpty(tem1));
		
		//去空格
		String tem2 = " hello you! ";
		System.out.println(StringUtils.trim(tem2));
		
		//用省略号代替
		String tem3 = "i think you are a good man!";
		System.out.println(StringUtils.abbreviate(tem3, 7));
		
		//首字母大写
		String tem4 = "mr.lee";
		System.out.println(StringUtils.capitalize(tem4));
		
		//判断是否包含
		System.out.println(StringUtils.contains("i have a pen", "have"));
		
		//判断是否数字
		System.out.println(StringUtils.isNumeric("5"));
		
		//去除指定字符
		System.out.println(StringUtils.remove("nooooooo....", "o"));
		
		//按指定分隔符生成字串
		System.out.println(StringUtils.repeat("?", ",", 3));
		
		//分割字符串--注意会合并重复的分隔符
		Arrays.asList(StringUtils.split("a/b/c//d", "/")).stream().forEach(System.out::println);
		
		//you can find more in StringUtils
	}
}
