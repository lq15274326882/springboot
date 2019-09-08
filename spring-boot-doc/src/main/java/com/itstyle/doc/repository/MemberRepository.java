package com.itstyle.doc.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.itstyle.doc.model.Member;
/**
 * 用户管理
 * 创建者 小柒2012
 * 创建时间	2017年9月7日
 */
public interface MemberRepository extends JpaRepository<Member, Integer> {
	Member findByAccount(String account);
	Member findByEmail(String email);
	@Query(value ="select count(member_id) from  md_members",nativeQuery = true)
	long count();
	@Query(value ="SELECT  m.account,m.role,b.identify,m.avatar FROM  "
			     + "md_books b,md_members m,md_relationship r "
			     + "WHERE   m.member_id=r.member_id AND b.book_id=r.book_id "
			     + "AND b.identify=?1  ",nativeQuery = true)
	List<Object[]> findByIdentify(String identify);
}
