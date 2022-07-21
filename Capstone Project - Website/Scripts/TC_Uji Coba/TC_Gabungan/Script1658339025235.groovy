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

for (int i = 1; i <= 2; i++) {
    WebUI.openBrowser('https://level-uppp.netlify.app/')

    WebUI.maximizeWindow()

    String title = WebUI.getWindowTitle()

    String title2 = 'React App'

    if (title.equals(title2)) {
        WebUI.comment('sukses')
    } else {
        WebUI.executeJavaScript('tidak sukses', null)
    }
    
    WebUI.click(findTestObject('User/Register User/Sign up button'))

    WebUI.setText(findTestObject('User/Register User/nama field'), findTestData('data_register').getValue(1, i))

    WebUI.setText(findTestObject('User/Register User/email field'), findTestData('data_register').getValue(2, i))

    WebUI.setText(findTestObject('User/Register User/password field'), findTestData('data_register').getValue(3, i))

    WebUI.click(findTestObject('User/Register User/Sign up button 2'))
}

WebUI.getText(findTestObject('User/Register User/verify register success'))

for (int i = 1; i <= 2; i++) {
    WebUI.setText(findTestObject('User/Login User/email field'), findTestData('data_login').getValue(1, i))

    WebUI.setText(findTestObject('User/Login User/password field'), findTestData('data_login').getValue(2, i))

    WebUI.click(findTestObject('User/Login User/login button'))
}

WebUI.getText(findTestObject('User/Login User/verify success login'))

WebUI.click(findTestObject('User/Category Menu Dropdown/category button'))

WebUI.click(findTestObject('User/Category Menu Dropdown/Page_React App/a_Web  Mobile Developer'))

WebUI.getText(findTestObject('User/Category Menu Dropdown/verify filter category'))

WebUI.click(findTestObject('User/My Course/my course menu'))

WebUI.getText(findTestObject('User/My Course/verify ongoing course'))

WebUI.click(findTestObject('User/My Course/continue course button'))

WebUI.click(findTestObject('User/My Course/navbar'))

WebUI.click(findTestObject('User/My Course/close button'))

WebUI.click(findTestObject('User/My Course/my course menu 2'))

WebUI.click(findTestObject('User/My Course/completed menu'))

WebUI.getText(findTestObject('User/My Course/verify completed course'))

WebUI.click(findTestObject('User/My Course/write review button'))

WebUI.setText(findTestObject('User/My Course/review column'), 'Nice course!')

WebUI.click(findTestObject('User/My Course/submit review button'))

WebUI.click(findTestObject('User/Profile/profile icon'))

WebUI.getText(findTestObject('User/Profile/verify name profile'))

