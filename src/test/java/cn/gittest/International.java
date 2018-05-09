package cn.gittest;

import java.text.MessageFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.junit.Test;

public class International {

	@Test
	public void test() {
		String pattern1 = "{0}，你好！你于  {1} 消费  {2} 元。";
		String pattern2 = "At {1,time,short} On {1,date,long}，{0} paid {2,number, currency}.";
		Object[] params = { "Jack", new GregorianCalendar().getTime(), 8888 };
		String msg1 = MessageFormat.format(pattern1, params);
		MessageFormat mf = new MessageFormat(pattern2, Locale.US);
		String msg2 = mf.format(params);
		System.out.println(msg1);
		System.out.println(msg2);
	}
}
