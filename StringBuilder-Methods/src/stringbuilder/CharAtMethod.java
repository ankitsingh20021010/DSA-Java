
//CharAt method use to return a single char use to index number and in java String index start at 0to n number

class  CharAtMethod{
    
    public static void main(String[] args) {
        StringBuilder sd=new StringBuilder("ANKIT");
        //A N K I T
        //0 1 2 3 4
        char ch=sd.charAt(3);
      char n=sd.charAt(4);
        System.out.println(ch);
        System.out.println(n);
    }
}

//output 
//I
//T
