import io.restassured.RestAssured;

public class getLists_inside_Board {

//*********************NUmber6*********************
//https://api.trello.com/1/boards/{id}/lists?key=APIKey&token=APIToken

    public static void main(String[] args) {
        variables q = new variables();  // taking an object  q from variables class
        String  N = q.Kei  ; // Putting the key value in a string i
        String  M =q.TToken ; // Putting the key value in a string J
        variables idMem = new variables();
        String Id = idMem.boardiD ;



        RestAssured.given()
                .pathParam("id",Id)
                .queryParams("key",N, "token",M)
                .header("Accept","application/json")
                .when()
                .get("https://api.trello.com/1/boards/{id}/lists").prettyPrint() ;




    }
}
