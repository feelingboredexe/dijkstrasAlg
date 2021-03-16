package alg;

/**
 *
 * @author Oliver
 */
import java.util.*;


public class dijkstrasAlg {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        // inputting number of nodes
        int nodes = input.nextInt();
        // list to store the distance between two nodes
        // let x be first node, y be second node, and z be distance
        // input: x y z
        ArrayList<String> distanceList = new ArrayList<String>();
        String temp;
        
        for (int i = 1; i <= nodes; i++) {
            temp = input.next();
            distanceList.add(temp);
            temp = "";
        }
        
        for (int j = 0; j <= distanceList.size(); j++) {
            
        }
        
        
        
        
    }
}
