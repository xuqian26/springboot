package com.xq.springbootdemo.dao;
import com.xq.springbootdemo.domain.Role;
import com.xq.springbootdemo.domain.User;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserMapper {
    boolean insUser(User user);
    boolean delUser(int id);
    boolean updUser(User user);
    User selUser(int id);
    List<Role> getRoleByUserName(String name);
    User selectByName(String name);
}
