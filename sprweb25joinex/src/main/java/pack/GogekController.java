package pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GogekController {
	private GogekService gogekService;
	
	@Autowired
   public GogekController(GogekService gogekService) {
      this.gogekService = gogekService;
   }

	/*
   @GetMapping("/list")
   public String listJikwon(Model model) {
      model.addAttribute("gogeks", gogekService.getfindJikwon());
      
      return "list";
   }
   */
	
	@GetMapping("/gogek")
	public String listGogek(@RequestParam("jikwonno")int jikwonno, Model model) {
		model.addAttribute("gogeks", gogekService.getfindGogek(jikwonno));
		model.addAttribute("jikwonno", jikwonno); // 직원 이름도 템플릿에 전달
		
		return "gogek";
	}
}
