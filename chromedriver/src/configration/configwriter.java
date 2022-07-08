package configration;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class configwriter {

	public static void main(String[] args) throws IOException {
		File fs = new File("./Configration/config2.properties");
		FileOutputStream fout = new FileOutputStream(fs);
		Properties prop = new Properties();
		prop.store(fout, "Test Data");
		
		//Properties prop = new Properties();
		
		prop.setProperty("Firstname", "Vasant");
		prop.setProperty("Lastname", "Chavan");
		prop.setProperty("Location", "@Pune");
		//FileOutputStream fout = new FileOutputStream(fs);
		//prop.store(fout, "Test Data");
		
		fout.close();

	}

}
