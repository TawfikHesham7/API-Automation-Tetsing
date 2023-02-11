import io.restassured.RestAssured;

public class delete_Organization {
//************Number 9 ***************
// https://api.trello.com/1/organizations/{id}?key=APIKey&token=APIToken


    public static void main(String[] args) {

        variables C = new variables();  // taking an object  C from variables class
        String  U = C.Kei  ; // Putting the key value in a string U
        String  G =C.TToken ; // Putting the key value in a string G
        String  W = C.OrgID;  // Organization  ID
        RestAssured.given()
                // Defining Parameters as they are : key , Token , and organization name
                .pathParam("id",W)
                .queryParams("key",U
                        ,"token",G)
                .header("Accept","application/json") // accepting jason
                .when()
                .delete("https://api.trello.com/1/organizations/{id}").prettyPrint() ;  // displaying in console




    }
}
