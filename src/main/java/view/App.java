package view;

import javax.swing.JOptionPane;


import controller.ClienteJpaDAO;


import model.Alunos;

public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	//String nome;
    	int num;
    	num=1;
        String resp="S";
    	int i = 0;                                                                                 
        Alunos alunos = new Alunos(); 
           
        do{
        //alunos.setId_aluno(num);
        String nome = JOptionPane.showInputDialog("Nome:");
        alunos.setNome(nome);
        String end = JOptionPane.showInputDialog("Endereço:");
        alunos.setEndereco(end);
        num = num + 1;
        alunos.setId_aluno(num);
        
        ClienteJpaDAO.getInstance().merge(alunos);
        System.out.println("Salvo com sucesso");
        
        resp = JOptionPane.showInputDialog("Deseja cadastrar novamente? Sim = S   Não= N");
        if(resp.equals("S")) {
         i = 1;
        }else {
         i = 0;
        }
        }while(i == 1);
        
       
    }
}
