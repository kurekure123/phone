package com.phone.jse.domain;

public class Iphone extends CelPhoneBean{
	private String data;
	private final static String KIND = "스마트폰", BRAND = "아이폰";
	// static = syntax 라 get,set 구성이 필요 음슴
	
	public void setData(String data) {
		setMove("이동 중에");
		this.data = data;
	}
	public String getData() {
		return data;
	}
	
	@Override
	public String toString() {
		
		return String.format("%s 이기 때문에 %s 상태에서 %s 으로  %s에게 문자로 %s 이라고 보냄", KIND, move, BRAND, call, data);
	}
	
	// [스마트폰] 이기 때문에 [이동] 상태에서 [아이폰] 으로 [홍길동]에게 데이터를 써서 [안녕] 이라고 보냄 
	//  %s, super , %s , super %s
}
