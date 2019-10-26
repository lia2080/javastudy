package ch05;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTest {
	public static void main(String[] args) throws IOException {
		//������ ������ �����´�.

		Document doc = Jsoup.connect("https://comic.naver.com/webtoon/list.nhn?titleId=626907&weekday=wed").get();

		//���� �߿��� ���ϴ� �κ��� �����´�.

		Elements contents = doc.select("td a");

		for(int i = 0; i < contents.size(); i++) {
			
			
			Element e = contents.get(i);
			String text = e.text();
			System.out.println(text);
			
//			String no = text.substring(0, 4);
//			String title = text.substring(5);
//			System.out.println( no );
//			System.out.println( title );
		}
	}
}
