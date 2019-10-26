package ch07.exam;

public class Account {
	String 계좌번호;
	String 예금주;
	int 잔액;
	
	public Account () {
		
	}
	
	public Account(String 계좌번호, String 예금주, int 잔액) {
		this.계좌번호 = 계좌번호;
		this.예금주 = 예금주;
		this.잔액 = 잔액;
	}
	
	String 계좌정보() {
		return "[계좌번호:" + 계좌번호 + "] 잔액" + 잔액;
	}
}
