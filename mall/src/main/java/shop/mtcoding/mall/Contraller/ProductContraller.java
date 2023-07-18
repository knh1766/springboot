package shop.mtcoding.mall.Contraller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductContraller {


        @GetMapping("/")
        public String home(){
            return "home";
        }

        @GetMapping("/write")
        public String write(){
            return "write";
        }

}



