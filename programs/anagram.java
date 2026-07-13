class M {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cab";
        int [] fq1 = new int[26];
        int [] fq2 = new int[26];

        for(int i = 0; i < str1.length(); i++) {
            fq1[str1.charAt(i)-97];
        }
        for(int i = 0; i < str2.length(); i++) {
            fq2[str2.charAt(i)-97];
        }
        
        System.out.println("Frequency of str1: ");
        for(int i = 0; i < 26; i++) {
            System.out.print(fq1[i] + " ");
        }
        System.out.println();
        System.out.println("Frequency of str2: ");
        

    }
}