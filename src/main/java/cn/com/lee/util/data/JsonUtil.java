package cn.com.lee.util.data;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
	/**
	 * parse object to JSON text
	 * @param obj - including the Collection object
	 * @return
	 * @throws JsonProcessingException
	 */
	public static String generateJSONFromObj(Object obj) throws JsonProcessingException{
		ObjectMapper om = new ObjectMapper();
		return om.writeValueAsString(obj);
	}
	
	/**
	 * parse json text to object
	 * @param str
	 * @param clazz
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public static <T> T parseJsonToObj(String str,Class<T> clazz) throws JsonParseException, JsonMappingException, IOException{
		ObjectMapper om = new ObjectMapper();
		return om.readValue(str,clazz);
	}
}
