package by.overone.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MyRole implements GrantedAuthority {
    @Override
    public String getAuthority() {
        Random r = new Random();
        int i = r.nextInt(10);
        return i > 5 ? "ROLE_ADMIN" : "ROLE_USER";
    }
}
