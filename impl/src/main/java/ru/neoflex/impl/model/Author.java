package ru.neoflex.impl.model;

import lombok.*;

import javax.persistence.*;

@SuppressWarnings("JpaDataSourceORMInspection")




@Entity
@Table(name = "authors")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fullName;

}
