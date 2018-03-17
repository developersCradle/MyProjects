package chapter7;

public class Loops {

    public static void main(String[] args) {

        String[] months = {"January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"};

        /*
        for (int i = 0; i < months.length-1; i++)
        {
        	System.out.println(months[i]);
		}
        */
        for (String month : months)//for each
        {
        	System.out.println(month);
		}

    }

}
