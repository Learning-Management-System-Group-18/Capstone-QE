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

Mobile.startExistingApplication('com.example.capstone_flutter')

Mobile.tap(findTestObject('Object Repository/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView - Email (2)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.ImageView - Email (3)'), 'bona@gmail.com', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView - Password (2)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.ImageView - Password (3)'), 'bona1234', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/android.widget.Button (4)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (5)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView (3)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.EditText - Subject'), 0)

Mobile.tap(findTestObject('Tambahan/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (4)'), 0)

Mobile.tap(findTestObject('Tambahan/android.widget.ImageView(back terms)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (6)'), 0)

Mobile.tap(findTestObject('Tambahan/android.widget.EditText - Search'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Search (1)'), 'golang', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - golang, Search'), 0)

Mobile.clearText(findTestObject('Tambahan/android.widget.EditText - golang, Search(2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.View (1)'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Tambahan/android.widget.Button(7)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (6)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Search (2)'), 'manajemen', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Tambahan/android.widget.ImageView(back search)'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Tambahan/android.widget.ImageView(select course 2)'), 0)

Mobile.tap(findTestObject('android.view.View (4)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (8)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (9)'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('android.widget.Button (10)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView (8)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (9)'), 0)

Mobile.tap(findTestObject('Tambahan/android.widget.ImageView(back video)'), 0)

Mobile.tap(findTestObject('Tambahan/android.widget.ImageView(slide)'), 0)

Mobile.tap(findTestObject('Tambahan/android.widget.ImageView(back slide)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (11)'), 0)

Mobile.tap(findTestObject('Tambahan/android.widget.ImageView(back quiz)'), 0)

Mobile.tap(findTestObject('Tambahan/android.widget.ImageView(konsul)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.EditText - Add description'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Tambahan/android.widget.ImageView(back ongoing course)'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.View (5)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (13)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (13)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Add your review'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Add your review (1)'), 'nice course!', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/android.widget.Button (14)'), 0)

Mobile.tap(findTestObject('Tambahan/android.widget.Button(ok review)'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Tambahan/android.widget.ImageView(back review)'), 0)

Mobile.tap(findTestObject('Tambahan/android.widget.Button(profile menu)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (15)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (16)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (15)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (17)'), 0)

Mobile.closeApplication()

