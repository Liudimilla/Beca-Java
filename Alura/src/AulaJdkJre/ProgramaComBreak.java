package AulaJdkJre;

public class ProgramaComBreak {
	public static void main(String args[]) {
        for(int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                //if ( coluna > linha ; coluna+1 ) {
                    break;
                }
               // System.out.print( coluna > linha e coluna+1 );
            }
            System.out.println();
        }
    }

