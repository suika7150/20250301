package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Benz {

	@Autowired
	@Qualifier("kiaEngine")
	private Engine engine;
<<<<<<< HEAD

	public Benz() {

	}

	// @Autowired
=======
	
	public Benz() {

	}
	
	//@Autowired
>>>>>>> 557507d453c157cbc19f54c8dc38aab2f7b64b8c
	public Benz(Engine engine) {
		super();
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

<<<<<<< HEAD
	// @Autowired
=======
	//@Autowired
>>>>>>> 557507d453c157cbc19f54c8dc38aab2f7b64b8c
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Benz [engine=" + engine + "]";
	}
<<<<<<< HEAD

	public void move() {
		engine.start();
	}

=======
	public void move() {
		engine.start();
	}
	
>>>>>>> 557507d453c157cbc19f54c8dc38aab2f7b64b8c
}
