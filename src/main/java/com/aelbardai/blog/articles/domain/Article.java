package com.aelbardai.blog.articles.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by dev on 8/17/17.
 */
@Data
public class Article {
    private Long id;
    private String title;
    private String content;
    private String author;
    private Date createdAt;
    private Date modifiedAt;
    private ArticleCategory category;
    private String[] tags;
}
