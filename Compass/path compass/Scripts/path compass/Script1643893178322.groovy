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
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import java.io.FileOutputStream as FileOutputStream

WebUI.openBrowser('')

WebUI.maximizeWindow()

totalrow = findTestData('data').getRowNumbers()

for (i = 648; i <= 800; i++) {
    WebUI.navigateToUrl(findTestData('data').getValue('file_materi', i))
	
	try {

    not_found =WebUI.getText(findTestObject('not found'))

    FileInputStream fis = new FileInputStream('C:\\Users\\User_1\\Documents\\Automation\\Compass\\path compass\\excel\\Book1.xlsx')

    XSSFWorkbook workbook = new XSSFWorkbook(fis)

    XSSFSheet sheet = workbook.getSheetAt(0)

    'Write data to excel'
    sheet.getRow(i).createCell(9).setCellValue(not_found)

    FileOutputStream fos = new FileOutputStream('C:\\Users\\User_1\\Documents\\Automation\\Compass\\path compass\\excel\\Book1.xlsx')

    workbook.write(fos)

    fos.close()}
	catch(Exception e) {
		WebUI.delay(1)
	}
}

