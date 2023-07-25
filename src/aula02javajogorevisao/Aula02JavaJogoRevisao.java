package aula02javajogorevisao;

import javax.swing.JOptionPane;

public class Aula02JavaJogoRevisao {

	public static void main(String[] args) {
		//----Math.random=matemática aleatório sorteia um número-------------------
		//Criei uma variável
		int numero = (int) (Math.random()*11);
		//----------fim sorteio---------------------------------------------------
		
		//--------Diditei este comando para ver o número sonteado----------------
		System.out.println(numero);
		//--------fim------------------------------------------------------------
		
		
		
		int pergunta = 0;
		int tentativas=0, restando = 3;
		while(pergunta == 0) {
			tentativas = tentativas +1;
		//------criei uma variável com valor que será digitado no input----------
		int chute = Integer.parseInt( JOptionPane.showInputDialog(null,"Didite o número"));
		//--------fim-------------------------------------------------------------
		
		//-------digitei este comando para ver se o que digitei saiu no console----
		System.out.println(chute);
		//------------------fim-----------------------------------------------------
		
		//--------condições para exibir as mensagens caso erre ou acerte----------
		if(numero == chute) {
			JOptionPane.showMessageDialog(null,"Parabéns você Acertou em : " + tentativas + " tentativas");
			pergunta = JOptionPane.showConfirmDialog(null,"Quer jogar de novo?");
			tentativas = tentativas -1;
		}else {
			JOptionPane.showMessageDialog(null, "Errrroooouuuuuu, feio \n " + "Número de Tentativa: " + tentativas);
			pergunta = JOptionPane.showConfirmDialog(null,"Quer continuar?");
			//yes=0  não=1  cancela=2
			
			restando = restando - 1;
			if(restando == 0) {
				pergunta = 1;
				JOptionPane.showMessageDialog(null,"Acabaram suas tentativas");
				
			}
			System.out.println(pergunta);
		}
		}
		//----------------fim-------------------------------------------------------
	}

}
