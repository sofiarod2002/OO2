package ejer8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ToDoItemTest {
	ToDoItem todoitem;
	
	@BeforeEach
	void setUp() throws Exception {
		todoitem = new ToDoItem("Proyecto objetos 2");
	}

	@Test
	void testStart() {
		todoitem.start();
		Pending pending = new Pending("pe");
		assertEquals(pending, todoitem.getClass());
	}

}
