package GENERICUTILITIES;

import java.io.FileInputStream;
import java.util.Properties;



public class FILEUTILITY {
	public String getPropertyKeyValue(String key) throws Throwable {
		FileInputStream file=new FileInputStream(IPATHCONSTANT.PROPERTY_FILEPATH);

		Properties prop=new Properties();

		prop.load(file);

		return prop.getProperty(key);
	}

}
