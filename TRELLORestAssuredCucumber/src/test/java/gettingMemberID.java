import io.restassured.RestAssured;

public class gettingMemberID extends variables {

// Putting the key value in a string i

    public static void main(String[] args) {

       variables k = new variables();  // taking an object  k from variables class
    String  i = k.Kei  ; // Putting the key value in a string i
String  j =k.TToken ; // Putting the key value in a string J
RestAssured.given()
                .baseUri("https://api.trello.com/1/members/me")
                .queryParams("key",i, "token",j)
                .header("Accept","application/json")
                .when()
                .get().prettyPrint() ;


    }
}
