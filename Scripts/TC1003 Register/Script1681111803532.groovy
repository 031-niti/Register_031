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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.classmarker.com/register/')

WebUI.click(findTestObject('Object Repository/Page_Register free for online testing/a_All Test TakersRegister here'))

WebUI.setText(findTestObject('Object Repository/Page_Online testing registration/input_Registration Code_serial'), '12341234124124')

WebUI.setText(findTestObject('Object Repository/Page_Online testing registration/input_First name_first'), 'Niti')

WebUI.setText(findTestObject('Object Repository/Page_Online testing registration/input_Last name_last'), 'Surakongka')

WebUI.setText(findTestObject('Object Repository/Page_Online testing registration/input_Username_iusername'), 'eexrth')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Online testing registration/input_Password_ipassword'), 'h4O11Yk6nIDHwDIH7AR7eA==')

WebUI.verifyTextPresent('This username is available.', false)

WebUI.setText(findTestObject('Object Repository/Page_Online testing registration/input_Email address_email'), '644259031@webnpru.ac.th')

WebUI.click(findTestObject('Object Repository/Page_Online testing registration/input_Thailand_agreeterms'))

WebUI.verifyTextPresent('I agree with the ClassMarker.com Terms & Conditions and Privacy Policy.', false)

WebUI.closeBrowser()

