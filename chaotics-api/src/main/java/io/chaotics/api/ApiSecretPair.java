package io.chaotics.api;

public class ApiSecretPair {

    private String apiId;
    private String secret;

    public ApiSecretPair() {
    }

    public ApiSecretPair(String apiId, String secret) {
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

    @Override
    public String toString() {
        return "ApiSecretPair{" +
                "apiId='" + apiId + '\'' +
                ", secret='" + secret + '\'' +
                '}';
    }
}
