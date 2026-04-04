import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloControler {
   @GetMapping("/hello")
    public String  hello(){
        return "hello Abhinandan alok";
    }
}
