package com.example.demo;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "topics")
@Data
@Generated
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class TopicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

}
