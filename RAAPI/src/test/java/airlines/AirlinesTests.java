package airlines;

import java.io.IOException;
//import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
//import restUtils.RestUtils;
//import utils.JsonUtils;

public class AirlinesTests extends AirlineAPIs{

	@Test
	//***Execution can be achieved only through TestNG.xml file because of listener***//
	public void createAirlines() throws IOException {
		/*
		String env = System.getProperty("env") == null ? "qa" : System.getProperty("env");
		Map<String, Object> data = JsonUtils.getJsonDataAsMap("airlines/"+env+"/airlinesApiData.json");
		String endpoint = (String) data.get("createAirLineEndpoint");
		Map<String, Object> payload = Payloads.getCreateAirlinePayloadFromMap("AQ789", "ABC Airline", "IN", "ABC",
				"ANC Slogan", "Sri Lanka", "www.srilankaaairways.com", "1990");
		Response response = RestUtils.performPost(endpoint, payload, new HashMap<>());
		Assert.assertEquals(response.statusCode(), 200);
		*/
		
		Map<String, Object> payload = Payloads.getCreateAirlinePayloadFromMap();
		Response response = createAirline(payload);
		Assert.assertEquals(response.statusCode(), 200);
	}
}
