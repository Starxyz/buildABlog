package com.waylau.spring.boot.blog.repository;

import com.waylau.spring.boot.blog.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long>
{
//    /**
//     * 新增或者修改用户
//     * @param user
//     * @return
//     */
//    User saveOrUpdateUser(User user);
//
//    /**
//     * 删除用户
//     * @param id
//     */
//    void deleteUser(Long id);
//
//    /**
//     * 根据用户 id 获取用户
//     * @param id
//     * @return
//     */
//    User getUserById(Long id);
//
//    /**
//     * 获取所有用户的列表
//     * @return
//     */
//    List<User> listUser();
}
