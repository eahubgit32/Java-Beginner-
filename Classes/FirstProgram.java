package Classes;

public class FirstProgram {
    
    String globalName;

    FirstProgram(){
        this.globalName = "Sky";
    }
    public static void main(String[] args) {

        FirstProgram program = new FirstProgram();
        
        program.MyCustomMethod("This is my argument from the First Program");

        ChildProgram program2 = new ChildProgram("Skyward");

        program2.MyCustomMethod2("This is my custom method Custom Method 2 from Child Program");
        
    }
    public void MyCustomMethod(String arguments){

        System.out.println(arguments);
        System.out.println(globalName);

    }
}

