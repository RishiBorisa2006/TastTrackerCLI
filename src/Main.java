import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

import java.util.ArrayList;

public class Main {
    static ArrayList<Task> taskList = new ArrayList<>();
    public static void main(String[] args) {

    }
    public static void saveTasks() {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("[\n");

        for (int i = 0; i < taskList.size(); i++) {
            Task t = taskList.get(i);
            jsonBuilder.append(t.toJson());
            if(i < (taskList.size() - 1)) {
                jsonBuilder.append(",\n");
            }
            else {
                jsonBuilder.append("\n");
            }
        }
        jsonBuilder.append("]");
    }
}