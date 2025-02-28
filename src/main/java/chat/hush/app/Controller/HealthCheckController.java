package chat.hush.app.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/healthCheck")
@CrossOrigin("https://hush-io.vercel.app")
public class HealthCheckController {
    @GetMapping("/check")
    public ResponseEntity<String> healthCheckHandler(){
        return ResponseEntity.ok("Service is Live!!");
    }
}
