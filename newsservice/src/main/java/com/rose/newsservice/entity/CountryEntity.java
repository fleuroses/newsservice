package com.rose.newsservice.entity;

import com.rose.newsservice.dto.CategoryDTO;
import com.rose.newsservice.dto.CountryDTO;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name="country")
public class CountryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 10)
    private String c_code;

    @Column(nullable = false, length = 50)
    @Builder.Default
    private String c_name = "";


    public static CountryEntity fromCountryDTO(CountryDTO countryDTO) {
        return  CountryEntity.builder()
                .c_code(countryDTO.getC_code())
                .c_name(countryDTO.getC_name())
                .build();

    }


}
