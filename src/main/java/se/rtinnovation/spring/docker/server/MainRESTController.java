package se.rtinnovation.spring.docker.server;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
public class MainRESTController {
    @GetMapping("/services")
    List<String> getServices() {
        log.debug("In endpoint getServices");
        var arr = new ArrayList<String>();
        arr.add("Answer-1");
        arr.add("Answer-2");
        return arr;
    }
}
