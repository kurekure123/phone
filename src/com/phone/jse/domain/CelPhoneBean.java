package com.phone.jse.domain;

public class CelPhoneBean extends PhoneBean{
	//자바는 단일 상속이기에 extends 3인칭 단수형으로 적용됨
	protected String move;
	/* private boolean portable;
	
	public void setPortable(boolean portable) {
		if(portable) {
			this.setMove("이동 상태에서");
		}else {
			this.setMove("정지 상태에서");
		}
		this.portable = portable;
		// getter setter 시 boolean 은 get만  is로 만들어준다.
	}
	public boolean isPortable() {
		return portable; 
	} * */
	public void setMove(String move) {
		this.move = move;
	}
	public String getMove() {
		return move;
	}
	@Override
	public String toString() {
		return String.format("%s 전화기를 가지고, %s %s 에게 전화를 건다", company, move, call);
	}
	// 노키아 휴대폰을 가지고, 이동하면서 홍길동에게 전화를 건다.
}
