package pack02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //이게 있어야 컨트롤러를 인식함!
public class Cat {
	
	//컨트롤러는 Cat 클래스 안에 있다!
	
	@RequestMapping("/t10")
	public String func10() {
		return "Catview";
	}

	@RequestMapping("/t11")
	public String func11() {
		return "/animal/Dogview";
	}

}
