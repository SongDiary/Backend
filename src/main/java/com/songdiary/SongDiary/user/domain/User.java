package com.songdiary.SongDiary.user.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="AppUser")
public class User {
  @Column(name="USERID")
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long userId;

  @Column(name="USERPROFILEID")
  private String userProfileId;

  @Column(name="USERPASSWORD")
  private String userPassword;
  
  @Column(name="USERNAME")
  private String userName;

}
