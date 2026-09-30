package atividades.Exceptionsss;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    try{
      System.out.print("Forneca o primeiro numero: ");
      int n1 = sc.nextInt();

      System.out.print("Forneca o segundo numero: ");
      int n2 = sc.nextInt();

      System.out.print("Forneca o operador (+, -, *, / ): ");
      char operador = sc.nextInt();      
      
    }catch (ArithmethicException e) {
        System.out.println("Nao e possivel dividir por zero ");
    }catch(InputMismatchException e){
        System.out.println("Forneca uma entrada valida: "); 
    }catch(){
      
    }finally{
      sc.close();
      System.out.println("Fim do programa! "); 
    }
  }
}
