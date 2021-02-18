package io.chaotics.api;

public class ErrorResponse {

    private int code;
    private String description;

    public ErrorResponse() {
    }

    public ErrorResponse(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String toJson() {
        return "{ \"code\": \"" + code + "\", \"description\": \"" + description + "\"}";
    }
}
