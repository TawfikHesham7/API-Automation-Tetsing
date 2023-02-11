import io.restassured.RestAssured;

public class archive_List {
    //*******************Number 7 **************************
    //https://api.trello.com/1/lists/{id}/closed?key=APIKey&token=APIToken

    public static void main(String[] args) {
        variables C = new variables();  // taking an object  C from variables class
        String  U = C.Kei  ; // Putting the key value in a string U
        String  G =C.TToken ; // Putting the key value in a string G
        String  W = C.ListID;  // Organization ID
        RestAssured.given()
                // Defining Parameters as they are : key , Token , and organization name
                .pathParam("id",W)
                .queryParams("value",true,"key",U
                        ,"token",G)
                .header("Accept","application/json") // accepting jason
                .when()
                .put("https://api.trello.com/1/lists/{id}/closed").prettyPrint() ;  // displaying in console
    }






}



