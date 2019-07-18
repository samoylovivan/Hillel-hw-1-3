package ivan.samoylov;

public class Main {

    public static void main(String[] args) {
        System.out.println(myfun());
    }

    public static StringBuffer myfun(){
        StringBuffer myNum = new StringBuffer();

        for(int i = 1; i <= 30; i++){
            myNum.append("(").append(i).append(")");
        }
        return myNum;
    }
}
