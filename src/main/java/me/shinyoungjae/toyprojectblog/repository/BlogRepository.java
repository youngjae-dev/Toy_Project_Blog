package me.shinyoungjae.toyprojectblog.repository;

import me.shinyoungjae.toyprojectblog.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

// Entity Article의 PK(기본키)를 Long 타입으로 설정
public interface BlogRepository extends JpaRepository<Article, Long> {
}
