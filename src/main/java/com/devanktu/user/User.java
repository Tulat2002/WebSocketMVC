package com.devanktu.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.Id;


@Entity
@Data
@Table(name = "user")
public class User {

    @Id
    private String nickName;
    private String fullName;
    private Status status;

}
