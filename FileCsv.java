import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * App
 */
public class FileCsv {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\maria\\OneDrive\\Área de Trabalho\\PoyatosExUm\\ExercicioUm\\src\\JogosDesordenados.csv");
        Scanner sc= null;
        try{
            sc = new Scanner(file);
            while(sc.hasNextLine()){ //enquanto n chegar no final do arquivo
                String line = sc.nextLine(); //ler a linha
                System.out.println(line);
            }   sc.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{ //msm se der certo ou errado
            if( sc !=null){
            sc.close();
        }
    }
    }

}