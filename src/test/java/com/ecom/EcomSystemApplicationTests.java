package com.ecom;

import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.ibatis.javassist.compiler.ast.Variable;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashMap;

@SpringBootTest
class EcomSystemApplicationTests {

    /**
     * 生成JWT
     */
    @Test
    public void testGenJwt() {
        HashMap<String, Object> claims = new HashMap<>();
        claims.put("uid", 1);
        claims.put("username", "admin");

        String jwt = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256, "ecom") // 签名算法
                .setClaims(claims) // 自定义内容（载荷）
                .setExpiration(new Date(System.currentTimeMillis() + 3600 * 1000)) // 设置有效期为1h
                .compact();
        System.out.println(jwt);

    }

}
