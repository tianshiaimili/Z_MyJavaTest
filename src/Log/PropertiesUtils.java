package Log;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.Vector;

import Log.MissingPropertyException;
/**
 * 这是一个读取属性文件的工具类
 * @author Administrator
 *
 */
public class PropertiesUtils {
	public static Properties loadPropertiesFile(String propertiesFile) throws Exception {
		Properties runtimeProperties = new Properties();
		FileInputStream propertiesFileStream = null;
		try {
			propertiesFileStream = new FileInputStream(propertiesFile);
			runtimeProperties.load(propertiesFileStream);
		} catch (Exception object) {
			if (propertiesFileStream != null)
				propertiesFileStream.close();
			throw object;
		}
		if (propertiesFileStream != null)
			propertiesFileStream.close();
		return runtimeProperties;
	}

	public static Properties loadPropertiesURL(String propertiesURLStr) throws IOException {
		URL propertiesURL = new URL(propertiesURLStr);
		InputStream propertiesFileStream = propertiesURL.openStream();
		Properties runTimeProperties = new Properties();
		runTimeProperties.load(propertiesFileStream);
		propertiesFileStream.close();
		return runTimeProperties;
	}

	public static Properties combineProperties(Properties baseProperties, Properties overridingProperties) {
		if (overridingProperties == null)
			return baseProperties;
		Properties runtimeProperties = new Properties();
		if (baseProperties != null) {
			Enumeration propKeyEnum = baseProperties.propertyNames();
			while (propKeyEnum.hasMoreElements()) {
				String propertyKey = (String) propKeyEnum.nextElement();
				String propertyValue = baseProperties.getProperty(propertyKey);
				runtimeProperties.put(propertyKey, propertyValue);
			}
		}
		if (overridingProperties != null) {
			Enumeration propKeyEnum = overridingProperties.propertyNames();
			while (propKeyEnum.hasMoreElements()) {
				String propertyKey = (String) propKeyEnum.nextElement();
				String propertyValue = overridingProperties.getProperty(propertyKey);
				runtimeProperties.put(propertyKey, propertyValue);
			}
		}
		return runtimeProperties;
	}

	public static String getMandatoryProperty(Properties runtimeProperties, String propertyName) throws MissingPropertyException {
		String propertyValue = runtimeProperties.getProperty(propertyName);
		if (propertyValue == null)
			throw new MissingPropertyException(("Missing property [" + propertyName + "]"), propertyName);
		return propertyValue;
	}

	public static List getProperties(Map inMap, String name) {
		List result = new Vector();
		Map propMap = new TreeMap(inMap);
		Iterator it = propMap.keySet().iterator();
		Object obj = null;
		while (it.hasNext()) {
			obj = it.next();
			if (obj != null && obj.toString().startsWith(name + "."))
				result.add(propMap.get(obj));
		}
		return result;
	}
}
