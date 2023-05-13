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
    @GeneratedValue
    private Long id;
    @Column
    private String name;
    @Column
    private String president;
}
