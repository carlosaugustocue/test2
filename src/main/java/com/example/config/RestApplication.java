package com.example.config;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Set;

@ApplicationPath("api")
public class RestApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        return Set.of(
                com.example.resource.HelloResource.class,
                com.example.resource.UserResource.class
        );
    }



}
