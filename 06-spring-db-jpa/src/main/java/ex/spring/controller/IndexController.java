package ex.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ex.spring.model.Article;
import ex.spring.service.BoardService;

@Controller
public class IndexController {
	@Autowired private BoardService boardService;
	
	@RequestMapping("/index.html")
	public String index(Model model){
		List<Article> list = boardService.list();
		model.addAttribute("list", list);
		return "index";
	}
	
	@RequestMapping("/write.html")
	public String write(@RequestParam String title, @RequestParam String content, Model model){
//		System.out.println("params : " + param);
//		String title = (String) param.get("title");
//		String content = (String) param.get("content");
//		boardService.write(new Article(title, content));
		return index(model);
	}
}
