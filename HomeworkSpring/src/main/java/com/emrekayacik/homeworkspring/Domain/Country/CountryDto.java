package com.emrekayacik.homeworkspring.Domain.Country;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CountryDto {
    private Long id;
    private String name;
    private String president;
}
