package firstocurrenceinastring;

public class FirstString {
    public static void main(String[] args) {
        String haystack = "xlasun";
        String needle="sun";
        int hay = haystack.length();
        int need = needle.length();

        if(hay < need){
            System.out.println("menor");

        }

        for (int i = 0; i <=hay-need ; i++) {
            int j =0;
            while(j<need && haystack.charAt(i+j)== needle.charAt(j)){
                j++;

            }
            if (j==need){
                System.out.println(i);
            }
        }
        System.out.println("nao tem");



    }
}
