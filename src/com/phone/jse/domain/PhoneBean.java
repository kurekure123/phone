package com.phone.jse.domain;

public class PhoneBean { /*expends Object 가 정의 되어야하는데 default 값으로 설정  */
	protected String company; 
	protected String call;
	
	public void setCompany(String company){
		this.company = company;
	}
	public String getCompany() {
		return company;
	}
	public void setCall(String call) {
		this.call = call;
	}
	public String getCall() {
		return call;
	}
	@Override
	public String toString() {
		return String.format("%s 제품으로 %s 에게 전화를 걸다", company, call);
		
		//상위인 super 에서 정의 된 녀석이라 override 됨
	}
	// super = object
}
