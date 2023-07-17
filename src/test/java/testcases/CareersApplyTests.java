package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import utility.ReadDataFromPropFile;

public class CareersApplyTests extends BaseTests {

	@Test
	public void validateJoinUs() throws IOException, InterruptedException {
		
		cp.joinUs(ReadDataFromPropFile.readConfigData("name"), ReadDataFromPropFile.readConfigData("email"), ReadDataFromPropFile.readConfigData("phone"), ReadDataFromPropFile.readConfigData("notice_period"), ReadDataFromPropFile.readConfigData("experince"),ReadDataFromPropFile.readConfigData("description"));
	}
}
