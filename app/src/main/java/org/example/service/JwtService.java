package org.example.service;

import io.jsonwebtoken.Claims;
import org.springframework.stereotype.Service;

@Service
public class JwtService {
    public static final String SECRET="abc6d3147845e9593e836c4a2dd1f87f66f126a63a708d0e4e5ce892d00c99ec";

    public String extractUsername(String token)
    {
         return extractClaim(token, Claims::getSubject);
    }
    public <T> T extractClaim(String Token, Function<Claims>)

}
