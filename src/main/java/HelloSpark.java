
import java.util.ArrayList;
import java.util.List;

import static spark.Spark.*;

public class HelloSpark {

    public static void main(String[] args) {
        CorsFilter.apply();

        get("/hello", "application/json", (request, response) -> {
            return new Produto("Toalha", 13);
        }, new JSONTransformer());

        post("/hello","application/json", (request, response) -> {
            List<Produto> lista = new ArrayList<>();
            lista.add(new Produto("Arroz", 12));
            lista.add(new Produto("Feijao", 12));
            lista.add(new Produto("Batata", 12));

            response.header("Content-Type","application/json");
            response.status(201);
            return lista;
        }, new JSONTransformer());

//        post("/users", (request, response) -> {
//            response.type("application/json");
//            Produto user = new Gson().fromJson(request.body(), User.class);
//            userService.addUser(user);
//
//            return new Gson()
//                    .toJson(new StandardResponse(StatusResponse.SUCCESS));
//        });
    }
}



// HTTP: GET, POST, PUT, DELETE




//BODY PARAMS || REQ PARAMS || QUERY PARAMS




// JSON


