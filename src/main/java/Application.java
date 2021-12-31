

import client.OperationClient;
import io.micronaut.runtime.Micronaut;
import io.micronaut.runtime.server.EmbeddedServer;
import server.ultiliities.MathVariable;

public class Application {

    public static void main(String[] args) {
        OperationClient client;
        client=Micronaut.run(Application.class).getBean(OperationClient.class);
        client.operation(new MathVariable(1,1,":"));
    }
}
