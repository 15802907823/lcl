package org.andy.alipay.controller;

public class test {
     private  String     name;
     private  Integer    age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "test [name=" + name + ", age=" + age + "]";
	}
	public test(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public test() {
		super();
	}
	
     
     
}
