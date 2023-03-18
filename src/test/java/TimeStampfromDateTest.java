
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import helpers.Date2TimestampHelper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;


import java.io.IOException;

import java.text.ParseException;


public class TimeStampfromDateTest {
    Date2TimestampHelper date2TimestampHelper;
    public static ExtentReports extent;
    public static ExtentTest test;

    @BeforeClass
    public void init() throws IOException {
        extent = new ExtentReports("src/main/resources/Report.html", true);
        test = extent.startTest("API Tests");

        date2TimestampHelper = new Date2TimestampHelper();

    }

    @Test
    public void getTimestampFromDate() throws ParseException {
        String millis = "1451613802";
        if (date2TimestampHelper.getTimeStampFromMillis(millis).equals("2016-01-01 02:03:22")) {
            test.log(LogStatus.PASS, "Millis matched with Date");
        } else {
            test.log(LogStatus.FAIL, "Millis not matched with Date");
        }
    }

    @Test
    public void getMillisFromTimestamp() {
        String dateTimeStamp = "2016-01-01 2:3:22";
        if (date2TimestampHelper.getMillisFromTimeStamp(dateTimeStamp).equals("1451613802")) {
            test.log(LogStatus.PASS, "Timestamp matched with millis");
        } else {
            test.log(LogStatus.FAIL, "Timestamp not matched with millis");
        }
    }

    @Test
    public void getFalseWithWrongTimestamp() {
        String dateTimeStamp = "2016-01-01%2%3A3%3A22";

        if (date2TimestampHelper.getErrorStatus(dateTimeStamp).equals("false")) {
            test.log(LogStatus.PASS, "Error thrown properly");
        } else {
            test.log(LogStatus.FAIL, "No Error shown");
        }

    }

    @Test
    public void getFalseWithWrongMillis() {
        String millis = "aasd2";

        if (date2TimestampHelper.getErrorStatus(millis).equals("false")) {
            test.log(LogStatus.PASS, "Error thrown properly");
        } else {
            test.log(LogStatus.FAIL, "No Error shown");
        }
    }

    @AfterClass
    public static void endTest() {
        extent.endTest(test);
        extent.flush();
    }
}
