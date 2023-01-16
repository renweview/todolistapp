package habibicode.todolist.repository;

import habibicode.todolist.model.Todolist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//this repo anno captures any errors and parcels them up through spring
@Repository
public interface Todolistrepository extends CrudRepository <Todolist, Long>{

}
