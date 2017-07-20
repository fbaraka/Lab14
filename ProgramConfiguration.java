public class ProgramConfiguration {

    private int connectionLimit;
    private int portNumber;
    private String Url;
    private int timeout;

    // this is what defines a singleton design pattern

    private static ProgramConfiguration instance;
    public static ProgramConfiguration getInstance () {
        if (instance == null) {
            instance = new ProgramConfiguration();
        }
        return instance;
    }


    //Getters and Setters

    public int getConnectionLimit() {
        return connectionLimit;
    }

    public void setConnectionLimit(int connectionLimit) {
        this.connectionLimit = connectionLimit;
    }

    public int getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}
