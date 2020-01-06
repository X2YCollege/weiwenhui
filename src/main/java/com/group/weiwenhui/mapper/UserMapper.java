package com.group.weiwenhui.mapper;

import com.group.weiwenhui.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {

    List<User> getAll();
}
