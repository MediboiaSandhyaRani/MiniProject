package com.rani.MiniProject.Service;
import com.rani.MiniProject.Entity.UserData;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserDataService {
    public UserData saveUserData(UserData userData);

    public List<UserData> findAll();


}
