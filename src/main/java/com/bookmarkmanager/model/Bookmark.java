package com.bookmarkmanager.model;

import org.springframework.data.annotation.Id;

public class Bookmark {

  @Id
  private String url;
  
  private String note;

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }
  
  
  
}
