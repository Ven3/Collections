package Security.tools;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class CommonTool {

	public final static String getMD5(String s) {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		try {
			byte[] strTemp = s.getBytes();
			MessageDigest mdTemp = MessageDigest.getInstance("MD5");
			mdTemp.update(strTemp);
			byte[] md = mdTemp.digest();
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str);
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 写属性key=value到文件，追加模式
	 * 
	 * @param key
	 * @param value
	 */
	public static boolean setProperty(String key, String value) {
		
		try {
			File file = new File(DateTool.class.getResource("/a.properties").getPath().replaceAll("%20", " "));
			// 如果文件不存在，则创建
			if (!file.exists()) {
				file.createNewFile();
			}

			Properties prop = new Properties();
			FileOutputStream oFile = new FileOutputStream(file, true);
			// true表示追加打开
			prop.setProperty(key, value);
			prop.store(oFile, "");
			oFile.close();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	/**
	 * 移除所有key的属性，覆盖模式，不追加
	 * 
	 * @param key
	 * @return 成功 true ，失败 false
	 */
	public static boolean removeProperty(String key) {
		try {
			File file = new File(DateTool.class.getResource("/a.properties").getPath().replaceAll("%20", " "));
			// 如果文件你不存在，则创建
			if (!file.exists()) {
				file.createNewFile();
			}

			Properties prop = new Properties();
			BufferedInputStream fis = new BufferedInputStream(new FileInputStream(file));
			prop.load(fis);
			prop.remove(key);
			FileOutputStream oFile = new FileOutputStream(file);
			prop.store(oFile, null);
			oFile.close();

			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	/**
	 * 获得所有属性，返回一个String,String的Map
	 * 
	 * @return
	 */
	public static Map<String, String> getProperyies() {
		Properties prop = new Properties();

		Map<String, String> props = new HashMap<String, String>();
		try {

			File file = new File(DateTool.class.getResource("/a.properties").getPath().replaceAll("%20", " "));
			// 读取属性文件a.properties
			InputStream in = new BufferedInputStream(new FileInputStream(file));
			prop.load(in);
			// 加载属性列表
			Iterator<String> it = prop.stringPropertyNames().iterator();
			while (it.hasNext()) {
				String key = it.next();
				props.put(key, prop.getProperty(key));
				// System.out.println(key + ":" + prop.getProperty(key));
			}
			in.close();
			return props;
		} catch (Exception e) {
			System.out.println(e);
		}

		return null;
	}

	/**
	 * 读取key的属性值
	 * 
	 * @param key
	 * @return
	 */
	public static String getProperty(String key) {
		Properties prop = new Properties();

		try {
			File file = new File(DateTool.class.getResource("/a.properties").getPath().replaceAll("%20", " "));
			// 读取属性文件a.properties
			InputStream in = new BufferedInputStream(new FileInputStream(file));
			prop.load(in);
			// 加载属性列表
			return prop.getProperty(key);
		} catch (Exception e) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(e);
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}

		return null;
	}

	/**
	 * 读取所有属性 返回一个字符串
	 * 
	 * @return
	 */
	public static String propsToString() {
		String string = "";
		for (String key : getProperyies().keySet()) {
			string += key + "=" + getProperty(key) + "\n";
		}
		return string;
	}

}
