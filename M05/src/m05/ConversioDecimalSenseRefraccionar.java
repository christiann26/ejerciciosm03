package m05;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Renombra la variable valor a resultat
 * Encapsula en mètodes estàtics separats del main:
 *    El codi que pinta el menu, mètode menu sense paràmetres.
 *    Tal i com està al case 3, el mètode dec_oct, crear-ne 2 més 
 *    per a les conversions del case 1 i al 3.
 * @author Override MMX
 */

public class ConversioDecimalSenseRefraccionar
{
    private BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

    /**
     * @return the in
     */
    private BufferedReader getIn() {
        return in;
    }

    /**
     * @param in the in to set
     */
    private void setIn(BufferedReader in) {
        this.in = in;
    }
 
    void menu()throws IOException
    {
        while(true)
        {
        	System.out.println("\nMENU");
            System.out.println("1.-DECIMAL => BINARIO");
            System.out.println("2.-DECIMAL => HEXADECIMAL");
            System.out.println("3.-DECIMAL => OCTAL\n");
            System.out.print("4.-SALIR\n OPCION: ");
     
            int opc=Integer.parseInt(getIn().readLine());
            String resultat;
            System.out.print("\n");
     
            switch(opc)
            {
                case 1:
                    System.out.println("\n\nDECIMAL => BINARIO");
                    System.out.print("DECIMAL= ");
                    resultat=getIn().readLine();
                    dec_bin(resultat);
                    break;
                case 2:
                    System.out.println("\n\nDECIMAL => HEXADECIMAL");
                    System.out.print("DECIMAL= ");
                    resultat=getIn().readLine();
                    dec_hex(resultat);
                    break;
                case 3:
                    System.out.println("\n\nDECIMAL => OCTAL");
                    System.out.print("DECIMAL= ");
                    resultat=getIn().readLine();
                    dec_oct(resultat);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.print("Introduexi una opció de l'1 al 4.");
                    break;
            }
        }
    }

    void dec_bin(String resultat) throws NumberFormatException {
        // TODO Ref. Conversio a binari.
        int dec=Integer.parseInt(resultat);
        resultat=Integer.toBinaryString(dec);
        System.out.print("BINARIO: "+resultat);
    }

    void dec_hex(String resultat) throws NumberFormatException {
        // TODO Ref. Conversio a hex.
        int hex=Integer.parseInt(resultat);
        resultat=Integer.toHexString(hex);
        System.out.print("HEXADECIMAL: "+resultat);
    }

 
    void dec_oct(String resultat)
    {
    	// TODO Rename dec to oct
        int dec=Integer.parseInt(resultat);
        resultat=Integer.toOctalString(dec);
        System.out.print("OCTAL: "+resultat);
    }
 
    public static void main(String [] args) throws IOException
    {
        ConversioDecimalSenseRefraccionar conversion = 
                new ConversioDecimalSenseRefraccionar();
        conversion.menu();
    }
}