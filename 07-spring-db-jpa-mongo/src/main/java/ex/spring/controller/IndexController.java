package ex.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ex.spring.service.ParentService;

@Controller
public class IndexController {
	@Autowired private ParentService bitmapService;
	
	@RequestMapping("/index.html")
	public String index(Model model){
//		List<Article> list = boardService.list();
//		model.addAttribute("list", list);
		return "index";
	}
	
	@RequestMapping("/write.html")
	public String write(@RequestParam String title, @RequestParam String content, Model model){
//		System.out.println("params : " + param);
//		String title = (String) param.get("title");
//		String content = (String) param.get("content");
//		boardService.write(new Article(title, content));
	  bitmapService.save(new Long(10));
		return index(model);            
	}
}
