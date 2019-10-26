package ch05;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTest {
	public static void main(String[] args) throws IOException {
		//웹에서 내용을 가져온다.

		Document doc = Jsoup.connect("https://comic.naver.com/webtoon/list.nhn?titleId=626907&weekday=wed").get();

		//내용 중에서 원하는 부분을 가져온다.

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
