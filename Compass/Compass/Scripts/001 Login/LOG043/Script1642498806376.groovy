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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('001 Login/001. input NIK'), NIK)

WebUI.setText(findTestObject('001 Login/002. input password'), password)

WebUI.delay(1)

WebUI.click(findTestObject('001 Login/003. btn masuk'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('001 Login/010. beranda'), 2)

WebUI.delay(1)

WebUI.click(findTestObject('001 Login/026. btn logout'))

WebUI.delay(1)

WebUI.click(findTestObject('001 Login/027. button ya logout'))

WebUI.delay(1)

url_login = WebUI.getUrl()

WebUI.verifyMatch(url_login, 'https://compass.kreditplus.com/compass/beranda#', false)

