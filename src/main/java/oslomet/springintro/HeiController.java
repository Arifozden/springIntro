package oslomet.springintro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeiController {
    @GetMapping("/")
    public String hallo(String navn){
        int antallBokstaver=navn.length();
        return "Hei verden "+navn+"! Navnet ditt er "+antallBokstaver+" langt.";
    }
}
