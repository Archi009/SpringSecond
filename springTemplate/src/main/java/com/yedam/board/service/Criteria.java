package com.yedam.board.service;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Criteria {

  private Integer pageNum = 1;
  private Integer amount = 10;

  private String type;
  private String keyword;

  public Criteria() {
    this(1, 10);
  }

  public Criteria(int pageNum, int amount) {
    this.pageNum = pageNum;
    this.amount = amount;
  }

  public String[] getTypeArr() {

    return type == null? new String[] {}: type.split("");
  }
}