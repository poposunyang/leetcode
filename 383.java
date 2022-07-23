package leetCode;

public class Solution {

	public static boolean canConstruct(String ransomNote, String magazine) {
        boolean ret = false;
        for(int i = 0; i < ransomNote.length(); i++){
            ret = false;
            String find = ransomNote.substring(i,i+1);
            for(int j = 0; j < magazine.length(); j++){
                String target = magazine.substring(j,j+1);
                if(find.equals(target)){
                	magazine = magazine.replaceFirst(target,"");
                    ret = true;
                    break;
                }
            }
            if(ret == false) {
            	break;
            }
        }
        return ret;
    }
	
	public static boolean canConstructHash(String ransomNote, String magazine) {
        int[] arr = new int[26];
        int temp;
        for (int i = 0; i < magazine.length(); i++) {
        	// recode数据记录 magazine里各个字符出现次数
            temp = magazine.charAt(i) - 'a';
            arr[temp]++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            temp = ransomNote.charAt(i) - 'a';
            if (arr[temp] > 0) {
            	// ransomNote，在record里对应的字符个数做--操作
                arr[temp]--;
            } else {
                //ransomNote里出现的字符，magazine没有
                return false;
            }
        }
        return true;
    }
	
	public static void main(String[] args) {
		System.out.println(canConstruct("fihjjjjei"
				,"hjibagacbhadfaefdjaeaebgi"));
		System.out.println(canConstructHash("fihjjjjei"
				,"hjibagacbhadfaefdjaeaebgi"));
	}

}
