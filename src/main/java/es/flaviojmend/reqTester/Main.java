package es.flaviojmend.reqTester;

import java.util.logging.Logger;

import static spark.Spark.*;

public class Main {

    public static String APP_NAME = "reqTester";

    public static void main(String[] args) {

        post("/", (req,res) -> {
            Logger.getLogger(APP_NAME).info("POST -> " + req.body());
            return "POST -> " + req.body();
        });

        get("/", (req, res) -> {
            Logger.getLogger(APP_NAME).info("GET from IP -> " + req.ip());
            return "GET from IP -> " + req.ip();
        });
}

}
