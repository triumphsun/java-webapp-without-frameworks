package com.suntri.portal;

import com.suntri.portal.member.Authenticator;

/**
 * Author: Chia-Yang, Sun
 * Email: triumph.sun@gmail.com
 * Date: 2019/6/24
 */

public class AuthenticatorImpl implements Authenticator {

    @Override
    public boolean authenticate(String username, String password) {
        return true;
    }

}
