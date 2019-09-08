package com.itstyle.mail.web;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itstyle.mail.common.model.Email;
import com.itstyle.mail.common.model.Result;
import com.itstyle.mail.service.IMailService;

@Api(tags ="邮件管理")
@RestController
@RequestMapping("/mail")
public class mailController {
	
	@Autowired
	private IMailService mailService;
	
	@PostMapping("send")
	public Result send(Email mail) {
		try {
			mailService.sendFreemarker(mail);
		} catch (Exception e) {
			e.printStackTrace();
			return  Result.error();
		}
		return  Result.ok();
	}
	
	@PostMapping("list")
	public Result list(Email mail) {
		return mailService.listMail(mail);
	}
}
