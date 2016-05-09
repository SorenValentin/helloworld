package dk.topdanmark.sample;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("environment")
public class EnvironmentResource {
    @Path("/")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getEnvironmentProps(){
        JsonObjectBuilder jo = Json.createObjectBuilder();
        jo.add("hej","med jer");
        return jo.build();
    }
}
