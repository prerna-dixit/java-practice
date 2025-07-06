public class rainwater {
 public static int trappedrainwater(int h[]) 
 { //calculate max left boundary
   //calculate max right boundary
   //compare n find minimum= water level
   //trapped water=(water level-height)*width of the bar
   
   //max left boundary
   int maxleft[]=new int[h.length];
   maxleft[0]=h[0];
   for (int i = 1; i <h.length; i++) 
   {maxleft[i]=Math.max(h[i],maxleft[i-1]);}
   //max right boundary
   int maxright[]=new int[h.length];
   maxright[h.length-1]=h[h.length-1];
   for (int i =h.length-2; i>=0; i--) 
   {maxright[i]=Math.max(h[i], maxright[i+1]);}
   //loop
   int trappedwater=0;
   for (int i = 0; i < h.length; i++) 
   { int waterlevel=Math.min(maxleft[i], maxright[i]);
    trappedwater+=waterlevel-h[i];       
   }

return trappedwater;


 }
 public static void main(String[] args) {
     int h[]={4,2,0,6,3,2,5};
     System.out.println(trappedrainwater(h));

 }    
}
