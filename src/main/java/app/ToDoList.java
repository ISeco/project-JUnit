package app;

import java.util.ArrayList;
import java.util.Iterator;

public class ToDoList {
	private ArrayList<String> tasks;
	
	public ToDoList() {
		this.tasks = new ArrayList<>();
	}
	
	// Mostrar el listado de tareas
	public ArrayList<String> getToDoList () {
		return this.tasks;
	}
	
	public void updateToDoList (String task, int position) {
		this.tasks.set(position, task);
	}
	
	// Añadir una tarea a la lista
	public void addTask (String task) {
		// Código sin implementar
		this.tasks.add(task);
	}
	
	// Comprobar si agregó la lista
	public boolean isTaskInList(String task) {
		// Código sin implementar
		return this.tasks.contains(task);
	}
	
	// Eliminar una tarea de la lista
	public void removeTask (String task) {
		// Buscamos la posición de la tarea que deseamos eliminar
		int position = this.tasks.indexOf(task);
		// Removemos la tarea de la lista
		this.tasks.remove(position);
	}
}
