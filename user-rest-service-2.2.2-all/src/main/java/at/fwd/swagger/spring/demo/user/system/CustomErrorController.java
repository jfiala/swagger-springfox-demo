package at.fwd.swagger.spring.demo.user.system;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
//@ApiIgnore
public class CustomErrorController implements ErrorController {

	private static final String PATH = "/error";

	@Override
	public String getErrorPath() {
		return PATH;
	}
	
	@RequestMapping(method=RequestMethod.GET, value=PATH, produces="application/json")
    @ResponseBody
    public Map<String, Object> handleGet(HttpServletRequest request) {

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("status", request.getAttribute("javax.servlet.error.status_code"));
        map.put("reason", request.getAttribute("javax.servlet.error.message"));

        return map;
    }
	
	@RequestMapping(method=RequestMethod.POST, value=PATH, produces="application/json")
    @ResponseBody
    public Map<String, Object> handlePost(HttpServletRequest request) {

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("status", request.getAttribute("javax.servlet.error.status_code"));
        map.put("reason", request.getAttribute("javax.servlet.error.message"));

        return map;
    }
	
	
}