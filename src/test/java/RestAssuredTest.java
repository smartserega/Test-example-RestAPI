import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;

public class RestAssuredTest {

    @Test
    public void makeSureThatPageIsUp() {
        given().when().get("http://selenide.org").then().statusCode(200);
    }

}

