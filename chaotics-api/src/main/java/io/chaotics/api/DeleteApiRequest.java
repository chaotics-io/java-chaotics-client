package io.chaotics.api;

public class DeleteApiRequest {

    private String apiId;
    private String secret;

    public DeleteApiRequest() {
    }

    public DeleteApiRequest(String apiId, String secret) {
        this.apiId = apiId;
        this.secret = secret;
    }

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
