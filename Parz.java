public class Parz {
    int a = 1;
    int i, j;
    public static void main(String[] args){
        int counter = 0;
        int i, j;
        for(i = 1; i < 100; i++){
            counter = 0;
            for(j = i; j>=1; j--) {
                if (i % j == 0) {
                    counter ++;
                    //System.out.println(i);
                }
            }
                if (counter == 2){
                    System.out.println(i);
                }
            }
            System.out.println(i);
        }
    }

