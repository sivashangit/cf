package com.example.cfemployee.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="Employee")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
        private String name;
        private String designation;
    }


