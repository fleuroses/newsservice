package com.rose.newsservice.entity;

import com.rose.newsservice.dto.CountryDTO;
import com.rose.newsservice.dto.SourceDTO;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name="Source")
public class SourceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    @Builder.Default
    private String s_id = "";

    @Column(length = 50)
    @Builder.Default
    private String s_name = "";


    public static SourceEntity fromSourceDTO(SourceDTO sourceDTO) {
        return SourceEntity.builder()
                .s_id(sourceDTO.getS_id())
                .s_name(sourceDTO.getS_name())
                .build();

    }
}
