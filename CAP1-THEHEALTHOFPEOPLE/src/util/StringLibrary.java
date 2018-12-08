package util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.Normalizer;
import java.util.regex.Pattern;

public class StringLibrary {

	public static String md5(String str) {
		String rs = null;
		try {
			MessageDigest md = MessageDigest.getInstance("md5");
			md.update(str.getBytes());
			BigInteger bigInteger = new BigInteger(1, md.digest());
			rs = bigInteger.toString(16);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return rs;
	}

	public static String createSlug(String title) {
		String slug = Normalizer.normalize(title, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		slug = pattern.matcher(slug).replaceAll("");
		slug = slug.toLowerCase();
		// Thay đ thành d
		slug = slug.replaceAll("đ", "d");
		// Xóa các kí tự đặc biệt
		slug = slug.replaceAll("([^0-9a-z-\\s])", "");
		// Thay space thành dấu gạch ngang
		slug = slug.replaceAll("[\\s]", "-");
		// đổi nhiều ký tự gạch ngang liên tiếp thành một dấu gạch ngang
		slug = slug.replaceAll("(-+)", "-");
		// Xóa các ký tự gạch ngang ở đầu và cuối
		slug = slug.replaceAll("^-+", "");
		slug = slug.replaceAll("-+$", "");
		return slug;
	}
}
