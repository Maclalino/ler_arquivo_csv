import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReBufferedR {
    public static void main(String[] args) {
        
    
    String path ="C:\\Users\\maria\\OneDrive\\Área de Trabalho\\PoyatosExUm\\ExercicioUm\\src\\JogosDesordenados.csv";

    FileReader fr = null; // ter uma referencia
    BufferedReader br=null;//gerencia memoria para leitura, rapida

    try{
        fr = new FileReader(path);
        br = new BufferedReader(fr);

        String line = br.readLine();
        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }
    }
        catch(IOException e){
            System.out.println("Error");
        }
        finally{try{

        
            br.close();
            fr.close();
        }
        catch(IOException e){
            e.printStackTrace(); //mostrar todos os erros na tela
        }
    }
}
}
