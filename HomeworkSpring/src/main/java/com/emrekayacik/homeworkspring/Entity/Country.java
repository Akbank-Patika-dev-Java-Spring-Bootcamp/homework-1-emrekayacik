package com.emrekayacik.homeworkspring.Entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table
public class Country {
    @Id
    @GeneratedValue(generator = "GenCountry",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "GenCountry", allocationSize = 1,sequenceName = "SQ_COUNTRY")
    private Long id;
    @Column(name = "NAME",length = 100,nullable = false)
    private String name;
    @Column(name = "PRESIDENT",length = 80)
    private String president;
}
