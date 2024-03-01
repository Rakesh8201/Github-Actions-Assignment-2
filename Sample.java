public class Sample {

    // sample function added
    public static void sampleFunction(){
        System.out.println(
            "Iam Sample Function I provide:"
        );
        sampleFunction2();
    }

    // sample function 2 added
    public static void sampleFunction2(){
        for(int i=0;i<3;i++){
            System.out.println(
                "My "+(i+1)+" functionality"
            );
        }
    }
    public static void main(String Args[]){

        System.out.println(
            "Iam main function"
        );
        sampleFunction();
    }
}
