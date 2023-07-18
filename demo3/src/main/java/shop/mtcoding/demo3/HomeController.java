package shop.mtcoding.demo3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//컨트롤러는 리턴되는파일을 찾아주는거임,레스트컴트롤러는 리턴되는 값자체를 찾아주는거
@Controller
public class HomeController {

    @GetMapping("/hello")
    public  String hello(){
        return "hello";//ViewResolver 클래스발동 /WEB-INF/views/home.jsp
    }
}
