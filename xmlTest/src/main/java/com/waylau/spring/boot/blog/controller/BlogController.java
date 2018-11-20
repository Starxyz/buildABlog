package com.waylau.spring.boot.blog.controller;

import com.waylau.spring.boot.blog.domain.es.EsBlog;
import com.waylau.spring.boot.blog.repository.es.EsBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/blogs")
public class BlogController
{
    @Autowired
    private EsBlogRepository esBlogRepository;

    @GetMapping
    public List<EsBlog> list(@RequestParam(value = "title", required = false, defaultValue = "") String title,
                             @RequestParam(value = "summary", required = false, defaultValue = "") String summary,
                             @RequestParam(value = "content", required = false, defaultValue = "") String content,
                             @RequestParam(value = "pageIndex", required = false, defaultValue = "0") int pageIndex,
                             @RequestParam(value = "pageSize", required = false, defaultValue = "10") int pageSize)
    {
        Pageable pageable = PageRequest.of(pageIndex, pageSize);

        Page<EsBlog> page=esBlogRepository.findByTitleContainingOrSummaryContainingOrContentContaining(title,
                summary, content, pageable);

        return page.getContent();
    }
}
