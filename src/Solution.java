import java.lang.StringBuilder;
public class Solution{

    static String toCamelCase(String s){

        //var
        String camelCaseString;
        StringBuilder sb = new StringBuilder();

        //alg
        String[] wordList = s.split("[-_]");
        for(int i = 0; i < wordList.length; i++){
            if(i==0){
                sb.append(wordList[0]);
            }
            if(i>=1){
                if(Character.isUpperCase(wordList[i].charAt(0))){
                    sb.append(wordList[i]);
                }
                if(Character.isLowerCase(wordList[i].charAt(0))){
                    String tempString = wordList[i].substring(0,1).toUpperCase()
                            + wordList[i].substring(1);
                    sb.append(tempString);
                }

            }
        }

        camelCaseString=sb.toString();

        return camelCaseString;
    }
}