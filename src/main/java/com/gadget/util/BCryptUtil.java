package com.gadget.util;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class BCryptUtil {

    public static String createPassword(String plainTextPassword) {
        String salt = BCrypt.gensalt();
        return BCrypt.hashpw(plainTextPassword, salt);
    }

    public static boolean compare(String plainTextPassword, String hash) {
        return BCrypt.checkpw(plainTextPassword, hash);
    }

}
