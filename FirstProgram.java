public class FirstProgram {


    String globalName;

    FirstProgram(){
        this.globalName = "Sky";
    }
    public static void main(String[] args){

        FirstProgram program = new FirstProgram();

        program.myCustomMethod("Passing an Argument");

    }

    public void myCustomMethod(String args){
        
        System.out.println(args);
        System.out.println("Global Name is: "+ globalName);

        program.myCustomMethod("Passing an Argument");
    }
}
