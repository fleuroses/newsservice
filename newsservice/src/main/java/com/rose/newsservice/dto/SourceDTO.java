package com.rose.newsservice.dto;

import com.rose.newsservice.entity.CountryEntity;
import com.rose.newsservice.entity.SourceEntity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor      // 기본생성자를 만듬
@AllArgsConstructor     // 데이터 필드 생성 시 모든데이터가 매개변수를 갖는 생성자
@Builder
@ToString
public class SourceDTO {
    private Long id;
    private String s_id;
    private String s_name;

    public static SourceDTO fromSourceEntity(SourceEntity sourceEntity) {
        return SourceDTO.builder()
                .id(sourceEntity.getId())
                .s_id(sourceEntity.getS_id())
                .s_name(sourceEntity.getS_name())
                .build();
    }
}
