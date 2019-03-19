package Sample;

import com.google.gson.Gson;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ParseJsonTest {


    Gson gson = new Gson();
    BufferedReader br = null;

    @Test
    public void test(){


try{
        try {
            br = new BufferedReader(new FileReader("./src/main/resources/data.json"));
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        Result result = gson.fromJson(br, Result.class);
        if (result != null) {
            for (Todo t : result.getTodos()) {
                System.out.println(t.getId() + " - " + t.getTitle() + " - " + t.getCompleted());
            }
        }
    }

finally {
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    }
}
