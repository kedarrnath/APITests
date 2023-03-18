package constants;

public class Constants {

    private Constants() {

    }

    public static final String EXTENTREPORTPATH = System.getProperty("user.dir") + "/ExtentReports/index.html";

    public static final String EXTENTCONFIGFILEPATH = System.getProperty("user.dir")
            + "/src/test/resources/extentreport.xml";

    public static final String BASEURL = "https://helloacm.com/api";

    //Endpoints
    public static final String DATE_TIMESTAMP_ENDPOINT = "/unix-timestamp-converter/";
    public static final String TIMESTAMP_DATE_ENDPOINT = "/unix-timestamp-converter/";


}
