package io.chaotics.api;

import java.util.List;

public class CreateApiRequest {

    private List<ApiResponse> apiResponses;
    private Integer expireIn;

    public CreateApiRequest(List<ApiResponse> apiResponses, Integer expireIn) {
        this.apiResponses = apiResponses;
        this.expireIn = expireIn;
    }

    public CreateApiRequest() {
    }

    public static CreateApiResquestBuilder builder() {
        return new CreateApiResquestBuilder();
    }

    public List<ApiResponse> getApiResponses() {
        return this.apiResponses;
    }

    public void setApiResponses(List<ApiResponse> apiResponses) {
        this.apiResponses = apiResponses;
    }

     /**
     * By setting the expire in attribute, your endpoint will automatically be deleted
     * in the amount of days set.
     *
     * @return expireInDays the amount of days before the endpoint is automatically deleted
     */
    public Integer getExpireIn() {
        return expireIn;
    }

    public void setExpireIn(Integer expireIn) {
        this.expireIn = expireIn;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CreateApiRequest)) return false;
        final CreateApiRequest other = (CreateApiRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$apiResponses = this.getApiResponses();
        final Object other$apiResponses = other.getApiResponses();
        if (this$apiResponses == null ? other$apiResponses != null : !this$apiResponses.equals(other$apiResponses))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CreateApiRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $apiResponses = this.getApiResponses();
        result = result * PRIME + ($apiResponses == null ? 43 : $apiResponses.hashCode());
        return result;
    }

    public String toString() {
        return "CreateApiResquest(apiResponses=" + this.getApiResponses() + ")";
    }

    public static class CreateApiResquestBuilder {
        private List<ApiResponse> apiResponses;
        private Integer expireIn;

        CreateApiResquestBuilder() {
        }

        public CreateApiRequest.CreateApiResquestBuilder withApiResponses(List<ApiResponse> apiResponses) {
            this.apiResponses = apiResponses;
            return this;
        }

        public CreateApiRequest.CreateApiResquestBuilder withExpireIn(Integer expireInDays) {
            this.expireIn = expireInDays;
            return this;
        }

        public CreateApiRequest build() {
            return new CreateApiRequest(apiResponses, expireIn);
        }

        public String toString() {
            return "CreateApiResquest.CreateApiResquestBuilder(apiResponses=" + this.apiResponses + ")";
        }
    }
}
