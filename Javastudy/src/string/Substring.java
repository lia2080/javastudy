package string;

public class Substring {
	public static void main(String args[]) {
		// 
		String str = "Java 개발자 양성을 통한 취업연계과정!!";
		
		//문장의 길이 24
		int len = str.length();
		
		//back space 만들기
		str = str.substring(0, len - 1);
		System.out.println(str);
		
		str = str.substring(0, str.length(); -1);
		System.out.println(str);
		
		
//		String str1 = str.substring(0);
//		System.out.println(str1);
//
//		String str2 = str.substring(5, 8);
//		System.out.println(str2);
	}
}