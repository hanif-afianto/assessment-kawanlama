import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//set Global Variable
CustomKeywords.'com.katalon.democura.Utility.setGlobalVariable'(username, password, facility, 
		healthcareProgram, visitDate, comment)

//navigate to homepage
CustomKeywords.'com.katalon.democura.Utility.openURL'(GlobalVariable.baseURL)

WebUI.takeFullPageScreenshot()

//navigate to login page
CustomKeywords.'com.katalon.democura.Utility.clickButton'(findTestObject('homepage/btn/btn_toggle-menu'), 
	FailureHandling.CONTINUE_ON_FAILURE, 'Click Toggle Menu')

CustomKeywords.'com.katalon.democura.Utility.clickButton'(findTestObject('homepage/btn/btn_login-menu'),
	FailureHandling.CONTINUE_ON_FAILURE, 'Click Login Menu')

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('login-page/txt/txt_username-input'), 
	GlobalVariable.Username, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('login-page/txt/txt_password-input'), 
	GlobalVariable.Password, FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

CustomKeywords.'com.katalon.democura.Utility.clickButton'(findTestObject('login-page/btn/btn_login'),
	FailureHandling.CONTINUE_ON_FAILURE, 'Click Login Button')

WebUI.takeFullPageScreenshot()

//navigate to make appointment page
//WebUI.selectOptionByValue(findTestObject('appointment-page/txt/txt_facility'), GlobalVariable.Facility, true)

CustomKeywords.'com.katalon.democura.Utility.clickButton'(findTestObject('appointment-page/btn/btn_options'),
	FailureHandling.CONTINUE_ON_FAILURE, 'Click Facility')

CustomKeywords.'com.katalon.democura.Utility.clickButton'(findTestObject('appointment-page/txt/txt_facility'),
	FailureHandling.CONTINUE_ON_FAILURE, 'Click Selected Facility')

WebUI.check(findTestObject('appointment-page/btn/btn_hospotal-readmission'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.katalon.democura.Utility.clickButton'(findTestObject('appointment-page/btn/btn_healthcare-program'),
	FailureHandling.CONTINUE_ON_FAILURE, 'Click ' + GlobalVariable.HealthcareProgram + ' Radio Button')

WebUI.setText(findTestObject('appointment-page/txt/txt_visit-date'), GlobalVariable.VisitDate, 
	FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('appointment-page/txt/txt_comment'), GlobalVariable.Comment,
	FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

CustomKeywords.'com.katalon.democura.Utility.clickButton'(findTestObject('appointment-page/btn/btn_book-appointment'),
	FailureHandling.CONTINUE_ON_FAILURE, 'Click Login Button')

WebUI.takeFullPageScreenshot()

//logout
CustomKeywords.'com.katalon.democura.Utility.clickButton'(findTestObject('homepage/btn/btn_toggle-menu'),
	FailureHandling.CONTINUE_ON_FAILURE, 'Click Toggle Menu')

WebUI.takeFullPageScreenshot()

CustomKeywords.'com.katalon.democura.Utility.clickButton'(findTestObject('homepage/btn/btn_logout-menu'),
	FailureHandling.CONTINUE_ON_FAILURE, 'Click Logout Menu')

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()