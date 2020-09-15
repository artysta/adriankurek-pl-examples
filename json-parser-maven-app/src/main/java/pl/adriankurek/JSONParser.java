package pl.adriankurek;

import java.util.*;
import org.json.*;

public class JSONParser {
    public List<User> getUsers(String jsonString) {
        JSONObject json = new JSONObject(jsonString);
        JSONArray jsonArray = json.getJSONArray("users");

        List<User> users = new ArrayList<>();

        for (Object o : jsonArray) {
            JSONObject obj = (JSONObject) o;

            String name = obj.getString("name");
            int age = obj.getInt("age");

            User user = new User(name, age);
            users.add(user);
        }
        
        return users;
    }
}