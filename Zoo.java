// Zoo Super Class

public class Zoo {
    private Exhibits[] zooExhibits;
    private int num;
    private int max;
    
    public void Zoo(int max) {
   	    for (int i = 0; i < max; i++) {
   		    zooExhibits[i] = null;
   	    }
   	    this.max = max;
    }
    
    public void addExhibit(Exhibit e) {
        if (max > num) {
   	        zooExhibits[num] = e;
   	        num++;
        }
   	    else {
   		    throw new IllegalArgumentException("Max Exhibits Reached");
   	    }
    }
    
    public Exhibits[] getExhibits() {
   	 return zooExhibits;
    }
}


