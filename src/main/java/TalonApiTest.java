import one.talon.api.ApiClient;
import one.talon.api.ApiException;
import one.talon.api.IntegrationAPIApi;
import one.talon.api.model.IntegrationState;
import one.talon.api.model.NewCustomerProfile;

public class TalonApiTest {

	public static void main(String[] args) {
		System.out.println("Hello!");
		
		IntegrationAPIApi api = new IntegrationAPIApi();
		ApiClient client = api.getApiClient();
		client.setApplicationId("18");
		client.setApplicationKey("fefecafedeadbeef");
		client.setBasePath("http://localhost:9000");
		client.setLenientDatetimeFormat(true);
		
		NewCustomerProfile profile = new NewCustomerProfile();
		profile.setName("Factory McJavaFace");
		try {
			IntegrationState result = api.updateCustomerProfile("mcjavaface", profile);
			System.out.println(result.toString());
		} catch (ApiException e) {
			System.out.println(e.getResponseBody());
			e.printStackTrace();
		}
	}

}
