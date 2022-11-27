package com.ssu.wonki.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "user_details")
@Entity
public class UserDetails {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    
//	@OneToOne
//    private User user;
    
    @Column(length = 100)
    private String username;

    @Column(length = 100)
    private String profileImage;

    @Column(length = 12)
    private Date birthDt;
    
    @Column(length = 13)
    private String number;

}