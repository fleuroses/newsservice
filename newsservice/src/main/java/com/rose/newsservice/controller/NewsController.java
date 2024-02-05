package com.rose.newsservice.controller;

import com.rose.newsservice.dto.CategoryDTO;
import com.rose.newsservice.dto.CountryDTO;
import com.rose.newsservice.dto.SourceDTO;
import com.rose.newsservice.entity.ArticleEntity;
import com.rose.newsservice.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class NewsController {
    private final NewsService newsService;

    @GetMapping("/")
    public String newsMain(Model model) {
        model.addAttribute("nick_name", "rose");


        return "redirect:/articles";
    }

    @GetMapping("/articles")
    public String articles(Model model, @RequestParam(defaultValue= "0")int page, @RequestParam(defaultValue = "10")int size) {

        System.out.println("page = " + page + ", size= " + size);

        try {
            Page<ArticleEntity> articles = newsService.findAll(page, size);
//            for (ArticleEntity a : articles) {
//                System.out.println(a.getTitle());
//                System.out.println(a.getUrl());
//                System.out.println(a.getUrlToImage());
//            }

            int currentPage = articles.getNumber(); // 현재 페이지 번호
            int startPage = (currentPage / size) * 10;
            int endPage = Math.min(articles.getTotalPages()-1, startPage+9);


            model.addAttribute("nick_name", "rose");
            model.addAttribute("articles", articles);
            model.addAttribute("startPage", startPage);
            model.addAttribute("endPage", endPage);

        } catch (Exception e) {
            model.addAttribute("message", e.getMessage());
            return  "/error";
        }
        return "/index";

    }

    @GetMapping("/category")
    public String getCategories(Model model) {

        List<CategoryDTO> categories = newsService.findAllCategories();
        model.addAttribute("categories", categories);

        return "/category";
    }

    @GetMapping("/country")
    public String getCountries(Model model) {

        List<CountryDTO> countries = newsService.findAllCountry();
        model.addAttribute("countries", countries);

        return "/country";
    }

    @GetMapping("/source")
    public String getSources(Model model) {

        List<SourceDTO> sources = newsService.findAllSource();
        model.addAttribute("sources", sources);

        return "/source";
    }

    @GetMapping("/categoryInput")
    public String inputCategory() {
        return "category_input";
    }

    @PostMapping("/categorySave")
    public String saveCategory(@RequestParam("categoryCode")String code,
                               @RequestParam("categoryName")String name,
                               @RequestParam("categoryDesc")String desc) {
        CategoryDTO category = CategoryDTO.builder()
                .ct_code(code)
                .ct_name(name)
                .ct_desc(desc)
                .build();

        CategoryDTO saved = newsService.saveCategory( category );
        System.out.println( saved );

        return "redirect:/category";

    }


}
