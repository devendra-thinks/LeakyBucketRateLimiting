public class User {
    private String apiKey;

    // Consider it in seconds
    private int rateLimitingInterval;
    private  int noOfRequests;

    public User(String apiKey, int rateLimitingInterval, int noOfRequests) {
        this.apiKey = apiKey;
        this.rateLimitingInterval = rateLimitingInterval;
        this.noOfRequests = noOfRequests;
    }

    public User() {
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public int getRateLimitingInterval() {
        return rateLimitingInterval;
    }

    public void setRateLimitingInterval(int rateLimitingInterval) {
        this.rateLimitingInterval = rateLimitingInterval;
    }

    public int getNoOfRequests() {
        return noOfRequests;
    }

    public void setNoOfRequests(int noOfRequests) {
        this.noOfRequests = noOfRequests;
    }
}
