package lesson12;

public class test1 {
    public static void main(String[] args) {
        getCustomerInfo();
    }

    private static void getCustomerInfo() {
        try{
            //do something that cause an Exception
        }catch (java.io.FileNotFoundException ex){
            System.out.print("FileNotFoundException");
        }catch (java.io.IOException ex){
            System.out.print("IOException");
        }catch (java.lang.Exception ex){
            System.out.print("Exception!");
        }
    }
}
