import org.junit.Test;
import static io.restassured.RestAssured.given;


public class JIraApi {

    @Test
    public void makeSureJiraIsUp(){
        given()
                .when().get("http://localhost:8080/secure/Dashboard.jspa")
                .then().statusCode(200);
    }
}
