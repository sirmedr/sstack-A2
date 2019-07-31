public class Assignment2 {
    public static void main(String[] args){
        //Send arguments through command line
        int argSum = 0;
        int[] arg = new int[args.length];
        for(int x = 0; x < arg.length; x++){
            arg[x] = Integer.parseInt(args[x]);
            argSum += arg[x];
        }
        System.out.println(argSum);
        
        //2D Array
        int[][] array2D = new int[2][10];
        int greatestNum = 0;
        int greatestFIndex = 0; 
        int greatestLIndex= 0;
        for(int i = 0;i < 2;i++){
            for(int j = 0;j<array2D[i].length;j++){
                array2D[i][j] = (int)(Math.random()*10);
                if(greatestNum < array2D[i][j]){
                    greatestNum = array2D[i][j];
                    greatestFIndex=i;
                    greatestLIndex=j;
                }
                System.out.println("\nIndex 1: "+i+"\nindex 2: "+j+"\nElement: "+array2D[i][j]);
            }
        }
        System.out.println("First: "+greatestFIndex + "\nSecond: "+greatestLIndex+"\nGreatest Number: "+greatestNum);
    }
}