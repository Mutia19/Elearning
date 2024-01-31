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

WebUI.click(findTestObject('Object Repository/Upload/Page_Home  Elearning CMS/a_Master Library'))

WebUI.click(findTestObject('Object Repository/Upload/Page_Home  Elearning CMS/a_Dokumen'))

WebUI.click(findTestObject('Object Repository/Upload/Page_Document  Elearning CMS/button_Tambah                              _41e805'))

WebUI.click(findTestObject('Object Repository/Upload/Page_Document  Elearning CMS/span_select2-selection__arrow'))

WebUI.setText(findTestObject('Object Repository/Upload/Page_Document  Elearning CMS/input_select2-search__field'), 'PKN')

WebUI.sendKeys(findTestObject('Object Repository/Upload/Page_Document  Elearning CMS/input_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Upload/Page_Document  Elearning CMS/input_name'), 'Document')

WebUI.click(findTestObject('Document_type/Page_Document  Elearning CMS/Click_search'))

WebUI.setText(findTestObject('Document_type/Page_Document  Elearning CMS/Input_value'), 'PDF')

WebUI.sendKeys(findTestObject('Object Repository/Upload/Page_Document  Elearning CMS/input_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.uploadFile(findTestObject('Upload/input_icon/Page_Document  Elearning CMS/input_icon'), 'C:\\Users\\1775\\Pictures\\Toy Story\\images.jpg')

WebUI.uploadFile(findTestObject('Upload/input_document/Page_Document  Elearning CMS/input_document'), 'C:\\Users\\1775\\Documents\\Mutia\\Muutia Zaroh (Lion Parcel).pdf')

WebUI.setText(findTestObject('Object Repository/Upload/Page_Document  Elearning CMS/input_description'), 'Ini Document')

WebUI.click(findTestObject('visible/Page_Document  Elearning CMS/input_visible'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('save/Page_Document  Elearning CMS/button_Save'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('Success Save')

WebUI.refresh()

