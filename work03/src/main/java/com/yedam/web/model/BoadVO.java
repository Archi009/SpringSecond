package com.yedam.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoadVO {
private	int bno;
private String	title;
private String	content;
private String	writer;
private	String regdate;
private	String updatedate;
}
