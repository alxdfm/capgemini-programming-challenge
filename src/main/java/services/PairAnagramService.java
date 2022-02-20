package services;

public class PairAnagramService {

    public PairAnagramService() {
    }

    public int anagram(String anagram){
        int anagramQty = 0;

        for(int i = 0; i<anagram.length(); i++){
            for(int j = i; j<anagram.length() ; j++){
                boolean compareCharEquals = anagram.charAt(i) == anagram.charAt(j);

                if(compareCharEquals && j == i+1){ //if the for loop find a char followed by other equal char, count 1
                    anagramQty += 1;
                }

                else if(compareCharEquals && j > i+1){ //if the for loop find a equal char, but it is not followed in sequence, count 2
                    anagramQty += 2;
                    j = anagram.length();
                }
            }
        }
        return anagramQty;
    }
}
