package ex1;

import java.util.*;

public class MapProgram {
    public static void main(String[] args) {
        //K -> Palavra; V -> Contagem
        Map<String, Integer> map = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        //1.
        System.out.print("Texto: ");
        String texto = sc.nextLine();

        //2.
        texto = texto.toLowerCase();
        texto = texto.replaceAll(",", "");
        texto = texto.replaceAll("!", "");
        texto = texto.replaceAll("\\.", "");
        String[] palavras = texto.split(" ");

        //System.out.println(Arrays.toString(palavras));

        for(String p : palavras) {
            if(!map.containsKey(p)) {
                map.put(p, 1);
            } else {
                int c = map.get(p);
                c++;
                map.put(p, c);
            }
        }

        // Construtor já recebe uma coleção e "copia"
        // automaticamente os elementos para a nova coleção.
        // Escusamos copiar manualmente (código comentado)
        List<String> sorted = new ArrayList<>(map.keySet());
        /*for(String p : map.keySet()) {
            sorted.add(p);
        }*/
        Collections.sort(sorted);

        // Modificação para listagem ordenada das palavras
        for(String p : sorted /*map.keySet()*/) {
            int contagem = map.get(p);

            System.out.printf("%-20s | %d | %.2f%%\n",
                    p, contagem, (contagem/(double)palavras.length)*100);
        }

        sc.close(); 
    }
}
