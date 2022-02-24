package FunctionalProgramming.LambdaEx;

public class Main {
    public static void main(String[] args) {
        
        GreetingMsg gm = new GreetingMsg() {
            @Override
            public void greet(String name){
                System.out.println("Hello " + name);
            }
        };
        gm.greet("V");

        //ALTERNATIVE
        GreetingMsg gm2 = (name) -> {
            System.out.println("Hello " + name);
        };
        gm2.greet("V1");

        MessagePrinter mp = () -> {
            System.out.println("This is from the message printer");
        };
        mp.printMsg();
    }
}
