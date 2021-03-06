package com.wego.web.admin;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@AllArgsConstructor
@Lazy
@NoArgsConstructor
public class Admin {
	private String admin_id,admin_pwd ,tel,admin_addr ;
	private int hotel_seq ,tour_seq, festival_seq;
}
