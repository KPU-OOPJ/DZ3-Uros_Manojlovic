
package testautobus;


public class TestAutobus {

    
    public static void main(String[] args) {
       Autobus a = new Autobus();
       
       a.uvozPutnika(0);
       a.uvozPutnika(0);
       a.uvozPutnika(19);
       a.uvozPutnika(49);
       
       a.status();
    }
    
}
