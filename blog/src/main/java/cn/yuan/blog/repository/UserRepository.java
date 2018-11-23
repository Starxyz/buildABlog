package cn.yuan.blog.repository;

import cn.yuan.blog.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>
{
}
