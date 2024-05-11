/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicaodonto;

import java.util.Scanner;

/**
 *
 * @author flaviorgs
 */
public class Paciente {
    
    private Pessoa paciente;
    private Dente dente;
    private float orcamento;

    public Paciente(Pessoa paciente) {
        this.paciente = paciente;
        this.dente = (this.getDente());
        this.orcamento = 0;
    }

    public Pessoa getPaciente() {
        return paciente;
    }

    public void setPaciente(Pessoa paciente) {
        this.paciente = paciente;
    }

    public Dente getDente() {
        return dente;
    }

    public void setDente(Dente dente) {
        this.dente = dente;
    }

    public float getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(float orcamento) {
        this.orcamento = orcamento;
    }
    
  
    public float planoTratamento(float valor_exame, float valor_face){

        Dente d[] = new Dente[32];
        int contador_para_impressao = 0;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Plano de tratamento de " + this.getPaciente().getNome());
        System.out.println("Foi detectada alguma cárie no exame clínico de "+ this.getPaciente().getNome()+"? (s/n)");
        String carie_detectada = teclado.nextLine();
        if (carie_detectada.equalsIgnoreCase("n")){
            this.setOrcamento(valor_exame);
        } else {
            
            char condicao_while;
            boolean continua = true;
            int i = 0;
            int N_dente = 0;
            int N_faces = 0;
            
            float orcamento_final = 0;
            do{
                System.out.println("Digite o número do dente: ");
                N_dente = teclado.nextInt();
                d[i] = new Dente(N_dente, true);
                this.setDente(d[i]);
                contador_para_impressao++;
                System.out.println("Digite o número de faces: ");
                N_faces = teclado.nextInt();
                orcamento_final += (valor_face * N_faces);
                i++;
                System.out.println("Deseja adicionar mais dentes ao plano de tratamento? (s/n)");
                condicao_while = teclado.next().charAt(0); 
                
                if (condicao_while == 'n' || condicao_while == 'N'){
                    continua = false;
                }
            }while (continua);
            this.setOrcamento(orcamento_final+valor_exame); 
           
            
        }
        
        if (this.getOrcamento() == valor_exame){
                System.out.println("Paciente " + this.getPaciente().getNome() + " não apresentou cáries ao "
                    + "exame clínico.");
            } else {
                System.out.println("Paciente "+ this.getPaciente().getNome()+ " apresentou cáries ao "
                    + "exame clínico nos dentes:");
                for (int i=0; i<contador_para_impressao; i++){
                    System.out.print(d[i].getNum_dente());
                    if (i < contador_para_impressao-1){
                        System.out.print(", ");
                    }
                }System.out.println("");
                
                
            }
        
        return this.getOrcamento();
        
        
        
    } 
    

        public void imprimir() {
            
            Valores[] v = new Valores[1];
            v[0] = new Valores();
            
            

            
    
       
    }
    
    
}
