package dssc.assignment.leapyear;

public class LeapYear {



    public static void main(String[] args) {
        LeapYear ly = new LeapYear();
        ly.print(Integer.parseInt(args[0]));
    }

    // we could have written it in a fancier way tho'
    public boolean isLeap(int i) {
        if(i % 400 == 0) {
            return true;
        } else {
            if (i % 100 == 0) {
                return false;
            }else {
                return i % 4 == 0;
            }
        }
    }

    public void print(int i){
        System.out.println(isLeap(i)? "true":"false");
    }
}

