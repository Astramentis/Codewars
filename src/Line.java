public class Line {
    public static String Tickets(int[] peopleInLine) {
        int clerk = 0;
        //alg
        for (int i = 0; i < peopleInLine.length; i++) {
            if (peopleInLine[i] == 25) {
                clerk = clerk + 25;
            } else if (peopleInLine[i] > 25){
                clerk = clerk - (peopleInLine[i]-25);
            } else if (peopleInLine[i] < 0){
                clerk = clerk + peopleInLine[i];
            }
            if (clerk < -1) {
                break;
            }
        }
        if(clerk <= -1){
            return "NO";
        }
        return "YES";
    }
}