package example.customer.util;

public class Response {
    public String responseCode;
    public String responseMsg;
    public String responseData;

    public Response(String responseCode, String responseMsg, String responseData) {
        this.responseCode = responseCode;
        this.responseMsg = responseMsg;
        this.responseData = responseData;
    }
}
