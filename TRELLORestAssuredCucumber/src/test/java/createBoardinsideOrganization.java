import io.restassured.RestAssured;

public class createBoardinsideOrganization {
    //***************NUmber 3***************************
    //https://api.trello.com/1/boards/?name={name}&key=APIKey&token=APIToken
    public static void main(String[] args) {
        variables C = new variables();  // taking an object  C from variables class
        String  U = C.Kei  ; // Putting the key value in a string U
        String  G =C.TToken ; // Putting the key value in a string G
        String  W = C.OrgID;  // Organization ID
        RestAssured.given()
                .baseUri("https://api.trello.com/1/boards/") // Base URL

                // Defining Parameters as they are : key , Token , and organization name

                .queryParams("name","To Do List","key",U
                        ,"token",G)

                .header("Accept","application/json") // accepting jason
                .header("idOrganization",W)

                .body("{\"name\" : \"TO Do List\"}\n")
                .when()
                .post().prettyPrint() ;  // displaying in console
    }


    }



