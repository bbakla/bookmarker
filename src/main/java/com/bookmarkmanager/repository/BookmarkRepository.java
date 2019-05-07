package com.bookmarkmanager.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.bookmarkmanager.model.Bookmark;

@Repository
public interface BookmarkRepository extends MongoRepository<Bookmark, String>{

}
