public class Untitled {
    public static void main(String[] args) {
        // int i,j ;
        // int x = 0;
        // int n = 10;
        // for(i=0; i<n ; i++){
        //     System.err.println("i的值：" + i);
        //     for(j=i;j<n;j++){
        //         System.err.println("j的值：" + j);
        //         x = x+1;
        //         System.err.println("x的值：" + x);
        //     }
        // }

        int o;
        int l = 10;
        o = l * l;      
        while (o != 1) {
            o = o/2;
            System.err.println(o); 
        }

        int r = 0;
        int y=10 ;
        while ( y >=(r+1)*(r+1)) {
            r = r + 1;
            System.err.println(r + "oooo");
        } 
        
        int n = 10;
        int sum = 0;
        for(int d=1;d<=n;d++){
            sum = sum + d;
            System.err.println(sum + "ddd" + d);
        }
    }
    
} 
