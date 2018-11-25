package cn.yuan.blog.service;

import cn.yuan.blog.domain.Authority;

import java.util.Optional;

public interface AuthorityService
{
    /**
     * 根据ID查询Authority
     * @param id
     * @return
     */
    Optional<Authority> getAuthorityById(Long id);
}
