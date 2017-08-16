package cn.com.lee.util.data;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import cn.com.lee.bean.User;
import cn.com.lee.util.date.DateUtil;
import cn.com.lee.util.string.StringUtil;

/**
 * this class is use to show/test the method in JsonUtil class
 * @author lizhiwei
 *
 */
public class JSONUtilUsage {
	public static void main(String[] args) {
		System.out.println(StringUtil.center("JSONUtil test", 50, "="));
		User user;
		try {
			user = new User("123", 22, DateUtil.parseDate("1984-06-01", "yyyy-MM-dd"));
			System.out.println(JsonUtil.generateJSONFromObj(user));
			
			List<User> users = new ArrayList<>();
			for (int i = 0; i < 5; i++) {
				users.add(new User("12"+i, 5+i, DateUtil.parseDate("1984-06-0"+i, "yyyy-MM-dd")));
			}
			System.out.println(JsonUtil.generateJSONFromObj(users));
		} catch (ParseException e1) {
			e1.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		

		String text = "{\"id\":\"123\",\"age\":22,\"birthday\":\"2011-01-01\"}";
		try {
			System.out.println(JsonUtil.parseJsonToObj(text, User.class));
			
			String text1 = "[{\"id\":\"120\",\"age\":5,\"birthday\":\"2011-01-01\"},{\"id\":\"121\",\"age\":6,\"birthday\":\"2011-01-01\"},{\"id\":\"122\",\"age\":7,\"birthday\":\"2011-01-01\"},{\"id\":\"123\",\"age\":8,\"birthday\":\"2011-01-01\"},{\"id\":\"124\",\"age\":9,\"birthday\":\"2011-01-01\"}]";

			System.out.println(JsonUtil.parseJsonToObj(text1, List.class));
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(StringUtil.repeat("=", 50));
	}
}
