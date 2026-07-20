public class nullpointer{
    public static void main(String[] args){
        System.out.println(args[0]);
        String my_sentence="I am not null";
        try{
            System.out.println(my_sentence.contains(null));
        }catch(NullPointerException e){
            System.out.println("Handling null pointer");
        }
        stringbuilderExample(null);
    }

    public static void stringbuilderExample(String[] args){
        String my_string_1="Tree";
        StringBuilder my_string_2= new StringBuilder("ree");
        System.out.println(my_string_1.contains(my_string_2));
    }
}