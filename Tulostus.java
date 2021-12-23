import java.io.*;

public class Tulostus {
    public static void main(String [] args){
        int ika = 0;
        String sukupuoli = null;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        

        try{
            System.out.println("Oletko mies vai nainen (m/n)?");
            sukupuoli = in.readLine();
            System.out.println("Anna ikäsi:");
            ika = Integer.parseInt(in.readLine());

            if ((sukupuoli.equals("m")) && ((ika >= 0) && (ika <= 55))){
                System.out.println("Olet mies parhaassa iässä!");
             } 
            else if ((sukupuoli.equals("n")) && ((ika >= 0) && (ika <= 55))){
                System.out.println("Olet neito kauneimmillaan!");
             }
            else if ((sukupuoli.equals("m")) && ((ika >= 56) && (ika <= 100))){
                System.out.println("Olet viisas mies!");
            }
            else if ((sukupuoli.equals("n")) && ((ika >= 56) && (ika <= 100))){
                System.out.println("Olet nuori ikäiseksesi!");
            }
            else{
                System.out.println("Ohjelmassa tapahtunut virhe!");
            }
            
        }
        catch(Exception e){
            System.out.println("Ohjelmassa tapahtunut virhe!");
        }
    }

}
/*Tee ohjelma, joka kysyy ensin käyttäjän sukupuolen ja tämän jälkeen iän. Lopuksi ohjelma tulostaa jonkin lausahduksen seuraavan ohjeen mukaisesti:
- Mies 0-55 vuotta: "Olet mies parhaassa iässä!"
- Mies 56-100 vuotta: "Olet viisas mies!"
- Nainen 0-55 vuotta: "Olet neito kauneimmillaan!"
- Nainen 56-100 vuotta: "Olet nuori ikäiseksesi!"
- muuten "Ohjelmassa tapahtunut virhe!"

Oletko mies vai nainen (m/n)?x
Anna ikäsi:166
Ohjelmassa tapahtunut virhe!
*/ 