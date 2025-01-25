package opensource.farzad.rapidgrapper.rapidgrapper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class WebController {

    @GetMapping("home")
    @ResponseBody
    public String requestMethodName() {
        System.out.println("GO");
        return "Success";
    }
    @GetMapping("path")
    public String getMethodName(@RequestParam String param) {
        return new String();

    }
    
    
    
}
