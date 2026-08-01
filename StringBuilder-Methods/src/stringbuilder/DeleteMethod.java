
//Syntax
//sb.delete(startIndex, endIndex);
class DeleteMethod {
    
    public static void main(String[] args) {
        StringBuilder sd=new StringBuilder("ANKIT");
        //A N K I T
        //0 1 2 3 4
        sd.delete(1,4);
        //N K I 
        System.out.println(sd);
        //this program or method use to delete index 1 to 4 means N K I
    }
}
