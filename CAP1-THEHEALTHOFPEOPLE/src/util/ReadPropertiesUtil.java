package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesUtil {
	private Properties properties = null; 
	public ReadPropertiesUtil() {
		properties = new Properties();
	}
	public Properties readProperties() {
		String urlFile = getClass().getResource("").getPath();
		urlFile = urlFile.replaceFirst("/", "");
		urlFile = urlFile.replaceFirst("/classes/util/", "");
	
		try {
			properties.load(new FileInputStream(urlFile + "/config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties;
	}
}
