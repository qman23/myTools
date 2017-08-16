package cn.com.lee.util;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
/**
 * This class is a sample class which need to override the ToString() equals() hashCode(), 
 * you can use apache builder to help you
 * @author lizhiwei
 *
 */
public class BeanUtil {
	public String id;
	
	public String name;
	
	public int age;
	
	public BeanUtil(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.DEFAULT_STYLE).append("id",id).append("name",name).append("age",age).toString();
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder(13,31).append(id).append(name).append(age).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj==this){
			return true;
		}
		if(obj!=null && !(obj instanceof BeanUtil)){
			BeanUtil bu = (BeanUtil)obj;
			result = new EqualsBuilder().append("id",id).append("name", name).append("age", age).isEquals();
		}
		return result;
	}
	public static void main(String[] args) {
		BeanUtil bu = new BeanUtil("123","lee",33);
		System.out.println(bu);
		System.out.println(bu.hashCode());
	}
}
