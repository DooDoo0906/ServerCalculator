package client;


import com.fasterxml.jackson.databind.util.JSONPObject;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonObject;
import server.ultiliities.MathVariable;
import server.ultiliities.validation.Validation;

@Client("/receive")
public interface OperationClient {
    @Post("/operation")
    String operation(@Body MathVariable mathVariable);
}
