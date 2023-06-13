public class Permutation {
    static void perm (String str, String result){
        if(str.length()==0){
            System.out.println(result);
            return;
        }
        perm(str.substring(1), result+str.charAt(0));
        perm(str.substring(1), str.charAt(0)+result);
    }
    public static void main(String[] args) {
        perm("abc","");
    }
}

    