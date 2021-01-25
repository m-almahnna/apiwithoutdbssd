import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/person")
public class Person {



    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public PersonDetails getInfo(@PathParam("id") final Integer id)
    {
        new PersonDetails(id);
        return new PersonDetails(id);

    }

}
