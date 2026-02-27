// Selective Counter

public class TestingFile3 {
    
    String globalName;

    TestingFile3(){
        this.globalName = "Sky";
    }
    public static void main(String[] args) {

        TestingFile3 program = new TestingFile3();
        
        program.MyCustomMethod("This is my argument");

    }
    public void MyCustomMethod(String arguments){

        System.out.println(arguments);
        System.out.println(globalName);

        }
        

}

