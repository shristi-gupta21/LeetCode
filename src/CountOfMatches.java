public class CountOfMatches {
    public int numberOfMatches(int n) {
        int teamsForNextRound ;
        int teamsForNextRound2 = 0;
        int matches ;
        int matches1 ;
        int result = 0;
        if (n % 2 == 0) {
            matches = n / 2;//7
            teamsForNextRound = n / 2;//7
            teamsForNextRound2 = teamsForNextRound;
            //System.out.println(teamsForNextRound);
        } else {
            matches = (n - 1) / 2;
            teamsForNextRound = (n - 1) / 2 + 1;
            teamsForNextRound2 = teamsForNextRound;
        }
            result+=matches;//result = 7
        if (teamsForNextRound < n) {//7
            System.out.println(n);
            for (int i = 0; i < teamsForNextRound2; i++) {//n=14
                if (teamsForNextRound % 2 == 0) {
                    matches1 = teamsForNextRound / 2;
                    teamsForNextRound = teamsForNextRound / 2;
                    System.out.println("------------------------------------------------");
                    System.out.println(teamsForNextRound);
                    System.out.println(matches1);
                } else {
                    matches1 = (teamsForNextRound - 1) / 2;//3
                    teamsForNextRound = ((teamsForNextRound - 1) / 2) + 1;//4
                    System.out.println("--------------------------------------------------");
                    System.out.println(teamsForNextRound);
                    System.out.println(matches1);
                }

                result+=matches1;
                if (teamsForNextRound == 1 && matches1 == 0){
                    break;
                }
            }
        }
        return result;

    }
    public static void main(String[] args) {
        CountOfMatches countOfMatches = new CountOfMatches();
        System.out.println(countOfMatches.numberOfMatches(14));
    }
}
