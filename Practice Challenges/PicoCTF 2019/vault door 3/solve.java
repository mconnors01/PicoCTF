public class solve {
    
    public static void main(String[] args) {
        String pwend = "jU5t_a_sna_3lpm18g947_u_4_m9r54f";

        char[] password = new char [32];

        for (int i=31; i>=17; i-=2) {
            password[i] = pwend.charAt(i);
        }

        for (int i=16; i<32; i+=2) {
            password[i] = pwend.charAt(46-i);
        }

        for (int i=8; i<16; i++) {
            password[i] = pwend.charAt(23-i);
        }

        for (int i=0; i<8; i++) {
            password[i] = pwend.charAt(i);
        }

        //String pwoutput = (new String(pwend));

        System.out.println(password);
        
    }
}
