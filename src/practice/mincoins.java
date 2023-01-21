package practice;

public class mincoins {
    public static void main(String[] args) {
        int v = 11;
        int m = 8 ;
        int[] table = new int[v+1];
        table[0]= 0 ;
        for(int i = 1 ; i<=v ; i++) table[i]= Integer.MAX_VALUE;

        int[] coins = {9, 6, 5, 1};
        for(int i = 1 ; i<=v ;i++){
            for(int j = 0 ; j<3 ; j++){
                if(coins[j]<=i){
                    int res = table[i-coins[j]];
                    if(res!=Integer.MAX_VALUE && res+1<table[i])
                        table[i] = res+1 ;
                }
            }
        }
        if(table[v]==Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(table[v]);

    }
}
