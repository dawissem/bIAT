package com.dawissem.biat.Service;

import org.springframework.stereotype.Service;

@Service

public interface UserService {
    public int loginValidation(Integer matricule, String password);

}
