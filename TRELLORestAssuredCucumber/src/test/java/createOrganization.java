import io.restassured.RestAssured;

public class createOrganization {


    public static void main(String[] args) {



        // Creating New Organization is called New Trello Oragnization
        RestAssured.given()
                .baseUri("https://api.trello.com/1/organizations") // Base URL

                // Defining Parameters as they are : key , Token , and organization name

                .queryParams("displayName","New Trello Organization","key","4ca14719fb690b1aaecf2369e14a148a"
                ,"token","ATTA7d2d038a1646c290ede3b5bbfca328748f638bcd6ec27a5712bd2e004c697a6e799AD79F")

                .header("Accept","application/json") // accepting jason
                .body("{\"displayName\" : \"New Trello Organization\"}\n")
                .when()
                .post().prettyPrint() ;  // displaying in console
    }

}

