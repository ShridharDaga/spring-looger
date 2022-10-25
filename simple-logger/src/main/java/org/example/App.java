package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App
{
    public static void main( String[] args )
    {
        Logger log = LoggerFactory.getLogger(App.class);
        System.out.println( "Hello World!" );
        log.trace("A TRACE Message");
        log.debug("A DEBUG Message");
        log.info("An INFO Message");
        log.warn("A WARN Message");
        log.error("An ERROR Message");
    }
}
