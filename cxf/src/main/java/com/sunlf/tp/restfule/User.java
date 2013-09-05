package com.sunlf.tp.restfule;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Customer")
public class User {

	private String name;
	private String pswd;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	
	
}
