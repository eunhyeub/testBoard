package pack;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JikwonController {
	private final JikwonRepository jikwonRepository;
	
	 public JikwonController(JikwonRepository jikwonRepository) {
	        this.jikwonRepository = jikwonRepository;
	    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Jikwon> jikwonList = jikwonRepository.findJikwonWithGogek();
        model.addAttribute("jikwonList", jikwonList);
        
        return "list";
    }
	
}
