package ch07;

public class Main {
	public static void main(String[] args) {
		/* ������ ���� */
		Human human = new Human();
		human.setName("��");
		human.setType('O');
		human.setAge(20);

		/* BloodHouse ��ü ���� */
		String result = ""; // action() �޼ҵ� ȣ�� ��� ����
		BloodHouse bh = new BloodHouse();
		bh.action(human);

		/* action() �޼ҵ带 ȣ���ϸ鼭 �Ű������� ������ ���� �Ѱ��� */
		/* action() �޼ҵ� ȣ�� ��� ��� */
		System.out.println(result);
	}
}