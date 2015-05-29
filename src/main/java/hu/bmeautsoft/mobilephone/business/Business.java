package hu.bmeautsoft.mobilephone.business;

import hu.cegnev.todolistapp.business.TodoLogic;
import hu.cegnev.todolistapp.model.Todo;
import org.joda.time.DateTime;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Business {

    TodoLogic todoLogic;

    final static Logger logger = Logger.getLogger(Business.class.getName());

    public Business(){
        todoLogic = new TodoLogic();
    }

    public void initializeTodoList(){
        todoLogic.add(new Todo(1,"Short task","Hurry, only two hours left!",DateTime.now().plusHours(2)));
        todoLogic.add(new Todo(2,"Long task","Don\'t worry, six hours left!",DateTime.now().plusHours(6)));
    }

    public void showTodoList(){
        log("########################################");
        log("#                                      #");
        log("#               TODOLIST               #");
        log("#                                      #");
        log("########################################");
        List<Todo> todoList = todoLogic.getAvailableItems();
        for(Todo todo: todoList){
            log(todo.toString());
        }
    }

    private void log(String message){
        logger.log(Level.ALL, message);
    }
}
