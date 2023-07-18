package shop.mtcoding.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HelloController {

    // http://localhost:8080/
    @GetMapping("/")
    public  String home(){
        return  "home";
    }
    // http://localhost:8080/
    @GetMapping("/hello")
    public  String hello(){
        return  "<h1>hello</h1>";
    }
    // http://localhost:8080/
    @GetMapping("/check")
    public  void check(){
        System.out.println("/check호출됨");
    }
    // http://localhost:8080/
    @GetMapping("/random/number")
    public  String checksdefsdf(){
      Random r = new Random();
      Integer num = r.nextInt(5);
      return  "<h1>"+num.toString()+"</h1>";
    }
}
