/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmstudy;


/**
 *
 * @author shiggins
 */
public class Percolation {
    
    private int[] ids;
        
   // create N-by-N grid, with all sites blocked
    public Percolation(int N) {
        
        ids = new int[N];
        
        for (int i = 0; i < N; i++)
        {
           ids[i] = 'b'; 
        }
   }              
   // open site (row i, column j) if it is not already
    public void open(int i, int j) {
   
   }         
   
    // is site (row i, column j) open?
    public boolean isOpen(int i, int j) {
        
        return false;
   }    
   
    // is site (row i, column j) full?
    public boolean isFull(int i, int j) {
        
        return false;
   }
    
   // does the system percolate?
    public boolean percolates() {
        
        return false;
        
   }            
}
