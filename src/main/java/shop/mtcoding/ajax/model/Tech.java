package shop.mtcoding.ajax.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor  //디비조회 ->pc에 카테고리 객체 생성 ->빈생성자를 호출 (없으면 조회는 돼도 영속화는 안 됨)
@Getter
@Setter
@Table(name = "tech_tb")
@Entity
public class Tech {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String name; //Spring, Java , Javascript ,React, HTML
    
    

    
    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;


    
}
