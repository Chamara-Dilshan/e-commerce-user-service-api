package com.devstack.ecommerce.user_service_api.api;
import com.devstack.ecommerce.user_service_api.util.StandardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user-service/api/v1/tests")
@RequiredArgsConstructor
public class TestController {

    @GetMapping("/visitor/test")
    public ResponseEntity<StandardResponse> test() {
    
        return new ResponseEntity<>(
                new StandardResponse(
                    200, "Success", null
                ),
                HttpStatus.OK
        );
    }

}
