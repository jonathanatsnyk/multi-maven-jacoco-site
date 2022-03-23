package org.example.greeter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class GreeterTest {

    @Test
    public void testWelcomeMessage()
    {
        Assertions.assertEquals( "Hello, Paul!", Greeter.welcomeMessage( "Paul" ) );
    }
}
