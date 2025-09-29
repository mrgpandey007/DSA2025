class Main {
      public static int uniquepaths(int n,int r) {
            int[][] ar = new int[n][r];
            for(int i=0;i<n;i++) {
                   for(int j=0;j<r;j++) {
                         if(i==0||j==0) {ar[i][j]++; continue}

                          ar[i][j]=ar[i][j-1]+ar[i-1][j];
                          
                   }
             }
            return ar[n-1][r-1];
      }
      public static void main(String[] args) {
             int n=3,r=7;
             System.out.println(uniquepaths(n,r));
      }

}