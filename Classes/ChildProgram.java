package Classes;

public class ChildProgram{

    private String childName;

    ChildProgram(String childName){
        this.childName = childName;
    }
    public static void main(String[] args){

    }

    public void MyCustomMethod2(String args){

        System.out.println(args + " and " + childName);
    }
}