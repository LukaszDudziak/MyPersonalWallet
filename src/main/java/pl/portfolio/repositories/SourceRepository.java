package pl.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.portfolio.model.Source;

public interface SourceRepository extends JpaRepository<Source, Long> {
}
