import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Indexation{
    
    
public static void main(String[] args) throws FileNotFoundException{
 
    //Lecture fichier du mots vides et les stocker dans une liste
    File stop_word = new File("E:\\Stop Words\\stopwords_français.txt");
    BufferedReader read_word = new BufferedReader(new FileReader(stop_word.getPath()));
    ArrayList stop_words;
    stop_words = new ArrayList<String>();
   String ligne = "";
    try {
        while((ligne=read_word.readLine())!=null){
            stop_words.add(ligne);
        }} catch (IOException ex) {
        Logger.getLogger(Indexation.class.getName()).log(Level.SEVERE, null, ex);
    }
       //Lecture tout les fichiers corpus
    String chemin_repert = "E:\\Corpus";
    File repert = new File(chemin_repert);
    File[] files = repert.listFiles();

        for (File f : files) {
            if(f.isFile()) {
              Scanner read_corpus = new Scanner(new FileInputStream(f),"UTF-8");
              
               //Lecture corpus
             while(read_corpus.hasNext())
              {
                  boolean trouve=true;
                  String word = read_corpus.next();
                  // Normalisation casse Miniscule
                  word = word.toLowerCase();
                  // Chercher s'il y a des mots vides dans la ligne
                  for(int i=0;i<stop_words.size();i++){
                      
                      if(word.equals(stop_words.get(i).toString())){
                          trouve=false;
                      }
                  }
                  if(trouve)// supprimer les mots vides si on les trouve
                  {
                      String[] line_nv = word.split("[\\p{Punct}\\s]+");//supprimer la ponctuation
                      for (int k=0;k<line_nv.length;k++)
                          System.out.println(line_nv[k]);//affichage du fichier  sans mots vides et ponctuation
                  }
                  
              }
            }
        }
}
}