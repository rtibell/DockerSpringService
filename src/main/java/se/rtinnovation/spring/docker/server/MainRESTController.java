package se.rtinnovation.spring.docker.server;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import se.rtinnovation.spring.docker.server.rest.ServicePayload;

import java.util.ArrayList;
import java.util.List;

import static se.rtinnovation.spring.docker.server.ControllerInvariant.CREATE_SERVICE_PATH;
import static se.rtinnovation.spring.docker.server.ControllerInvariant.SERVICES_ROOT_PATH;

@Slf4j
@RestController
public class MainRESTController {

    @GetMapping(SERVICES_ROOT_PATH)
    ResponseEntity<List<String>> getServices() {
        log.debug("In endpoint getServices");

        var retBody = new ServicePayload();
        var arr = new ArrayList<String>();
        arr.add("Answer-1");
        arr.add("Answer-2");
        retBody.setAnswers(arr);
        return ResponseEntity.ok().eTag(Long.toString(retBody.getVersion())).body(arr);
    }

    @PostMapping(CREATE_SERVICE_PATH)
    ResponseEntity<String> createNewServce() {
        log.debug("In endpoint createNewServce");

        return ResponseEntity.ok().body("Servce created");
    }
}
