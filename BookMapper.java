package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import bean.Book;

public interface BookMapper {

	List<Book> findAll();

	void delete(int id);

	void insert(Book b);

	Book updateByid(int id);

	void update(Book b);

	List<Book> pageEmp(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);

	int findByEid();

}
