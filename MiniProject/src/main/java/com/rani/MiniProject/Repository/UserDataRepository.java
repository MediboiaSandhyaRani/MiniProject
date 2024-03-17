package com.rani.MiniProject.Repository;
import com.rani.MiniProject.Entity.UserData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserDataRepository extends CrudRepository<UserData,Long>
{

}
