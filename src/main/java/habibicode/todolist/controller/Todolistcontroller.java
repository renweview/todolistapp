package habibicode.todolist.controller;

import habibicode.todolist.model.CompletionStatus;
import habibicode.todolist.model.Todolist;
import habibicode.todolist.repository.Todolistrepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Todolistcontroller {
    private Todolistrepository todolistrepository;

    public Todolistcontroller(Todolistrepository repository)
    { //assigning the global variable in this class to the param passed in
        this.todolistrepository = repository;
    }

    @PostMapping("/todolist")
    public ResponseEntity createTodolist(@RequestParam String title){
        Todolist todolist = new Todolist();
        todolist.setTitle(title);
        todolist.setStatus(CompletionStatus.NOT_STARTED);

        Todolist savedlist = todolistrepository.save(todolist);
        return new ResponseEntity(savedlist, HttpStatus.CREATED);

    }
    @GetMapping("/todolist")
    public ResponseEntity getAllTodos() {
        Iterable<Todolist> all = todolistrepository.findAll();
         return new ResponseEntity(all,HttpStatus.OK);
    }

}
