package com.vrwebbackend.ws.score;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vrwebbackend.ws.user.User;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="score")
@Data
public class Score
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    User user;

    Integer score;

    String grade;

    String testNumber;
}
