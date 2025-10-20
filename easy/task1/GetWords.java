import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class GetWords {
    public static void main(String[] args) {
        String words = "";
        try {
            File names = new File("easy/task1/word.txt");
            Scanner myReader = new Scanner(names);
            while (myReader.hasNext()){
               words = myReader.nextLine();
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        words = words.toLowerCase().replaceAll("\\p{Punct}", "").replaceAll("\\d","");
        String[] s = words.split("\\s+");
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(s));
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : strList){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        int maxWordLength = 0;
        for (String word : map.keySet()) {
            if (word.length() > maxWordLength) {
                maxWordLength = word.length();
            }
        }

        // Step 2: Print each word and count, aligned
        List<String> res = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            // %-Ns means left-align in a field of width N
            // %d prints integer normally (right-aligned)
            res.add(String.format("%-" + (maxWordLength + 2) + "s%d%n", word, count));
        }
        res = res.stream().sorted().toList();
        try {
            PrintWriter outFile = new PrintWriter("easy/task1/output.txt");
            for (String word : res) {
                outFile.print(word);
            }
            outFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
