package io.github.vanessaeich.domain.repository;

import io.github.vanessaeich.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {
}
