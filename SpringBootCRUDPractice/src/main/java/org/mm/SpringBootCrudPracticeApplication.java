package org.mm;

import java.util.List;
import java.util.Optional;

import org.mm.dao.MarksheetRepository;
import org.mm.entities.Marksheet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootCrudPracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootCrudPracticeApplication.class, args);
		
		MarksheetRepository repo = ctx.getBean(MarksheetRepository.class);
		
//		Insert Single data
		
//		Marksheet m1 = new Marksheet(101, "Man", 99, 99, 99);
//		Marksheet result = repo.save(m1);
//		System.out.println(result);
		
		
//		insert Multiple data at same time
		
//		Marksheet m1 = new Marksheet(102, "Riya", 99, 99, 99);
//		Marksheet m2 = new Marksheet(103, "Anu", 99, 99, 99);
//		Marksheet m3 = new Marksheet(104, "Diya", 99, 99, 99);
//		Marksheet m4 = new Marksheet(105, "Pappu", 99, 99, 99);
//		Marksheet m5 = new Marksheet(106, "Bappu", 99, 99, 99);
//		
//		List<Marksheet> li = List.of(m1,m2,m3,m4,m5);
//		
//		Iterable<Marksheet> ite = repo.saveAll(li);
//		
//		ite.forEach(marksheet->System.out.println(marksheet));
		
		
//		fatch all data from database
		
//		Iterable<Marksheet> ite = repo.findAll();
//		ite.forEach(marksheet->System.out.println(marksheet));
		
		
//		find by id
		
//		long id = 1;
//		Marksheet marksheet = repo.findById(id).get();
//		System.out.println(marksheet);
		
		
//		Find Multiple id item at same time
		
//		long id1=1,id2=2;
//		List<Long> li = List.of(id1, id2);
//		Iterable<Marksheet> ite = repo.findAllById(li);
//		ite.forEach(marksheet->System.out.println(marksheet));
		
//		Delete by id
		
//		repo.deleteById(6L);
//		System.out.println("Deleted ...");
		
		
//		Update By id
		
		Marksheet marksheet = repo.findById(1L).get();
		marksheet.setEnglish(100);
		marksheet.setMaths(100);
		marksheet.setScience(100);
		
		Marksheet result = repo.save(marksheet);
		System.out.println(result);
	}

}
