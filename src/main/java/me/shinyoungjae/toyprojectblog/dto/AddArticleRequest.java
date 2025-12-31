// DAO와는 다르게 DTO는 단순하게 데이터를 옮기기 위해 사용하는 전달자
package me.shinyoungjae.toyprojectblog.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.shinyoungjae.toyprojectblog.domain.Article;

@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 필드 값을 매개변수로 받는 생성자
@Getter
public class AddArticleRequest {

    private String title;
    private String content;

    // 블로그 글을 추가할 때 저장할 엔티티로 변환하는 용도
    public Article toEntity() { // 생성자를 사용해 객체 생성
        return Article.builder().title(title).content(content).build();
    }
}
