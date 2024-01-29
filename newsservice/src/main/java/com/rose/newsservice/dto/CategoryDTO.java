package com.rose.newsservice.dto;

import com.rose.newsservice.entity.CategoryEntity;
import lombok.*;
import org.apache.tomcat.util.buf.UEncoder;

@Getter
@Setter
@NoArgsConstructor      // 기본생성자를 만듬
@AllArgsConstructor     // 데이터 필드 생성 시 모든데이터가 매개변수를 갖는 생성자
@Builder
@ToString
public class CategoryDTO {
    private Long id;
    private String ct_code;
    private String ct_name;
    private String ct_desc;

    public static CategoryDTO fromCategoryEntity(CategoryEntity categoryEntity) {
        return CategoryDTO.builder()
                .id(categoryEntity.getId())
                .ct_code(categoryEntity.getCt_code())
                .ct_name(categoryEntity.getCt_name())
                .ct_desc(categoryEntity.getCt_desc())
                .build();



    }

}
