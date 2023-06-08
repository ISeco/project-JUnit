package app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ToDoListTest {

	@Test
	public void testAddTask() {
		// Crear una instancia de la clase ToDoList
		ToDoList toDoList = new ToDoList();
		
		toDoList.addTask("Ir a comprar pan");
		
		// Sirve para comprobar que nuestra tarea
		// ha sido añadida correctamente a la lista
		assertTrue(toDoList.isTaskInList("Ir a comprar pan"));
		
		// Actualizar una tarea de la lista
		toDoList.updateToDoList("Ir a comprar jugo", 0);
		assertTrue(toDoList.isTaskInList("Ir a comprar jugo"));
		
		// Eliminar una tarea de la lista
		toDoList.removeTask("Ir a comprar jugo");
		// Comprobar si se elimino la tarea de la lista
		assertTrue(!toDoList.isTaskInList("Ir a comprar jugo"));
		
		// Mostrar el listado
		assertTrue(toDoList.getToDoList().size() == 0);
	}
}
