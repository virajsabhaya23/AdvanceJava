package FunctionalProgramming;

public class Main {
    public static void main(String[] args) {
        
        GreetingMsg gm = new GreetingMsg() {
            @Override
            public void greet(String name){
                System.out.println("Hello " + name);
            }
        };

        gm.greet("V");
    }
}
