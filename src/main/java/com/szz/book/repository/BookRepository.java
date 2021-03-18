package com.szz.book.repository;

import com.szz.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 囧态汗
 * @date 2021/3/18
 * @description BookRepository
 */
public interface BookRepository extends JpaRepository<Book,Integer> {

}
