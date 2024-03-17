package com.rani.MiniProject.Service;
import com.rani.MiniProject.Entity.UserData;
import com.rani.MiniProject.Repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDataServiceImpl implements UserDataService
{
    @Autowired
    UserDataRepository userDataRepository;
    @Override
    public UserData saveUserData(UserData userData) {
        return userDataRepository.save(userData);
    }

    @Override
    public List<UserData> findAll() {
        return (List<UserData>) userDataRepository.findAll();
    }
}
