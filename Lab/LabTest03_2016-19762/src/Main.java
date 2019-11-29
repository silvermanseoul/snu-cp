import java.io.*;
import java.util.*;

public class Main {

    static FantasyFootballDB fantasyDB = new FantasyFootballDB();

    public static void main(String[] args) {
        fantasyDB.initializeDB("data/roster.txt");
        fantasyDB.printPlayerInfo("Man City", "Aguero");
        fantasyDB.printTeamInfo("Arsenal");
    }
}

class Player {

    String name;
    String teamName;
    int score;
    double cost;

    public Player(String name, String teamName, int score, double cost) {
        this.name = name;
        this.teamName = teamName;
        this.score = score;
        this.cost = cost;
    }
}

class FantasyFootballDB {
    //  define a class attribute for the database
    //  private (type) db = new (class);

    private Map<String, List<Player>> db = new HashMap<String, List<Player>>();

    public void initializeDB(String filepath) {
        try {
            Scanner sc = new Scanner(new File(filepath));
            while (sc.hasNext()) {
                String line = sc.nextLine();
                String playerName = line.split(",")[0];
                String teamName = line.split(",")[1];
                int score = Integer.parseInt(line.split(",")[2]);
                double cost = Double.parseDouble(line.split(",")[3]);
                Player p = new Player(playerName, teamName, score, cost);

                if(!db.containsKey(teamName)) {
                    List<Player> pList = new ArrayList<Player>();
                    pList.add(p);
                    db.put(teamName, pList);
                }
                else {
                    List<Player> pList = db.get(teamName);
                    pList.add(p);
                    db.put(teamName, pList);
                }
            }
            sc.close();
        } catch(IOException e) {e.printStackTrace();}
    }

    public void printPlayerInfo(String teamName, String playerName) {
        List<Player> pList = db.get(teamName);
        for(Player p : pList) {
            if(p.name.equals(playerName)) {
                System.out.println("score: "+ p.score + ", price: " + p.cost);
                break;
            }
        }
    }

    public void printTeamInfo(String teamName) {
        List<Player> pList = db.get(teamName);
        int scoreSum = 0; double costSum = 0;
        for(Player p : pList) {
            scoreSum += p.score;
            costSum += p.cost;
        }
        System.out.println("score: "+ scoreSum + ", price: " + costSum);
    }
}




//class FantasyFootballDB {
//    //  define a class attribute for the database
//    //  private (type) db = new (class);
//
//    private Map<String, Integer> db1 = new HashMap<String, Integer>();
//    private Map<String, Double> db2 = new HashMap<String, Double>();
//    private Map<String, Integer> db3 = new HashMap<String, Integer>();
//    private Map<String, Double> db4 = new HashMap<String, Double>();
//
//
//    public void initializeDB(String filepath) {
//        try {
//            Scanner sc = new Scanner(new File(filepath));
//            while (sc.hasNext()) {
//                String line = sc.nextLine();
//                String playerName = line.split(",")[0];
//                String teamName = line.split(",")[1];
//                Integer score = Integer.parseInt(line.split(",")[2]);
//                Double cost = Double.parseDouble(line.split(",")[3]);
//                String names = teamName + playerName;
//
//                if(!db1.containsKey(teamName))
//                    db1.put(teamName, score);
//                else {
//                    Integer currScore = db1.get(teamName);
//                    db1.put(teamName, currScore + score);
//                }
//                if(!db2.containsKey(teamName))
//                    db2.put(teamName, cost);
//                else {
//                    Double currCost = db2.get(teamName);
//                    db2.put(teamName, currCost + cost);
//                }
//
//                db3.put(names, score);
//                db4.put(names, cost);
//            }
//            sc.close();
//        } catch(IOException e) {e.printStackTrace();}
//    }
//
//    public void printPlayerInfo(String teamName, String playerName) {
//        String names = teamName +playerName;
//        System.out.println("score: "+ db3.get(names) + ", price: " + db4.get(names));
//    }
//
//    public void printTeamInfo(String teamName) {
//        System.out.println("score: "+ db1.get(teamName) + ", price: " + db2.get(teamName));
//    }
//}


