package com.itstyle.doc.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.itstyle.doc.model.Books;
/**
 * 项目
 * 创建者 小柒2012
 * 创建时间	2017年9月7日
 */
public interface BooksRepository extends JpaRepository<Books, Integer> {
	@Query(value ="SELECT COUNT(book_id) FROM  md_books",nativeQuery = true)
	long count();
	Books findByIdentify(String identify);
}
