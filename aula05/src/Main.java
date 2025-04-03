import java.io.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws IOException {

        //Propriedades
        System.out.println(System.getProperty("User.dir"));
        System.out.println(System.getProperty("User.home"));
        System.out.println(System.getProperty("User.name"));
        System.out.println(System.getProperty("file.separator"));

        File dir = new File("C:\\Teste");

        if(!dir.isDirectory()){
            var result = dir.mkdir();
            System.out.println(result);
        }

        File file = new File(dir,"teste.txt");

        if (!file.exists()){
            System.out.println("Criando arquivo" + file.getName());
            var result = file.createNewFile();
            System.out.println(result);
        }
        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (int i = 1; i < 11; i++) {
            printWriter.write(String.format("Linha %d\n", i));
        }
        printWriter.close();
        System.out.println("Escrita dos dados realizado com sucesso.");

        //fazendo leitura de dados do arquivo
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String linha = " ";
        while((linha = bufferedReader.readLine()) != null){
            System.out.println(linha);
        }

        /*
        File file2 = new File(dir, "Banana.txt");
        var r = file.renameTo(file2);

        System.out.println(r);

        TODO: Apaga diretorios ou arquivos
        System.out.println(file2.delete());
        System.out.println(file.delete());
        System.out.println(dir.delete());

        TODO: Exibi Todos os arquivos e diretorios;
        File all = new File("C:\\");
        for(File f : all.listFiles()){
            if(f.isDirectory()){
                System.out.println(f.getName() + " é um DIR");
                continue;
            }
            System.out.println((f.getName()) + " é um FILE");
        }
*/
    }
}