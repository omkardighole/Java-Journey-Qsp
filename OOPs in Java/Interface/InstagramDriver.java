// Interface defining Instagram features
interface Instagram {
    void post(String ip);
    void like(String name);
    void comment(String name, String ip);
    void message(String name, String msg);
    void story(String msg);

    // Static method in interface
    static void welcomeMessage(String name) {
        System.out.println("Hey! " + name + ", Welcome to Instagram.");
    }
}

// Abstract class providing partial implementation
abstract class InstaImp1 implements Instagram {
    String user;
    String pass;

    public InstaImp1() {}

    public InstaImp1(String user, String pass) {
        this.user = user;
        this.pass = pass;
        System.out.println("Account Created");
    }

    public void post(String ip) {
        System.out.println(ip);
        System.out.println(user + " posted.");
    }

    public void like(String name) {
        System.out.println(name + " liked your post.");
    }

    public void comment(String name, String ip) {
        System.out.println(ip);
        System.out.println(name + " commented.");
    }

    public void message(String name, String msg) {
        System.out.println(msg);
        System.out.println("Message sent to " + name);
    }
}

// Concrete class completing the implementation
class InstaImp2 extends InstaImp1 {
    public InstaImp2() {}

    public InstaImp2(String user, String pass) {
        super(user, pass);
    }

    public void story(String msg) {
        System.out.println(msg);
        System.out.println("Story updated.");
    }
}

// Driver class
public class InstagramDriver {
    public static void main(String[] args) {
        Instagram i1 = new InstaImp2("Raju", "Raji@123");

        i1.post("I am happy");
        i1.like("Angel Priya");
        i1.comment("Angel", "How?");
        i1.comment("Raju", "May I know who this is?");
        i1.message("Angel", "Hi, how do you know me?");
        i1.message("Angel", "Hi, are you busy?");
        i1.story("I am a lone wolf");
        i1.comment("Angel", "how");

        Instagram.welcomeMessage("Raju"); // Static method call
    }
}
