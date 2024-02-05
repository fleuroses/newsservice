package com.rose.newsservice.dto;

import com.rose.newsservice.entity.ArticleEntity;
import com.rose.newsservice.entity.CategoryEntity;
import com.rose.newsservice.entity.CountryEntity;
import com.rose.newsservice.entity.SourceEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ArticleDTO {

    private Long id;
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private LocalDateTime publishedAt;
    private CountryEntity country_id;
    private CategoryEntity category_id;
    private SourceEntity source_id;

    public static ArticleDTO fromArticleEntity(ArticleEntity article) {
        return ArticleDTO.builder()
                .id(article.getId())
                .author(article.getAuthor())
                .title(article.getTitle())
                .description(article.getDescription())
                .url(article.getUrl())
                .urlToImage(article.getUrlToImage())
                .publishedAt(article.getPublishedAt())
                .country_id(article.getCountry_id())
                .category_id(article.getCategory_id())
                .source_id(article.getSource_id())
                .build();

    }

}
