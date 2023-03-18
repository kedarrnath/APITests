package helpers;

import constants.Constants;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Date2TimestampHelper {
    public Date2TimestampHelper() throws IOException {
        RestAssured.baseURI = Constants.BASEURL;
    }

    public String getTimeStampFromMillis(String dateFormat) {
        String s = given().when().header("User-Agent", "PostmanRuntime/7.6.0").queryParam("cached").queryParam("s", dateFormat).get(Constants.TIMESTAMP_DATE_ENDPOINT).then().extract().asString();
        return s.substring(1,s.length()-1);
    }

    public String getMillisFromTimeStamp(String timestamp) {
        return given().when().header("User-Agent", "PostmanRuntime/7.6.0").queryParam("cached").queryParam("s", timestamp).get(Constants.TIMESTAMP_DATE_ENDPOINT).then().extract().asString();
    }

    public String getErrorStatus(String input) {
        String s = given().when().header("User-Agent", "PostmanRuntime/7.6.0").queryParam("cached").queryParam("s", input).get(Constants.TIMESTAMP_DATE_ENDPOINT).then().extract().asString();
        return s;
    }

}
