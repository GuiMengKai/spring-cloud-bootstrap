package com.spring.cloud.ratingservice.domain;

import java.io.Serializable;

public class Rating {
  private static Serializable UUID = 1L;

  public Rating(Long id, Long bookId, Integer stars) {
    this.id = id;
    this.bookId = bookId;
    this.stars = stars;

  }

  private Long id;

  private Long bookId;

  private Integer stars;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getBookId() {
    return bookId;
  }

  public void setBookId(Long bookId) {
    this.bookId = bookId;
  }

  public Integer getStars() {
    return stars;
  }

  public void setStars(Integer stars) {
    this.stars = stars;
  }
}
