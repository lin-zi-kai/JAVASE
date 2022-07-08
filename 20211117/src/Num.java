
public class Num {
    public static void main(String[] args) {
        for(int n = 0;n <= 100000;n++){
            int count = 0;
            int tmp = n;
            while(tmp != 0){
                count++;
                tmp = tmp/10;
            }
            tmp = n;
            int sum = 0;
            while(tmp != 0){
                sum += Math.pow(tmp%10,count);
                tmp = tmp/10;
            }
            if(sum == n){
                System.out.println(sum);
            }
        }
    }
}

