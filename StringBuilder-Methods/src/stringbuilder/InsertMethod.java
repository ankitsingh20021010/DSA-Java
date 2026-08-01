
//insert
//sb.insert(index,"value")
//sb.insert(3,"Hyy");
class InsertMethod{
    
    public static void main(String[] args) {
        StringBuilder sd=new StringBuilder("ANKIT");
        //A N K I T
        //0 1 2 3 4
        sd.insert(3,"hyy");
        //N K I 
        System.out.println(sd);
        //this program or method use to delete index 1 to 4 means N K I
    }
}

//output 
//ANkhyyIT
