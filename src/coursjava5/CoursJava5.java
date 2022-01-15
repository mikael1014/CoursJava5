/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coursjava5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *
 * @author Mike
 */
public class CoursJava5 {

    /**
     * @param args the command line arguments
     */
   // public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        // TODO code application logic here
        File fichier = new File("fichier1.txt");
//        System.out.println("Chemin absolue du fichier : " + fichier.getAbsolutePath());
//        System.out.println("Nom du fichier : " + fichier.getName());
//        System.out.println("Est-ce qu'il existe ? " + fichier.exists());
//        System.out.println("Est-ce un répertoire ? " + fichier.isDirectory());
//        System.out.println("Est-ce un fichier ? " + fichier.isFile());
        Scanner sc = new Scanner(System.in);
        String nom = new String();

        String reponse = new String();
        while (continuer(sc)) {

            //continuer(sc);
            System.out.println("Quel-est le nom de l'article?");
            nom = sc.nextLine();
            ecrireDansUnFichier(nom);
        }

    }

    public static boolean continuer(Scanner sc) {
        System.out.println("\nSouhaitez-vous entrer un  article ?\nO: oui \nN: non ");
        String reponse = sc.nextLine();
        return reponse.toUpperCase().charAt(0) == 'O';
    }

    public static void ecrireDansUnFichier() throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("fichier1.txt", "UTF-8");
//        writer.println("The first line");
//        writer.println("The second line");
//        writer.println("The second line");
//        writer.println("The second line");
//        writer.println("The second line");

//        writer.close();
    }

    public static void ecrireDansUnFichier(String nom) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("fichier1.txt", "UTF-8");
        writer.println(nom);
        writer.close();

    }

    public static void lireDansUnFichierLigneParLigne() throws FileNotFoundException, IOException {
        BufferedReader br = null;
        br = new BufferedReader(new FileReader("fichier1.txt"));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
//            je fais ce que je veux
            line = br.readLine();
        }

        String everything = sb.toString();
        System.out.println(everything);

    }
    

}
