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
public class TokenElement {
    String value;//Valeur Token
    DocElement first;// Pointeur vers premier Document
    // constructeur
    public TokenElement(String val,DocElement premier)
    {
        value = val;
        first = premier;
    }
    // Getteur la valeur Token
public String getValue(){
    return value;
}
// Getteur le premier Document
public DocElement getFirst(){
    return first;
}
// Setteur le premier docuement
public void setFirst(DocElement premier){
    first = premier;
}
}
