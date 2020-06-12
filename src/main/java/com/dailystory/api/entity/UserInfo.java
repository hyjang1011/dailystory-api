package com.dailystory.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Builder
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="TB_USER_INFO")
public class UserInfo extends BaseTimeEntity {

    @Column(name = "USER_ID", nullable = false)
    private String userId;

    @Id
    @Column(name = "USER_CODE", nullable = false)
    private String userCode;

    @Column(name = "USER_PWD", nullable = false)
    private String userPwd;
}
