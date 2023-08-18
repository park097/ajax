package shop.mtcoding.ajax.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor  //디비조회 ->pc에 카테고리 객체 생성 ->빈생성자를 호출 (없으면 조회는 돼도 영속화는 안 됨)
@Getter
@Setter
@Table(name = "category_tb")
@Entity
public class Category {
  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    private String name; //백엔드 ,프론트 엔드 , dba
     

   @Builder
    public Category(Integer id, String name) {
        this.id = id;
        this.name = name;
    }


   
    
}
