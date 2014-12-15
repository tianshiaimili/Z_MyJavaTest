package properties;

import java.io.InputStream;
import java.util.PropertyResourceBundle;
/**
 * 测试读取属性文件 的配置类
 * @author zero
 *
 */
public class PropertiesConfigTest {
	// 版本号
		public static String VERSION;

		// 编码方式
		public static String CHARSET;
		
		// 交易网址
		public static String TRADE_URL;
		
		// 查询网址
		public static String QUERY_URL;

		// 商户代码
		public static String MER_ID;

		// 通知URL
		public static String MER_BACK_END_URL;
		
		// 前台通知URL
		public static String MER_FRONT_END_URL;
		
		// 返回URL
		public static String MER_FRONT_RETURN_URL;
		
		// 加密方式
		public static String SIGN_TYPE;

		// 商城密匙，需要和银联商户网站上配置的一样
		public static String SECURITY_KEY;
		
		private static final String KEY_VERSION = "version";
		private static final String KEY_CHARSET = "charset";
		private static final String KEY_TRADE_URL = "upmp.trade.url";
		private static final String KEY_QUERY_URL = "upmp.query.url";
		private static final String KEY_MER_ID = "mer.id";
		private static final String KEY_MER_BACK_END_URL = "mer.back.end.url";
		private static final String KEY_MER_FRONT_END_URL = "mer.front.end.url";
		private static final String KEY_SIGN_METHOD = "sign.method";
		private static final String KEY_SECURITY_KEY = "security.key";
		
		// 成功应答码
		public static final String RESPONSE_CODE_SUCCESS = "00";

		// 签名
		public final static String SIGNATURE = "signature";
		
		// 签名方法
		public final static String SIGN_METHOD = "signMethod";
		
		// 应答码
		public final static String RESPONSE_CODE = "respCode";
		
		// 应答信息
		public final static String RESPONSE_MSG = "respMsg";
		
		private static final String CONF_FILE_NAME = "upmp.properties";
		
		static{
			try {
				
				InputStream inputStream = PropertiesConfigTest.class.getClassLoader().getResourceAsStream(CONF_FILE_NAME);
				PropertyResourceBundle props = new PropertyResourceBundle(inputStream);
				
				VERSION = props.getString(KEY_VERSION);
				CHARSET = props.getString(KEY_CHARSET);
				System.out.println("CHARSET  == "+CHARSET); 
				TRADE_URL = props.getString(KEY_TRADE_URL);
				QUERY_URL = props.getString(KEY_QUERY_URL);
				MER_ID = props.getString(KEY_MER_ID);
				MER_BACK_END_URL = props.getString(KEY_MER_BACK_END_URL);
				MER_FRONT_END_URL = props.getString(KEY_MER_FRONT_END_URL);
				SIGN_TYPE = props.getString(KEY_SIGN_METHOD);
				SECURITY_KEY = props.getString(KEY_SECURITY_KEY);
				
			} catch (Exception e) {
				
				
				
			}
		}

		
		public static void main(String[] args) {
			
			String version = PropertiesConfigTest.VERSION;
			System.out.println("version = "+version);
			
		}
		
}
