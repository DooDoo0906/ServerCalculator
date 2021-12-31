package hello.world;


import client.OperationClient;
import com.fasterxml.jackson.databind.util.JSONPObject;
import io.micronaut.context.ApplicationContext;
import io.micronaut.json.JsonMapper;
import io.micronaut.json.JsonObjectSerializer;
import io.micronaut.runtime.server.EmbeddedServer;
import io.vertx.core.json.JsonObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import server.ultiliities.MathVariable;

import static org.junit.Assert.assertEquals;

public class OperationClientTest {
    private EmbeddedServer server;
    private OperationClient client;

    @Before
    public void setup() {
        server = ApplicationContext.run(EmbeddedServer.class);
        client = server.getApplicationContext().getBean(OperationClient.class);
    }

    @After
    public void cleanup() {
        server.stop();
    }

    @Test
    public void testGreeting() {
        assertEquals("Result = 3.0",
                client.operation(new MathVariable(1,2,"+")));
    }
}
