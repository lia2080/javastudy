package ch07.exam;

public class Account {
	String ���¹�ȣ;
	String ������;
	int �ܾ�;
	
	public Account () {
		
	}
	
	public Account(String ���¹�ȣ, String ������, int �ܾ�) {
		this.���¹�ȣ = ���¹�ȣ;
		this.������ = ������;
		this.�ܾ� = �ܾ�;
	}
	
	String ��������() {
		return "[���¹�ȣ:" + ���¹�ȣ + "] �ܾ�" + �ܾ�;
	}
}
