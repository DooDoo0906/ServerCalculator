import client.OperationClient;
import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.server.EmbeddedServer;
import server.ultiliities.MathVariable;

public class RunClient {
    public static void main(String[] args) {
        EmbeddedServer server;
        OperationClient client;
        server = ApplicationContext.run(EmbeddedServer.class);
        client = server.getApplicationContext().getBean(OperationClient.class);
        client.operation(new MathVariable(1,2,"+"));
    }
}
