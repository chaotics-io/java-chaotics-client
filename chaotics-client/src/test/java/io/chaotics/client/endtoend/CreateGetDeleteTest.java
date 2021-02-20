package io.chaotics.client.endtoend;

import io.chaotics.api.CreateApiRequest;
import io.chaotics.api.ApiResponse;
import io.chaotics.api.ApiSecretPair;
import io.chaotics.client.ChaoticsClient;
import org.apache.http.client.fluent.Response;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;

public class CreateGetDeleteTest {

    private final ChaoticsClient chaoticsClient = new ChaoticsClient();

    @Test
    public void test() throws IOException {
        CreateApiRequest createApiRequest = CreateApiRequest.builder()
                .withApiResponses(Collections.singletonList(ApiResponse.builder()
                        .withResponseBody("Hello Mark")
                        .withCharset("UTF-8")
                        .withResponseStatusCode(200)
                        .build()))
                .withExpireIn(1)
                .build();
        ApiSecretPair apiSecretPair = chaoticsClient.createEndpoint(createApiRequest);
        System.out.println(apiSecretPair);

        Response response = chaoticsClient.getResponse(apiSecretPair.getApiId());
        System.out.println(response.returnContent().asString());
        chaoticsClient.deleteEndpoint(apiSecretPair);
    }
}
