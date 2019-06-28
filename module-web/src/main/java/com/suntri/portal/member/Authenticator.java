package com.suntri.portal.member;

public interface Authenticator {
    public boolean authenticate(String username, String password);
}