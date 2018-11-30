package com.narendra.springboot.db.cassandra;

import org.springframework.data.cassandra.repository.CassandraRepository;

public interface BookRepository extends CassandraRepository<Book, Integer> {
}
