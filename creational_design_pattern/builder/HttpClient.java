package creational_design_pattern.builder;

public class HttpClient {
    /*
        Steps to create Builder Pattern using static inner class:
        -> Identify required & optional attributes.
        -> Generate getter methods for all attributes.
        -> Make constructor private and initialize all objects using Builder object.
        -> Create inner Static Builder class and copy all attributes inside Builder class.
        -> In builder class make required variables as final and
           provide parameterized constructor for those variables.
        -> Generate builder setter method for optional variables.
        -> create one build method that creates and returns "Product" object.
     */

    //Required Attributes
    private String method;
    private String url;

    //Optional Attributes
    private String userName;
    private String passWord;
    private String header;
    private String body;

    //Getter Methods
    public String getMethod() {
        return method;
    }

    public String getUrl() {
        return url;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getHeader() {
        return header;
    }

    public String getBody() {
        return body;
    }

    //Private Constructor
    private HttpClient(HttpClientBuilder builder) {
        this.method = builder.method;
        this.url = builder.url;
        this.userName = builder.userName;
        this.passWord = builder.passWord;
        this.header = builder.header;
        this.body = builder.body;
    }

    //Builder Class
    public static class HttpClientBuilder {
        private final String method;
        private final String url;
        private String userName;
        private String passWord;
        private String header;
        private String body;

        //Builder Constructor
        public HttpClientBuilder(String method, String url) {
            this.method = method;
            this.url = url;
        }

        //Builder Setter
        public HttpClientBuilder setCredentials(String userName, String passWord) {
            this.userName = userName;
            this.passWord = passWord;
            return this;
        }

        public HttpClientBuilder setHeader(String header) {
            this.header = header;
            return this;
        }

        public HttpClientBuilder setBody(String body) {
            this.body = body;
            return this;
        }

        //build method
        public HttpClient build() {
            return new HttpClient(this);
        }
    }

    @Override
    public String toString() {
        return "HttpClient{" +
                "method='" + method + '\'' +
                ", url='" + url + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", header='" + header + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
