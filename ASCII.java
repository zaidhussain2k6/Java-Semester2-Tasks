public class ASCII {
    public static void main(String[] args) {
        for(int i=0; i<=255; i++) {
            System.out.println("The ASCII Code of: " + (char)i + " is:" + i);
        }

        int num = 65;
        char ch = (char)num;
        
        System.out.println("The Value of Num is: " + ch);
    }
} 