package hu.bmeautsoft.mobilephone.business;

import hu.cegnev.todolistapp.business.TodoLogic;
import hu.cegnev.todolistapp.model.Todo;
import org.joda.time.DateTime;

import java.util.List;

public class Business {

    TodoLogic todoLogic;

    public Business(){
        todoLogic = new TodoLogic();
    }

    public void initializeTodoList(){
        todoLogic.add(new Todo(1,"Short task","Hurry, only two hours left!",DateTime.now().plusHours(2)));
        todoLogic.add(new Todo(2,"Long task","Don\'t worry, six hours left!",DateTime.now().plusHours(6)));
    }

    public void showTodoList(){
        System.out.println("########################################");
        System.out.println("#                                      #");
        System.out.println("#               TODOLIST               #");
        System.out.println("#                                      #");
        System.out.println("########################################");
        List<Todo> todoList = todoLogic.getAvailableTodos();
        for(Todo todo: todoList){
            System.out.println(todo.toString());
        }
    }
}
