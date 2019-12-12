public class testAdd{

    public String testAdd(Integer a) {
        if (a == 8){
            return a.toString();
        } else if (a == 9){
            return a.toString();
        } else if (a == 1){
            return a.toString();
        } else if (a == 2){
            return a.toString();
        } else{
            assert(a > 9);
        }
        Fake fake = new Fake();
        return fake.toString();
    }
    private class Fake{
        public int amount = 0;
        @Override
        public String toString(){
            return null;
        }
    }

}


