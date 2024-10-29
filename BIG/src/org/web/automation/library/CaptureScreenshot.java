package org.web.automation.library;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class CaptureScreenshot {

    static String filename = null;

    public static void takeScreenshot(WebDriver driver, String name) {
        try {
            // Use the current date and time for the timestamp
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File f = screenshot.getScreenshotAs(OutputType.FILE);
            filename = "./screenshots/" + name + "_" + timestamp + ".png";
            File fd = new File(filename);
            
            FileUtils.copyFile(f, fd);
        } catch (Exception e) {
            System.out.println("Not able to take screenshot");
        }

        attachScreenshotToReport();
    }

    public static void attachScreenshotToReport() {
        try {
            System.setProperty("org.uncommons.reportng.escape-output", "false");
            File file = new File(filename);
            Reporter.log("<a title=\"Snapshot\" href=\"" + file.getAbsolutePath() + "\">" + 
                "<img width=\"418\" height=\"240\" alt=\"AlternativeName\" title=\"title\" src=\"../surefire-reports/html/screenshots/" + filename + "\"></a>");
        } catch (Exception e) {
            System.out.println("Not able to attach screenshot to report");
        }
    }
}
