package in.xlabs.blogbackend.controller;

import in.xlabs.blogbackend.dto.LoginRequest;
import in.xlabs.blogbackend.dto.RegisterRequest;
import in.xlabs.blogbackend.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController{

    @Autowired
    AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity signup(@RequestBody  RegisterRequest registerRequest){
        authService.signup(registerRequest);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest){
       return  authService.login(loginRequest);

    }

}
