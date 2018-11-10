package demo.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * className : HelloRestController
 * Description TODO
 * Author : xiexl
 */
@RestController
public class HelloRestController {

    @RequestMapping(value = "/hellorest" , method = RequestMethod.GET)
    public String sayHello(){
        return "hello restController!";
    }

}
