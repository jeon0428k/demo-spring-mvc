package me.junghwan.demospringmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventController {

//    @RequestMapping(value = "/events", method = RequestMethod.GET)
    @GetMapping("/events")
    public String events(Model model) {
        return "events";
    }

}
