# This sample code uses the Appium python client
# pip install Appium-Python-Client
# Then you can paste this into a file and simply run with Python

from appium import webdriver

caps = {}
caps["platformName"] = "Android"
caps["deviceName"] = "Pixel XL"
caps["app"] = "C:\\Users\\james\\Desktop\\aws-device-farm-sample-app-for-android\\app\\build\\outputs\\apk\\app-debug.apk"
caps["platformVersion"] = "7.1.1"

driver = webdriver.remote("http://localhost:4723/wd/hub", caps)

el1 = driver.find_element_by_accessibility_id("ReferenceApp")
el1.click()
el2 = driver.find_element_by_xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[8]")
el2.click()
el3 = driver.find_element_by_id("com.android.packageinstaller:id/permission_deny_button")
el3.click()

driver.quit()