package com.rose.newsservice.dto;

import com.rose.newsservice.entity.CategoryEntity;
import com.rose.newsservice.entity.CountryEntity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor      // 기본생성자를 만듬
@AllArgsConstructor     // 데이터 필드 생성 시 모든데이터가 매개변수를 갖는 생성자
@Builder
@ToString
public class CountryDTO {
    private Long id;
    private String c_code;
    private String c_name;

    public static CountryDTO fromCountryEntity(CountryEntity countryEntity) {
        return CountryDTO.builder()
                .id(countryEntity.getId())
                .c_code(countryEntity.getC_code())
                .c_name(countryEntity.getC_name())
                .build();
    }
}
