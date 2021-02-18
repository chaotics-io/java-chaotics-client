package io.chaotics.api;

import java.util.Map;

public class ApiResponse {

    private Integer responseStatusCode;
    private String responseContentType;
    private String charset;
    private Map<String, String> responesHeaders;
    private String responseBody;
    private Integer weight;
    private Integer latency;

    public ApiResponse(Integer responseStatusCode, String responseContentType, String charset, Map<String, String> responesHeaders, String responseBody, Integer weight, Integer latency) {
        this.responseStatusCode = responseStatusCode;
        this.responseContentType = responseContentType;
        this.charset = charset;
        this.responesHeaders = responesHeaders;
        this.responseBody = responseBody;
        this.weight = weight;
        this.latency = latency;
    }

    public ApiResponse() {
    }

    public static ApiResponseBuilder builder() {
        return new ApiResponseBuilder();
    }

    public Integer getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public String getResponseContentType() {
        return this.responseContentType;
    }

    public String getCharset() {
        return this.charset;
    }

    public Map<String, String> getResponesHeaders() {
        return this.responesHeaders;
    }

    public String getResponseBody() {
        return this.responseBody;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public Integer getLatency() {
        return this.latency;
    }

    public void setResponseStatusCode(Integer responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
    }

    public void setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public void setResponesHeaders(Map<String, String> responesHeaders) {
        this.responesHeaders = responesHeaders;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setLatency(Integer latency) {
        this.latency = latency;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ApiResponse)) return false;
        final ApiResponse other = (ApiResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$responseStatusCode = this.getResponseStatusCode();
        final Object other$responseStatusCode = other.getResponseStatusCode();
        if (this$responseStatusCode == null ? other$responseStatusCode != null : !this$responseStatusCode.equals(other$responseStatusCode))
            return false;
        final Object this$responseContentType = this.getResponseContentType();
        final Object other$responseContentType = other.getResponseContentType();
        if (this$responseContentType == null ? other$responseContentType != null : !this$responseContentType.equals(other$responseContentType))
            return false;
        final Object this$charset = this.getCharset();
        final Object other$charset = other.getCharset();
        if (this$charset == null ? other$charset != null : !this$charset.equals(other$charset)) return false;
        final Object this$responesHeaders = this.getResponesHeaders();
        final Object other$responesHeaders = other.getResponesHeaders();
        if (this$responesHeaders == null ? other$responesHeaders != null : !this$responesHeaders.equals(other$responesHeaders))
            return false;
        final Object this$responseBody = this.getResponseBody();
        final Object other$responseBody = other.getResponseBody();
        if (this$responseBody == null ? other$responseBody != null : !this$responseBody.equals(other$responseBody))
            return false;
        final Object this$weight = this.getWeight();
        final Object other$weight = other.getWeight();
        if (this$weight == null ? other$weight != null : !this$weight.equals(other$weight)) return false;
        final Object this$latency = this.getLatency();
        final Object other$latency = other.getLatency();
        if (this$latency == null ? other$latency != null : !this$latency.equals(other$latency)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ApiResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $responseStatusCode = this.getResponseStatusCode();
        result = result * PRIME + ($responseStatusCode == null ? 43 : $responseStatusCode.hashCode());
        final Object $responseContentType = this.getResponseContentType();
        result = result * PRIME + ($responseContentType == null ? 43 : $responseContentType.hashCode());
        final Object $charset = this.getCharset();
        result = result * PRIME + ($charset == null ? 43 : $charset.hashCode());
        final Object $responesHeaders = this.getResponesHeaders();
        result = result * PRIME + ($responesHeaders == null ? 43 : $responesHeaders.hashCode());
        final Object $responseBody = this.getResponseBody();
        result = result * PRIME + ($responseBody == null ? 43 : $responseBody.hashCode());
        final Object $weight = this.getWeight();
        result = result * PRIME + ($weight == null ? 43 : $weight.hashCode());
        final Object $latency = this.getLatency();
        result = result * PRIME + ($latency == null ? 43 : $latency.hashCode());
        return result;
    }

    public String toString() {
        return "ApiResponse(responseStatusCode=" + this.getResponseStatusCode() + ", responseContentType=" + this.getResponseContentType() + ", charset=" + this.getCharset() + ", responesHeaders=" + this.getResponesHeaders() + ", responseBody=" + this.getResponseBody() + ", weight=" + this.getWeight() + ", latency=" + this.getLatency() + ")";
    }

    public static class ApiResponseBuilder {
        private Integer responseStatusCode;
        private String responseContentType;
        private String charset;
        private Map<String, String> responesHeaders;
        private String responseBody;
        private Integer weight;
        private Integer latency;

        ApiResponseBuilder() {
        }

        public ApiResponse.ApiResponseBuilder withResponseStatusCode(Integer responseStatusCode) {
            this.responseStatusCode = responseStatusCode;
            return this;
        }

        public ApiResponse.ApiResponseBuilder withResponseContentType(String responseContentType) {
            this.responseContentType = responseContentType;
            return this;
        }

        public ApiResponse.ApiResponseBuilder withCharset(String charset) {
            this.charset = charset;
            return this;
        }

        public ApiResponse.ApiResponseBuilder withResponesHeaders(Map<String, String> responesHeaders) {
            this.responesHeaders = responesHeaders;
            return this;
        }

        public ApiResponse.ApiResponseBuilder withResponseBody(String responseBody) {
            this.responseBody = responseBody;
            return this;
        }

        public ApiResponse.ApiResponseBuilder withWeight(Integer weight) {
            this.weight = weight;
            return this;
        }

        public ApiResponse.ApiResponseBuilder withLatency(Integer latency) {
            this.latency = latency;
            return this;
        }

        public ApiResponse build() {
            return new ApiResponse(responseStatusCode, responseContentType, charset, responesHeaders, responseBody, weight, latency);
        }

        public String toString() {
            return "ApiResponse.ApiResponseBuilder(responseStatusCode=" + this.responseStatusCode + ", responseContentType=" + this.responseContentType + ", charset=" + this.charset + ", responesHeaders=" + this.responesHeaders + ", responseBody=" + this.responseBody + ", weight=" + this.weight + ", latency=" + this.latency + ")";
        }
    }
}
