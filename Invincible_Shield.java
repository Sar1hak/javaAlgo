/*Greed has an invincible shield due to which the attacks of Edward would not work on him. But Edward 
being a prodigy has caught onto the flaws in Greed's shield. The shield is made up of the same 
fundamental element, by which all other life forms are formed, Carbon.

He observed that Greed's shield can be represented as a grid G of carbon clusters with N rows and M columns. 
Each cell on the grid represents the orientation of the carbon cluster, either 0 or 1. 
Specifically, Gi,j denote the j-th carbon cluster in i-th row.
The shield is penetrable only when all the carbon clusters in the shield grid have the same orientation.

For achieving this, Initially, he chooses a single carbon cluster (ie. a single cell) in the shield. 
Now, he repeatedly applies the following move on this cluster, till all the carbon clusters in the grid have 
the same orientation:

In a single move, Edward flips the orientation of all clusters reachable from the chosen cluster. 
A cluster is called reachable from another cluster, if both clusters have the same orientation, 
and it is possible to move from one cluster to the other through clusters of that orientation only, 
moving vertically and horizontally. If earlier the orientation was 1, it turns into 0 and vice versa.

Choosing the start cell optimally, can you find the minimum number of moves to make all the clusters 
have same orientation?
 */

import java.util.*;

class Invincible_Shield{
    static int n=0;
    static int[][] calc(int A[][], int i, int j){
        int m=n==0?1:0;
        
            if(j+1<A.length && A[i][j+1] == n){
                A[i][j+1] = m;
                return calc(A,i,++j);
            }
            else if(i+1<A[0].length  && A[i+1][j] == n){
                A[i+1][j] = m;
                return calc(A,++i,j);
            }
            else if(i-1>= 0 && A[i-1][j] == n){
                A[i-1][j] = m;
                return calc(A,i-1,j);
            }
            else if(j-1>=0 && A[i][j-1]==n){
                A[i][j-1] = m;
                return calc(A,i,j-1);
            }
        
        return A;
    }
    
    static int find(int A[][], int p){
        int c=0;
        n=p;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(A[i][j]==n){
                    A=calc(A,i,j);
                    ++c;
                }
            } 
        }
        return c;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count[] = new int[t];
        for(int n= 0;n<t;n++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int c0=0, c1=0;
            int A[][] = new int[x][y];
            for(int i= 0;i<x;i++){
                for(int j= 0;j<y;j++){
                    A[i][j] = sc.nextInt();
                    if(A[i][j]==0)  ++c0;
                    else    ++c1;
                }
            count[n] = c0>c1?find(A,0):find(A,1);
            }
        }
        for(int i=0;i<t;i++)
            System.out.println(count[i]);
    }
}