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

WebUI.navigateToUrl('https://v3-test-11.screenpal.com/')

WebUI.click(findTestObject('Object Repository/Page_ScreenPal (Formerly Screencast-O-Matic_a228d3/a_Log In'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_ScreenPal - Welcome Back - selenium-br_82accc/input_Email_email'))

WebUI.setText(findTestObject('Object Repository/Page_ScreenPal - Welcome Back - selenium-br_82accc/input_Email_email'), 
    'testing@screencast-o-matic.com')

WebUI.click(findTestObject('Object Repository/Page_ScreenPal - Welcome Back - selenium-br_82accc/button_Continue'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_ScreenPal - Enter your password - sele_b05b5c/input_Password_password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ScreenPal - Enter your password - sele_b05b5c/input_Password_password'), 
    'P9ET2sDE0SE=')

WebUI.click(findTestObject('Object Repository/Page_ScreenPal (Formerly Screencast-O-Matic_a228d3/a_Log In'))

WebUI.click(findTestObject('Object Repository/Page_ScreenPal - Enter your password - sele_b05b5c/button_Log In'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_ScreenPal - Videos - selenium-broken-d_707348/img_Tina Taylor_profile-image-md'))

WebUI.click(findTestObject('Object Repository/Page_ScreenPal - Videos - selenium-broken-d_707348/div_Coastal Ecology'))

WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_ScreenPal - Coastal Ecology - bugfix-1_5d8a14/textarea_Description_description'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_ScreenPal - Coastal Ecology - bugfix-1_5d8a14/textarea_Description_description'))

WebUI.closeBrowser()

