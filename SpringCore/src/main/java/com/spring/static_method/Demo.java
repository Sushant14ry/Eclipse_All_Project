package com.spring.static_method;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{22+12}")
	private int x;
	@Value("#{16+8}")
	private int y;
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double z;
	@Value("#{T(java.lang.Math).E}")
	private double e;
	@Value("#{T(java.lang.Math).PI}")
	private double PI;
	@Value("#{new java.lang.String('Sushant Chaudhary')}")
	private String name;
	@Value("#{8-4>3}")
	private boolean isActive;
	
	public int getX() {
		return x; 
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	
	public double getPI() {
		return PI;
	}
	public void setPI(double pI) {
		PI = pI;
	}
	
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", PI=" + PI + ", name=" + name + ", isActive="
				+ isActive + "]";
	}
	
	
}
