package com.example.service;

import com.example.config.AuthUserDetails;
import com.example.dto.ArticleDto;
import com.example.model.ArticleQueryParam;
import com.example.model.FeedParams;

import java.util.List;

public interface ArticleService {
    List<ArticleDto> listArticle(final ArticleQueryParam articleQueryParam, final AuthUserDetails authUserDetails);

    List<ArticleDto> feedArticles(final AuthUserDetails authUserDetails, final FeedParams feedParams);
    ArticleDto favoriteArticle(final String slug, final AuthUserDetails authUserDetails);
    ArticleDto unfavoriteArticle(final String slug, final AuthUserDetails authUserDetails);
    ArticleDto createArticle(final ArticleDto article, final AuthUserDetails authUserDetails);

    ArticleDto getArticle(final String slug, final AuthUserDetails authUserDetails);

    ArticleDto updateArticle(final String slug, final ArticleDto.Update article, final AuthUserDetails authUserDetails);

    void deleteArticle(final String slug, final AuthUserDetails authUserDetails);

}