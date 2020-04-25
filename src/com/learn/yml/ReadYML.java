//$Id$
package com.learn.yml;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.yaml.snakeyaml.Yaml;
public class ReadYML {
	public static Logger LOGGER = Logger.getLogger(ReadYML.class.getName());
	public static void main(String[] args)throws IOException {
		LOGGER.info("@@@@@@ Gonna initialize REST 2.0 API conf file @@@@@@");
		Map<String, Object> configMap = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("/Users/tarif-5329/Documents/UI_App_Project/EnumExamples/resources/allresources.yml");
			Yaml yaml = new Yaml();
			configMap = (Map<String, Object>) yaml.load(fis);
		} catch (Exception ex) {
			LOGGER.log(Level.WARNING, null, ex);
		} finally{
				fis.close();
		}

		LOGGER.log(Level.INFO, "Config Map loaded : {0}", configMap);
	}

}
