package no.hvl.dat110.rest.counters;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Random;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App {
	
	static HashMap<Long, Todo> todos = null;
	static final Gson gson = new Gson();
	static final Random random = new Random();
	
	public static void main(String[] args) {

		if (args.length > 0) {
			port(Integer.parseInt(args[0]));
		} else {
			port(8080);
		}

		todos = new HashMap<>();
		
		after((req, res) -> {
  		  res.type("application/json");
  		});
		
		get("/hello", (req, res) -> "Hello World!");
		
        get("/todo", (req, res) -> gson.toJson(todos));
 
        get("/todo/:id", (req, res) -> {
			long id = Long.parseLong(req.params("id"));
			return todos.get(id).toJson();
		});

        put("/todo/:id", (req,res) -> {
        	long id = Long.parseLong(req.params("id"));
			todos.put(id, gson.fromJson(req.body(), Todo.class));
			return todos.get(id).toJson();
        });

		post("/todo", (req, res) -> {
			long new_id = Math.abs(random.nextLong());
			while (todos.containsKey(new_id)) {
				new_id = Math.abs(random.nextLong());
			}

			todos.put(new_id, gson.fromJson(req.body(), Todo.class));
			return todos.get(new_id).toJson();
		});

		delete("/todo/:id", (req, res) -> {
			long id = Long.parseLong(req.params("id"));
			return todos.remove(id).toJson();
		});
    }
    
}
