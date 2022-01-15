/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursjava5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

/**
 *
 * @author Mike
 */
//public static public static void main(String[] args) {
        // TODO code application logic here
    public static void lireDansUnFichierLigneParLigne() throws FileNotFoundException, IOException {
        BufferedReader br = null;
        br = new BufferedReader(new FileReader("fichier1.txt"));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        
        while (line != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
            
//créer le fichier en UTF8
            PrintWriter writer = creerFichierUtf8("fichier1.txt");
            
            char choix = 'O';
            do {
                System.out.print("Veuillez-saisir le nom à enregistrer : ");
                String nom = sc.nextLine();

                //écrire dans le fichier
                ecrireUnNomDansUnFichier(writer, nom);
                
                System.out.println("Voulez-vous continuer la saisie ?\n   O : oui\n   N : Non");
                choix = sc.nextLine().toUpperCase().charAt(0);
            }
            while(choix != 'N');
            
            //fermer le fichier
            fermerFichier(writer);
            
            //lire le fichier pour vérifier
            lireDansUnFichierLigneParLigne();

    }

}
