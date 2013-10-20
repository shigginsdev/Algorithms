/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmstudy;

/**
 *
 * @author shiggins
 */
public class AlgorithmStudy {

    /**
     * @param args the command line arguments
     */
    public static int[] ids;
    
    public static void setIds(int N)
    {
        ids = new int[N];
        
        for (int i = 0; i < N; i++)
        {
           ids[i] = i; 
        }
    }
    
   //quick find method to solve dynamic connectivity problem
    public static void union(int p, int q)
    {
        int pid = ids[p];
        int qid = ids[q];
        
        //get all of the ids that are equivilant to p and
        //change them to q
        
        for (int i = 0; i < ids.length; i++)
        {
            if (ids[i] == pid)
            {
                ids[i] = qid;
            }
        }
    }
    
    //quick find method to solve dynamic connectivity problem
    public static boolean find(int p, int q)
    {
        return (ids[p] == ids[q]);
        
    }
    
    //quick union method to solve dynamic connectivity problem
    //identical method for weighted quick union
    public static int findRoot(int i)
    {
        //chase parent pointers until you find the root
        while (i != ids[i])
        {
            i = ids[i];
        }
        
        return i;
    }
    
    //quick union method to solve dynamic connectivity problem
    public static boolean areConnected(int p, int q)
    {
        return (findRoot(p) == findRoot(q));
    }
    
    //quick union method to solve dynamic connectivity problem
    public static void makeUnion(int p, int q)
    {
        int i = findRoot(p);
        int j = findRoot(q);
        ids[i] = j;
    }
    
    public static void printArray()
    {
        for (int i = 0; i < ids.length; i++)
        {
            System.out.println(i + " = " + ids[i]);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //set array size
        //quick find method to solve dynamic connectivity problem
        /* AlgorithmStudy.setIds(Integer.parseInt(args[0]));
        AlgorithmStudy.union(3, 4);
        AlgorithmStudy.union(4, 9);
        AlgorithmStudy.union(2, 9);
        
        System.out.println(AlgorithmStudy.find(7, 2));
        
        AlgorithmStudy.printArray();       */
        
        //quick union method to solve dynamic connectivity problem
        AlgorithmStudy.setIds(Integer.parseInt(args[0]));
        makeUnion(3, 4);
        makeUnion(4, 9);
        makeUnion(2, 9);
        
        System.out.println(areConnected(7, 2));
        
        printArray();
    }
}
