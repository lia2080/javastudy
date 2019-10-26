package ch07;

public class BloodHouse {
	public boolean isPossible(Human human) {
		int age = 0; // 헌혈자의 나이를 확인하여 저장
		boolean isPossible = false; // 헌혈 가능 여부
		/* 넘겨받은 Human 클래스로부터 age 정보 확인 age = ? */
		age = human.age; 
		/* age가 16세 이상 69세 이하 일때만 헌혈 가능하도록 조건문 작성 */
		if(age >= 16 && age <= 69) {
			isPossible = true;
		}
		return isPossible;
	}

	public String action(Human human) {
		String result = ""; // 헌혈 결과 저장
		boolean pos = isPossible(human);
		
		/* isPossible() 메소드를 활용하여 헌혈 가능 여부를 확인하는 조건문 작성 */
		if(pos == true) {
			result = "헌혈이 완료되었습니다. XX님 감사합니다.";
		}  else {
			result = "헌혈이 불가능합니다.";
		}
		
		return result;
	}
}