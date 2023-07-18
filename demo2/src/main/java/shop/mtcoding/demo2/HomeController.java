package shop.mtcoding.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//컨트롤러는 리턴되는파일을 찾아주는거임,레스트컴트롤러는 리턴되는 값자체를 찾아주는거
@Controller
public class HomeController {

    @GetMapping("/home")
    public  String home(){
        return "home";//ViewResolver 클래스발동 /WEB-INF/views/home.jsp
    }
}
