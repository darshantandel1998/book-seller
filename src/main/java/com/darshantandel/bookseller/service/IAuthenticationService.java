package com.darshantandel.bookseller.service;

import com.darshantandel.bookseller.model.User;

public interface IAuthenticationService {
    User signInAndReturnJwt(User signInRequest);
}
