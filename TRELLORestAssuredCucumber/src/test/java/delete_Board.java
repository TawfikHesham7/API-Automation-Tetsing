import io.restassured.RestAssured;

public class delete_Board {
//******************Number 8 *********************
    //https://api.trello.com/1/boards/{id}?key=APIKey&token=APIToken

    public static void main(String[] args) {
        variables C = new variables();  // taking an object  C from variables class
        String  U = C.Kei  ; // Putting the key value in a string U
        String  G =C.TToken ; // Putting the key value in a string G
        String  W = C.boardiD;  // Board ID
        RestAssured.given()
                // Defining Parameters as they are : key , Token , and organization name
                .pathParam("id",W)
                .queryParams("key",U
                        ,"token",G)
                .header("Accept","application/json") // accepting jason
                .when()
                .delete("https://api.trello.com/1/boards/{id}").prettyPrint() ;  // displaying in console




    }
}
