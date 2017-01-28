package site.danielio.myfi.Data;

public class Response {
    private String response;
    private String WLANSSID;
    private String password;

    public String getResponse() {
        return response;
    }

    public String getWLANSSID() {
        return WLANSSID;
    }

    public String getPassword() {
        return password;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public void setWLANSSID(String WLANSSID) {
        this.WLANSSID = WLANSSID;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
