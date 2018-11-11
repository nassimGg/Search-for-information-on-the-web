package riw;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nassim Guergouri
 */
public class DocElement {
    String value;// Valeur Document
    DocElement next;// Pointeur vers le document suivant
    // Constructeur
    public DocElement(String val, DocElement suivant){
        value = val;
        next = suivant;
    }
    // Getteur valeur document
    public String getValue(){
        return value;
    }
    // Getteur document suivant
    public DocElement getNext(){
        return next;
    }
    // Setteur document suivant
    public void setNext(DocElement suiv){
        next = suiv;
    }
}
