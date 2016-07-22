package com.md.config.t1.web;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author michaelmykhaylov
 */

@RestController
@EnableAutoConfiguration
@RequestMapping("/services")

public class ConfigController {
        @RequestMapping("/v")
        public String getVersion(){
                return "1.0";
        } 
}
