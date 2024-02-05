package com.rose.newsservice.service;

import com.rose.newsservice.dto.CategoryDTO;
import com.rose.newsservice.dto.CountryDTO;
import com.rose.newsservice.dto.SourceDTO;
import com.rose.newsservice.entity.ArticleEntity;
import com.rose.newsservice.entity.CategoryEntity;
import com.rose.newsservice.entity.CountryEntity;
import com.rose.newsservice.entity.SourceEntity;
import com.rose.newsservice.repository.ArticleRepository;
import com.rose.newsservice.repository.CategoryRepository;
import com.rose.newsservice.repository.CountryRepository;
import com.rose.newsservice.repository.SourceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NewsService {

    private final CategoryRepository categoryRepository;
    private final CountryRepository countryRepository;
    private final SourceRepository sourceRepository;
    private final ArticleRepository articleRepository;

    public List<CategoryDTO> findAllCategories() {
        List<CategoryEntity> categoryEntities = categoryRepository.findAll();

        ArrayList<CategoryDTO> list = new ArrayList<>();
        for(CategoryEntity category : categoryEntities) {
           // System.out.println( category );
            list.add( CategoryDTO.fromCategoryEntity(category) );
        }

        return list;
    }


    public List<CountryDTO> findAllCountry() {
        List<CountryEntity> countryEntities = countryRepository.findAll();

        ArrayList<CountryDTO> list = new ArrayList<>();
        for(CountryEntity country : countryEntities) {
            list.add( CountryDTO.fromCountryEntity(country) );

            System.out.println(country);
        }
        return list;
    }


    public List<SourceDTO> findAllSource() {
        List<SourceEntity> sourceEntities = sourceRepository.findAll();

        ArrayList<SourceDTO> list = new ArrayList<>();
        for(SourceEntity source : sourceEntities) {
            list.add( SourceDTO.fromSourceEntity(source) );

            System.out.println(source);
        }
        return list;
    }

    public CategoryDTO saveCategory(CategoryDTO category) {
        CategoryEntity categoryEntity = CategoryEntity.fromCategoryDTO(category);
        CategoryEntity saved = categoryRepository.save(categoryEntity);

        return CategoryDTO.fromCategoryEntity(saved);

    }

    public Page<ArticleEntity> findAll(int page, int size) {
        return articleRepository.findAll(
                PageRequest.of(
                        page,
                        size,
                        Sort.by("publishedAt").descending()
                )
        );


    }


    public Page<ArticleEntity> findCategoryAndTitleOrDescription(Long categoryId,
                                                                 String titleKeyword,
                                                                 String descKeyword,
                                                                 int page,
                                                                 int size) {
        if(categoryId == 0)
            return articleRepository.findByTitleOrDescription(
                    titleKeyword,
                    descKeyword,
                    PageRequest.of(page, size, Sort.by("publishedAt").descending())
            );

        return articleRepository.findByCategoryAndTitleOrDescription(
                categoryId,
                titleKeyword,
                descKeyword,
                PageRequest.of(page, size, Sort.by("publishedAt").descending())
        );
    }

}
