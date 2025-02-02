package com.example.demo;

import com.example.demo.travelApp.resource.User;
import com.example.demo.travelApp.helper.UserHelper;
//import org.springframework.security.crypto.bcrypt.BCrypt;
import org.mindrot.jbcrypt.BCrypt;
//import platform.defined.resource.User;

public class Test {
    public static void main(String[] args){

        String salt = BCrypt.gensalt(12);
        String doubleMd5 = BCrypt.hashpw("admin@123", salt);

        User user = new User("admin3@rasp.com");
        user.setEmail("admin2@rasp.com");
        user.setPhone_no("123456789");
        user.setPassword(doubleMd5);
        user.setName("Super Admin");
        UserHelper.getInstance().AddOrUpdateNoCache(user);
    }
}
