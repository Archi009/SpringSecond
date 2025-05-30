package com.yedam.board.service;

import java.util.Date;

import lombok.Data;

@Data
public class ReplyVO {
	private int rno;
	private long bno;
	private String reply;
	private String replyer;
	private Date reply_date;
	private Date update_date;
}
