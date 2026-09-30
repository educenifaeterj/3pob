/* O programa deverá tratar pelo menos:
entrada inválida;
divisão por zero;
operação inexistente.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Forneca o primeiro numero: ");
			int n1 = sc.nextInt();

			System.out.print("Forneca o segundo numero: ");
			int n2 = sc.nextInt();

			System.out.print("Forneca o operador (+, -, *, / ): ");
			char operador = sc.next().charAt(0);

			if(operador == '/') {
				int resultado = n1/n2;
			} else if(operador == '*') {
				int resultado = n1*n2;
			}
			else if(operador == '+') {
				int resultado = n1+n2;
			}
			else if(operador == '-') {
				int resultado = n1-n2;
			}else{
			    throw new IllegalArgumentException("Operador invalido. ");
			}

		} catch (ArithmeticException e) {
			System.out.println("Nao e possivel dividir por zero ");
		} catch(InputMismatchException e) {
			System.out.println("Forneca uma entrada valida: ");
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
			
			} finally {
				sc.close();
				System.out.println("Fim do programa! ");
			}
		}
	}
