package clientwsperiodictable;

import java.util.Scanner;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

/**
 *
 * @author Jaime
 */
public class ClientWSPeriodicTable {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Periodic table element: ");
        String element = sc.nextLine();
        String aux = getAtomicNumber(element);
        
        Serializer serializer = new Persister();
        NewDataSet NewDataSet = new NewDataSet();
        serializer.read(NewDataSet, aux);
                
        System.out.print("What would you like to know?\n1: Atomic Number\n"
                + "2: Atomic Weight\n3: Element Symbol"
                + "\n4: Get all atoms in the Periodic Table\nEnter a number: ");
            
        switch (new Scanner(System.in).nextInt()) {
            case 1: 
                System.out.println("Atomic Number = " + NewDataSet.getTable().getAtomicNumber());
                break;
                    
            case 2:
                System.out.println("Atomic weight is " + NewDataSet.getTable().getAtomicWeight());
                break;

            case 3: 
                 System.out.println("Symbol is " + NewDataSet.getTable().getSymbol());
                break;
                 
            case 4: 
                    System.out.println("All atoms: \n" + getAtoms());
                break; 

            default:
                 System.out.println("Number must be between 1 and 4.");
        }
    }

    private static String getAtomicNumber(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicNumber(elementName);
    }

    private static String getAtomicWeight(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicWeight(elementName);
    }

    private static String getAtoms() {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtoms();
    }

    private static String getElementSymbol(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getElementSymbol(elementName);
    }
    
}
