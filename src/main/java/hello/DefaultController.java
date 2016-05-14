package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @RequestMapping("/a")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
    //    model.addAttribute("name", name);
      //  return "index";
        return "name";
    }

}