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

WebUI.navigateToUrl('https://demo.automationtesting.in/Index.html')

WebUI.click(findTestObject('Object Repository/Page_Index/img_Skip Sign In_enterimg'))

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Full Name_form-control ng-pristine ng_10dee7'), 'tiru')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Full Name_form-control ng-pristine ng_10dee7_1'), 'user1')

WebUI.setText(findTestObject('Object Repository/Page_Register/textarea_Address_form-control ng-untouched _b1abf7'), 'hyderabad')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Email address_form-control ng-untouch_b58296'), 'tiru@test.com')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Phone_form-control ng-untouched ng-in_c98163'), '9512345678')

WebUI.click(findTestObject('Object Repository/Page_Register/label_Male'))

WebUI.click(findTestObject('Object Repository/Page_Register/input_Hobbies_checkbox1'))

WebUI.click(findTestObject('Object Repository/Page_Register/input_Cricket_checkbox2'))

WebUI.click(findTestObject('Object Repository/Page_Register/div_Languages_msdd'))

WebUI.click(findTestObject('Object Repository/Page_Register/a_English'))

WebUI.click(findTestObject('Object Repository/Page_Register/div_English'))

WebUI.click(findTestObject('Object Repository/Page_Register/a_Hindi'))

WebUI.click(findTestObject('Object Repository/Page_Register/div_(adsbygoogle  window.adsbygoogle  ).pus_639123'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_Select Skills                       _fcf818'), 
    'Java', true)

WebUI.click(findTestObject('Object Repository/Page_Register/div_(adsbygoogle  window.adsbygoogle  ).pus_639123'))

WebUI.click(findTestObject('Object Repository/Page_Register/b'))

WebUI.setText(findTestObject('Object Repository/Page_Register/input_concat(, ,  2016, , , , All Rights Re_603754'), 'i')

WebUI.click(findTestObject('Object Repository/Page_Register/div_(adsbygoogle  window.adsbygoogle  ).pus_639123_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_year                             191_0e56cb'), 
    '1984', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_Month                               _920c21'), 
    'May', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_Day                                 _6d848d'), 
    '10', true)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_Password_firstpassword'), 'hUKwJTbofgPskEWN4pMTBw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_Confirm Password_secondpassword'), 'hUKwJTbofgPskEWN4pMTBw==')

WebUI.click(findTestObject('Object Repository/Page_Register/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Register/div_Country                                _3ef95a'))

WebUI.click(findTestObject('Object Repository/Page_Register/div_Country                                _3ef95a'))

WebUI.click(findTestObject('Object Repository/Page_Register/div_(adsbygoogle  window.adsbygoogle  ).pus_639123_1'))

WebUI.click(findTestObject('Object Repository/Page_Register/span_India'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Register/span_India'))

WebUI.setText(findTestObject('Object Repository/Page_Register/input_concat(, ,  2016, , , , All Rights Re_603754'), 'un')

WebUI.click(findTestObject('Object Repository/Page_Register/div_(adsbygoogle  window.adsbygoogle  ).pus_639123_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Register/button_Submit'))

