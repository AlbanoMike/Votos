import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Integer> eleicao = new HashMap<>();
        try {
            //put here ypur file path
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/mikel/Downloads/votes.txt"));
            String line = br.readLine();
            while (line != null) {
               String[] votos = line.split(",");
               if(eleicao.containsKey(votos[0])){
                    eleicao.put(votos[0],eleicao.get(votos[0])+Integer.parseInt(votos[1]));
                }
               else {
                   eleicao.put(votos[0],Integer.parseInt(votos[1]));
               }
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


        for (String votes: eleicao.keySet()){
            System.out.println(votes+ " "+eleicao.get(votes));
        }
    }
}