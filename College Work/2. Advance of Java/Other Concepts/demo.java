public class demo {
    public demo(){
        System.out.println("Welcome");
    }
    public demo(String str){
        System.out.println("Hii "+str);
    }
    public void info(){
        System.out.println("You can Join our class.");
    }
    public void ask(String a){
        System.out.println("You can ask your question : "+a);
    }
    public static void main(String[] args) {
        demo d1 = new demo(); //Welcome
        new demo("How are you.");//Hii how are you.
        d1.info();
        d1.ask("What is java.");
    }
}
