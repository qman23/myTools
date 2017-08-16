package cn.com.lee.bean;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * test java bean for JSON
 * @author lizhiwei
 *
 */
public class User {
	private String id;
	
	private int age;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date birthday;

	@JsonIgnore
	private String gender;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	

	public User(String id, int age, Date birthday) {
		this.id = id;
		this.age = age;
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public User() {
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.DEFAULT_STYLE).append(id).append(age).append(birthday).build();
	}
}
