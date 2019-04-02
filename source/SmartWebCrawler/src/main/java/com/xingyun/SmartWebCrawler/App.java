package com.xingyun.SmartWebCrawler;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.xingyun.SmartWebCrawler.util.HttpClientTools;

/**
 * Hello world!
 *
 */
public class App {
	
	private static String URL="http://www.discuz.net/forum.php";
	public static void main(String[] args) throws IOException {
		
		Document doc=Jsoup.connect(URL).timeout(2000).get();
		// 通过class的名字得到（即XX）,一个数组对象Elements里面有我们想要的数据,至于这个div的值呢你打开浏览器按下F12就知道了;
		Elements elements = doc.getElementsByClass("x mbm cl");
		System.out.println("Result---------------------start:");
		for (Element element : elements) {
			// 打印出每一个节点的信息;你可以选择性的保留你想要的数据,一般都是获取个固定的索引;
			if (element != null) {
				System.err.println(element.getAllElements());
				//System.out.println(element.getAllElements());
			}
		}
		System.out.println("Result---------------------End");
	}
}
