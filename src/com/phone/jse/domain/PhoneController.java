package com.phone.jse.domain;

import javax.swing.JOptionPane;

public class PhoneController {

	public static void main(String[] orgs){
		while(true) {
			PhoneBean bean = null;
			CelPhoneBean celPhone = null;
			Iphone iphone = null;
			switch(Integer.parseInt(
					JOptionPane.showInputDialog(
							"0. 종료 , 1. 통화, 2. 휴대폰"))) {
			case 0 :
				JOptionPane.showMessageDialog(null, "통화가 종료되었습니다");
				return;
			case 1 :
				bean = new PhoneBean();
				bean.setCompany(JOptionPane.showInputDialog("어디 제품?"));
				bean.setCall(JOptionPane.showInputDialog(
						"통화 대상 입력"));
				JOptionPane.showMessageDialog(null, bean.toString());
				// 어디 제품 ? - 금성 전화기
				// 누구에게 겁니까? 
				// 금성 전화기를 가지고, 홍길동에게 전화를 걸다.
				break;
				
			case 2 :
				bean = new PhoneBean();
				celPhone = new CelPhoneBean();
				
				/* String flag = JOptionPane.showInputDialog(
						"휴대폰 맞습니까? (맞으면 1, 틀리면 0)");
				if(flag.equals("1")) {
					celPhone.setPortable(true);
				}else {
					celPhone.setPortable(false);
				}
				String yn = (flag.equals("1")) ? "이동중에 " : "정지중에";
				// () ? :  ;  
				 * * */
				celPhone.setMove((JOptionPane.showInputDialog(
						"휴대폰 맞습니까? (맞으면 1, 틀리면 0)").equals("1")) ? "이동중에 " : "정지중에");
				celPhone.setCompany(JOptionPane.showInputDialog("어디 제품입니까?"));
				celPhone.setCall(JOptionPane.showInputDialog(
						"누구에게 겁니까?"));
				JOptionPane.showMessageDialog(null, celPhone.toString());
				break;
				
				
				// 휴대폰 맞습니까? (맞으면 1, 틀리면 0)
				// 어디 제품 ? - 금성 전화기
				// 누구에게 겁니까?
				// 노키아 휴대폰을 가지고, 이동하면서 홍길동에게 전화를 건다.
				
			case 3 : 
				iphone = new Iphone();
				iphone.setCall(JOptionPane.showInputDialog("누구에게?"));
				iphone.setData(JOptionPane.showInputDialog("문자 보내기"));
				JOptionPane.showMessageDialog(null, iphone.toString());
				//누구에게 문자 보냅니까/
				//[스마트폰 ] 이기 때문에 [이동] 상태에서 [아이폰]으로 [홍길동]에게 
				//[안녕] 이라고 보냄
			}
		}
	}
}
