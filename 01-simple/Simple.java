import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

interface Ingrediente {
    String showMeTheName();
}

class Chocolate implements Ingrediente {
    public String showMeTheName() {
        return "chocolate";
    }
}

class Cafe implements Ingrediente {
    public Integer azucar;
    public static Integer defaultAzucar = 5;
    
    Cafe(Integer azucar) {
        this.azucar = azucar;
    }
    
    public String showMeTheName() {
        return "cafe";
    }
}

public class Simple {
    public static void main(String[] args) throws Exception {
        // swing
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        
        
        System.out.println(n >= 0 ? "Positivo" : "Negativo");
        
        Integer ii = 0;
        ii++;
        System.out.println(ii);
        
        List<Ingrediente> ings = new ArrayList<>();
        ings.add(new Cafe(1));
        ings.add(new Chocolate());
        
        for(Ingrediente i : ings) {
            System.out.println("Nombre:" + i.showMeTheName());
        }
        
        try {
            System.out.println("Default azucar cafe:" + Cafe.defaultAzucar);
            
            List<Cafe> cafeses = new ArrayList<Cafe>();
            cafeses.add(new Cafe(3));
            Cafe c = null;
            System.out.println(c.azucar + "-" + c.defaultAzucar);
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Excepcion");
        } finally {
            System.out.println("Finally");
        }
    }
}
