public class BeerSong{
	public static void main(String[] args){
	    int beerCount = 99;
	    String word = "bottles of beers";
	    String phrase;
	    while(beerCount > 0){
	    	if(beerCount == 1){
                word = "bottle of beer"; 
	    	} 
	    	phrase = beerCount + " " + word;
	        System.out.println(phrase + " on the wall");
	        System.out.println(phrase);
	        
	        beerCount = beerCount -1;

			System.out.println("Take one down and pass it around");
            if(beerCount > 0){
            	if(beerCount == 1){
                    word = "bottle of beer"; 
	    	    } 
                phrase = beerCount + " " + word;
            }   else if (beerCount == 0){
                phrase = "No more bottles of beers";
	    	} 
	        
            System.out.println(phrase + " on the wall\n");
	    }

        if(beerCount == 0){
            System.out.println("No more bottles of beer on the wall, no more bottles of beer");
            System.out.println("Go to the store and buy some more 99 bottles of beer on the wall");
        }
	}
}