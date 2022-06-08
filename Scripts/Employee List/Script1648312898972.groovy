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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

WebUI.setText(findTestObject('Employee/Input Login Panel'), 'Admin')

WebUI.setEncryptedText(findTestObject('Employee/input_Username_txtPassword'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Employee/input_Password_Submit'))

not_run: WebUI.click(findTestObject('Employee/a_Employee List'))

WebUI.click(findTestObject('Employee/Input Employee Name'))

WebUI.click(findTestObject('Employee/input_Sub Unit_btnAdd'))

WebUI.setText(findTestObject('Employee/Input first name'), 'kim')

WebUI.setText(findTestObject('Employee/Input Middle Name'), 'jun')

WebUI.setText(findTestObject('Employee/Input Last Name'), 'myeon')

WebUI.click(findTestObject('Employee/input__btnSave'))

WebUI.click(findTestObject('Employee/input__btnSave'))

WebUI.click(findTestObject('Employee/img_License Expiry Date_ui-datepicker-trigger'))

WebUI.click(findTestObject('Employee/a_16'))

WebUI.click(findTestObject('Employee/input_Gender_personaloptGender'))

WebUI.selectOptionByValue(findTestObject('Employee/select_-- Select --SingleMarriedOther'), 'Single', true)

WebUI.click(findTestObject('Employee/img_License Expiry Date_ui-datepicker-trigger'))

WebUI.click(findTestObject('Employee/a_16'))

WebUI.selectOptionByValue(findTestObject('Employee/select_-- Select --AfghanAlbanianAlgerianAm_aef347'), '194', true)

WebUI.setText(findTestObject('Employee/Input Nick Name'), 'kim junmyeon')

WebUI.setText(findTestObject('Employee/Input Military'), 'AL')

WebUI.click(findTestObject('Employee/input__btnSave'))

WebUI.click(findTestObject('Employee/input_Blood Type_btnEditCustom'))

WebUI.selectOptionByValue(findTestObject('Employee/select_-- Select --                        _4450e7'), 'A-', true)

WebUI.click(findTestObject('Employee/input_Attachments_btnAddAttachment'))

WebUI.click(findTestObject('Employee/input__cancelButton'))

WebUI.click(findTestObject('Employee/a_Contact Details'))

WebUI.click(findTestObject('Employee/input__btnSave'))

WebUI.setText(findTestObject('Employee/Input Address'), 'gangnam ')

WebUI.selectOptionByValue(findTestObject('Employee/select_-- Select --AfghanistanAlbaniaAlgeri_3356b1'), 'AS', true)

WebUI.setText(findTestObject('Employee/Input Home Telephone'), '1234567890')

WebUI.setText(findTestObject('Employee/Input Mobile'), '8727427242')

WebUI.click(findTestObject('Employee/input__btnSave'))

WebUI.click(findTestObject('Employee/a_Job'))

WebUI.click(findTestObject('Employee/input__btnSave'))

WebUI.selectOptionByValue(findTestObject('Employee/select_-- Select --Automation TesterBTestCh_5cefd5'), '3', true)

WebUI.selectOptionByValue(findTestObject('Employee/select_-- Select --FreelanceFull-Time Contr_5d38b4'), '3', true)

WebUI.selectOptionByValue(findTestObject('Employee/select_-- Select --Craft WorkersLaborers an_89e419'), '1', true)

WebUI.click(findTestObject('Employee/img_License Expiry Date_ui-datepicker-trigger'))

WebUI.click(findTestObject('Employee/td_15'))

WebUI.selectOptionByValue(findTestObject('Employee/select_-- Select --AdministrationEngineerin_0b5e46'), '3', true)

WebUI.selectOptionByValue(findTestObject('Employee/select_-- Select --Canadian Regional HQHQ -_944ef9'), '1', true)

WebUI.click(findTestObject('Employee/img_License Expiry Date_ui-datepicker-trigger'))

WebUI.click(findTestObject('Employee/a_10'))

WebUI.click(findTestObject('Employee/img_License Expiry Date_ui-datepicker-trigger'))

WebUI.click(findTestObject('Employee/a_16'))

WebUI.click(findTestObject('Employee/input__btnSave'))

