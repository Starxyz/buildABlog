package cn.yuan.blog.service;

import cn.yuan.blog.domain.Authority;
import cn.yuan.blog.repository.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorityServiceImpl implements AuthorityService
{
    @Autowired
    private AuthorityRepository authorityRepository;

    @Override
    public Optional<Authority> getAuthorityById(Long id)
    {
        return authorityRepository.findById(id);
    }
}
