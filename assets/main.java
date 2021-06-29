import java.util.Scanner;
public class Team{
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
            System.out.println("Game Between 2 Teams");
            System.out.println("Win is 2 points"+"\n"+"Loss is worth 0 points"+"\n"+"Overtime is worth 1 point");
            System.out.println("Type W, O, or L"+"\n"+"Type Q to end the game");
            int pointsw = 0;
            int pointsl = 0;
            int pointso = 0;
            int pointsw2 = 0;
            int pointsl2 = 0;
            int pointso2 = 0;
            int totalpoints = 0;
            int totalpoints2 = 0;
            int counter = 0;
            int counter2 = 0;
            boolean go = true;
                System.out.println("\n"+"Enter team one:");
            String phrase = keyboard.next();
                System.out.println("\n"+"Enter team two:");
            String phrase2 = keyboard.next();
                System.out.println();
                while (go){
                    System.out.println("Enter " + phrase + " Result:");
                    String team1 = keyboard.next();
                    if (team1.equals("Q") || team1.equals("q")){
                        break;
                    }
                    else if (team1.equals("W")||team1.equals("w")){
                        pointsw+=2;
                    }else if (team1.equals("O")||team1.equals("o")){
                        pointso+=1;
                    }else if (team1.equals("L")||team1.equals("l")){
                        pointsl+=0;
                    }
                    counter++;
                    System.out.println("Enter " + phrase2 + " Result");
                    String team2 = keyboard.next();
                    if (team2.equals("Q") || team2.equals("q")){
                        break;
                    }
                    else if (team2.equals("W")||team2.equals("w")){
                        pointsw2+=2;
                    }else if (team2.equals("O")||team2.equals("o")){
                        pointso2+=1;
                    }else if (team2.equals("L")||team2.equals("l")){
                        pointsl2+=0;
                    }
                    counter2++;
                    totalpoints = pointsw + pointso + pointsl;
                    totalpoints2 = pointsw2 + pointso2 + pointsl2;
                    }
                        if (totalpoints > totalpoints2){
                            System.out.println(phrase + " wins with "+totalpoints +" points");
                            System.out.println("It took "+ phrase + " " + counter +" rounds to win");
                        }else if (totalpoints < totalpoints2) {
                            System.out.println(phrase2 + " wins with "+ totalpoints2+" points");
                            System.out.println("It took "+ phrase2 + " " + counter2 +" rounds to win");
                        }else if (totalpoints == totalpoints2){
                            int totalrounds = counter + counter2;
                            System.out.println("It is tie game between " + phrase +" and " + phrase2);
                            System.out.println("The game lasted till " + totalrounds +" rounds");
        }
    }
}
