/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clinicaodonto;

/**
 *
 * @author flaviorgs
 */
public class ClinicaOdonto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Valores[] v = new Valores[1];
        v[0] = new Valores();
        
        
        Pessoa[] p = new Pessoa[3];
        p[0] = new Pessoa("Ana", "F", "Rua da Flores", "999999", 12, 12, 2000 );
        
        Paciente[] pac = new Paciente[3];
        pac[0] = new Paciente(p[0]);
        
        //pac[0].planoTratamento();
        
        float orcamento = pac[0].planoTratamento(v[0].getValor_exame(), v[0].getValor_face());
        System.out.println("Orçamento: " + orcamento);
        
        
    }
    
}
