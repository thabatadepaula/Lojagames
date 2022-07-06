package com.generation.GamesJoe.repository;

	import java.util.List;
	
	import org.springframework.data.jpa.repository.JpaRepository;

	import com.generation.GamesJoe.model.Categoria;

	public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);
		
}