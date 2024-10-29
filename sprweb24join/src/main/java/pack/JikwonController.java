package pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JikwonController {
   private final JikwonService jikwonService;
   
   @Autowired
   public JikwonController(JikwonService jikwonService) {
      this.jikwonService = jikwonService;
   }
   
   @GetMapping("jikwonlist")
   public String listJikwon(Model model) {
      model.addAttribute("jikwons", jikwonService.getJikwonData());
      
      return "jikwonlist";
   }
}
