public class methods {
    public int min(int a, int b){
        if( a > b){
            return b;
        } else {
            return a;
        }
    }

    public String isFiveCharacters(String a){
        if (a.length() == 5){
            return a;
        } else {
            return "False";
        }
    }
}
