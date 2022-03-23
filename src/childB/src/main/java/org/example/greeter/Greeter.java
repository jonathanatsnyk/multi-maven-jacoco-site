package org.example.greeter;

import java.text.MessageFormat;

public final class Greeter {

    public static String welcomeMessage( final String p_name )
    {
        return MessageFormat.format( "Hello, {0}!", p_name );
    }

}
