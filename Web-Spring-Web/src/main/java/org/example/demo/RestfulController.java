package org.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class RestfulController {
    /**
     * Cross-origin resource sharing (CORS) is a mechanism that allows
     * restricted resources on a web page to be requested from another
     * domain outside the domain from which the first resource was
     * served. A web page may freely embed cross-origin images, stylesheets,
     * scripts, iframes, and videos. Certain APIs can be called as well.
     * In order to enable CORS in Spring Boot, we need to do the following:
     * Use @CrossOrigin annotation on the controller method or the controller class.
     * The path for the annotation can be applied to one or more controller
     * methods but not to the controller class. If applied to a class, then
     * the annotation is applied to all the controller methods in that class.
     * The @CrossOrigin annotation has attributes for the following:
     * origins
     * originPatterns
     * methods
     * allowedHeaders
     * exposedHeaders
     * allowCredentials
     * maxAge.
     */
    @CrossOrigin(origins = "*")
    @GetMapping("/api/web-spring-web/restful")
    public Map<String, Object> restful() {
        Map<String, Object> data = new LinkedHashMap<>();
        data.put("id", "1");
        data.put("name", "Fruit");
        data.put("message", "This example also represents how to setup cross-domain on a single url");

        return data;
    }

    /**
     * Please find the global cors configuration code in Application.corsConfigurer method.
     */
    @GetMapping("/api/web-spring-web/cors-global")
    public Map<String, Object> cors() {
        Map<String, Object> data = Map.of(
                "message", "This example represent how to setup cors globally"
        );
        return data;
    }
}
