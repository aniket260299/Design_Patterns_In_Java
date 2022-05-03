package creational_design_pattern.builder;

public class Director {
    public static void main(String[] args) {
        HttpClient httpClient = new HttpClient.HttpClientBuilder("POST", "http://test.com/")
                                .setBody("Hi! THere")
                                .setCredentials("abc", "***")
                                .build();

        System.out.println(httpClient);
        /*
            Output :
            HttpClient{ method='POST', url='http://test.com/',
                        userName='abc', passWord='***',
                        header='null', body='Hi! THere'}
         */

    }
}
