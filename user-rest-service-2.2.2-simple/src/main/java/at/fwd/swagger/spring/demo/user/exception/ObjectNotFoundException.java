package at.fwd.swagger.spring.demo.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Object not found")  // 404
public class ObjectNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5514399964580033171L;

	public ObjectNotFoundException(String message) {
		super(message);
	}
}
