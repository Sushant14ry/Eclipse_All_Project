package com.spring.standalone_collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
 
public class Person {
	private List<String> friends;
	private Map<String, Integer> feestructure;
	private Properties propertiess;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	
	public Map<String, Integer> getFeestructure() {
		return feestructure;
	}
	
	public Properties getPropertiess() {
		return propertiess;
	}

	public void setPropertiess(Properties propertiess) {
		this.propertiess = propertiess;
	}

	public void setFeestructure(Map<String, Integer> feestructure) {
		this.feestructure = feestructure;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feestructure=" + feestructure + ", propertiess=" + propertiess + "]";
	}
	
	
	
	
}
