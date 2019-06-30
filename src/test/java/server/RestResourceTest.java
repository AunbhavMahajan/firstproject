package server;

import main.java.server.RestResource;
import org.junit.Assert;
import org.junit.Test;

public class RestResourceTest {
    @Test
    public void getItTest() throws Exception {
        RestResource r = new RestResource();
        String s = r.getIt();
        Assert.assertEquals("yup", s);
    }
}
