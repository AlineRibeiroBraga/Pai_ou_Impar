import javax.swing.*;
import java.awt.*;

public class Principal {

    public static void main(String[] args) {
        int opcaoJogo = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Menu: \n1. PARA - Jogar contra outro player" +
                        "\n 2.Jogar contra máquina."));

        if(opcaoJogo == 1){
            jogarDuasPessoas();
        }
        else{
            jogarMaquina();
        }


    }

    private static void jogarDuasPessoas(){
        String jogador1, jogador2;

        jogador1 = JOptionPane.showInputDialog(null, "Informe o nome do 1º Jogador: ");
        jogador2 = JOptionPane.showInputDialog(null, "Informe o nome do 2º Jogador: ");
        int continuar;
        int opcaoJogador1,opcaoJogador2;
        int numJog1, numJog2;
        int somaNumeros;
        int placar1=0, placar2=0;

        do{
            opcaoJogador1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Menu: \n1. Par" +
                            "\n 2.Ímpar"));
            if(opcaoJogador1==1){
                opcaoJogador2=2;
            }
            else{
                opcaoJogador2=1;
            }
            numJog1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Jogador 1 informa o numero."));

            numJog2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Jogador 2 informa o numero."));

            somaNumeros=calcNum(numJog1, numJog2);

            if(validarParImpar(somaNumeros)){
                if(opcaoJogador1 == 1){
                    placar1++;
                    JOptionPane.showMessageDialog(null, "Jogador 1 venceu!");
                }else {
                    placar2++;
                    JOptionPane.showMessageDialog(null, "Jogador 2 venceu!");
                }
            } else{
                if(opcaoJogador1==2){
                    placar1++;
                    JOptionPane.showMessageDialog(null, "Jogador 1 venceu!");
                }else{
                    placar2++;
                    JOptionPane.showMessageDialog(null, "Jogador 2 venceu!");
                }
            }

            continuar = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite 1 para continuar ou qualquer outro num para sair."));


        }while(continuar == 1);

        JOptionPane.showMessageDialog(null,
                jogador1+ " Score :"+ placar1+"\n"+"Nome do jogador 2: "+jogador2+ " Score: "+placar2);
    }

    private static boolean validarParImpar(int somaNumeros){

        return (somaNumeros%2 ==0);
    }

    private static int calcNum(int numJ1, int numJ2){
        return numJ1+numJ2;
    }
    private static void jogarMaquina(){

    }

}
