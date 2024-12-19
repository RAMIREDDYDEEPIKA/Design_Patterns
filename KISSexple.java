package designPrinciples;

class SumUtils{

    public void calculateArray(int[] numbers){

        int sum=0;
        for(int number:numbers){
            sum += number;
        }
        System.out.println(sum);
    }
}

public class KISSexple {

    public static void main(String[] args) {

        int[] numbers={1,3,2,4,8};
        SumUtils sumUtils=new SumUtils();
        System.out.print("Sum of numbers: ");
        sumUtils.calculateArray(numbers);
    }
}