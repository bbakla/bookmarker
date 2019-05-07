package com.bookmarkmanager.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.bookmarkmanager.model.Bookmark;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class BookmarkRepositoryTest {

  @Autowired
  private BookmarkRepository bookmarkRepository;
  
  @Test
  public void createBookmark() {
    var bookmark = new Bookmark();
    bookmark.setNote("bookmark note");
    bookmark.setUrl("http://www.test.com");
    
    var savedBookmark = bookmarkRepository.save(bookmark);
    
    Optional<Bookmark> bookmarkInDatabase = bookmarkRepository.findById(bookmark.getUrl());
    
    assertEquals(bookmark.getUrl(), bookmarkInDatabase.get().getUrl());
  } 
  
}
