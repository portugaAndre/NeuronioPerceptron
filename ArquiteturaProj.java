/*
 Essa é apenas o .java, por sí só não é possível ter muito, só copie e cole o código onde deseja rodar.
 */
package arquiteturaproj;

/**
 *
 * @author andre e Geovanna
 */
public class ArquiteturaProj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float w1 = (float) 0.0, w2 = (float) 0.8, erro, saidaEsperada, somatorioPesos = 0, epocas = 0;
        float taxaDeAprendizado = (float) 0.05;

        float vetI[] = {2, 4, 6, 8, 10};
        float vetJ[] = {2, 4, 6, 8, 10};
        // multiplicar o primeiro valor, pelo peso 1, e o segundo valor pelo peso 2 e somar os 2
        // definimos que teria duas epocas apenas uma etapa
        for (int j = 0; j < 6; j++) {
        for (int i = 0; i < vetI.length; i++) {
            somatorioPesos = (w1 * vetI[i]) + (w2 * vetJ[i]); // formula de somatroio
            saidaEsperada = (vetI[i] + vetJ[i]);
            erro = saidaEsperada - somatorioPesos;
            w1 = w1 + erro * taxaDeAprendizado * vetI[i]; // formula de aprendizado do peso1
            w2 = w2 + erro * taxaDeAprendizado * vetJ[i];// formula de aprendizado do peso1
        }
        epocas++;
        }
        for (int i = 0; i < vetI.length; i++) {
            System.out.println("Resultado esperado: " + (vetI[i] + vetJ[i]) + "\t| Resultado Obtido: " + ((w1 * vetI[i]) + (w2 * vetJ[i])));
        }

    }

}
