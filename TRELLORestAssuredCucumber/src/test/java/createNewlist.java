import io.restassured.RestAssured;

public class createNewlist {
//****************Number 5*****************************
//https://api.trello.com/1/lists?name={name}&idBoard=5abbe4b7ddc1b351ef961414&key=APIKey&token=APIToken


    public static void main(String[] args) {

        variables C = new variables();  // taking an object  C from variables class
        String  U = C.Kei  ; // Putting the key value in a string U
        String  G =C.TToken ; // Putting the key value in a string G
        String  W = C.boardiD;  // Board ID
        RestAssured.given()
                .baseUri("https://api.trello.com/1/lists") // Base URL

                // Defining Parameters as they are : key , Token , and organization name

                .queryParams("name","Project list ","key",U
                        ,"token",G,"idBoard",W)

                .header("Accept","application/json") // accepting jason
                .header("idBoard",W)

                .body("{\"name\" : \"Project list\"}\n")
                .when()
                .post().prettyPrint() ;  // displaying in console
    }





}

