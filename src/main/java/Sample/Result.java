package Sample;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
@Generated("org.jsonschema2pojo")
public class Result {
    @SerializedName("todos")
    @Expose
    private List<Todo> todos = new ArrayList<Todo>();
    /**
     *
     * @return The todos
     */
    public List<Todo> getTodos() {
        return todos;
    }
    /**
     *
     * @param todos
     * The todos
     */
    public void setTodos(List<Todo> todos) {
        this.todos = todos;
    }
}
