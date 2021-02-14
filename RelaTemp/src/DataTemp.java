import java.util.Scanner;

public class DataTemp {

	public static void main(String[] args) {

		int mes;
		int ano;
		double sum =0;
		double avarege =0;
		
	
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o mes: \n");
		mes = ler.nextInt();
		System.out.print("Digite o ano: \n");
		ano = ler.nextInt();
	
		
		if(mes >= 1 && mes <= 12){
			if(ano >= 2011 && ano <= 2020){
			//mês é válido
			if(mes==1 || mes==3 ||mes==5 || mes==7 ||mes==8 || mes==10 || mes==12 ) {
				double[] temperatures = new double[31];
				for (int i = 0; i < 31; i++) {
					System.out.print("Temperatura no dia:" + (i + 1));
					temperatures[i] = ler.nextDouble();
					
				}
				double smallest = temperatures [0];
				double largest = temperatures  [0];
				
				for(int i=0; i< temperatures.length; i++) {
					sum += temperatures[i];
					avarege =  sum /31;
				}
				
				for(int i=0; i<temperatures.length; i++) {
				if(temperatures[i] < smallest){
					smallest = temperatures[i];
				}
				}
				for(int i=0; i< temperatures.length; i++) {
				if( temperatures[i] == smallest) {
				    System.out.println("Dias de temperatura mínima: " + (i+1));
				}	
				}
				
				for(int i=0; i<temperatures.length; i++) {
					if(temperatures[i] > largest){
						largest = temperatures[i];
					}
					}
				
				for(int i=0; i< temperatures.length; i++) {
					if( temperatures[i] == largest) {
					    System.out.println("Dias de temperatura máxima: " + (i+1));
					}	
					}
				
					
				
				
				System.out.println("Temperatura mínima do mês é :" + smallest);
				System.out.println("Temperatura máxima do mês é :" + largest);
				System.out.println("Temperatura média do mês é :" + avarege);
				
				
				}else if (mes==4 || mes==6 ||mes==9 || mes==11 ) {
					double[] temperatures = new double[30];
					for (int i = 0; i < 30; i++) { 
						System.out.print("Temperatura no dia:" + (i + 1));
						temperatures[i] = ler.nextDouble();
				}
					double smallest = temperatures [0];
					double largest = temperatures  [0];
					
					for(int i=0; i< temperatures.length; i++) {
						sum += temperatures[i];
						avarege =  sum /30;
					}
					
					for(int i=0; i<temperatures.length; i++) {
					if(temperatures[i] < smallest){
						smallest = temperatures[i];
					}
					}
					for(int i=0; i< temperatures.length; i++) {
					if( temperatures[i] == smallest) {
					    System.out.println("Dias de temperatura mínima: " + (i+1));
					}	
					}
					
					for(int i=0; i<temperatures.length; i++) {
						if(temperatures[i] > largest){
							largest = temperatures[i];
						}
						}
					
					for(int i=0; i< temperatures.length; i++) {
						if( temperatures[i] == largest) {
						    System.out.println("Dias de temperatura máxima: " + (i+1));
						}	
						}
					
						
					
					
					System.out.println("Temperatura mínima do mês é :" + smallest);
					System.out.println("Temperatura máxima do mês é :" + largest);
					System.out.println("Temperatura média do mês é :" + avarege);
					
					
				
				
			}else if (mes == 2 ) {
				if (ano >=1 && ano<= 2021) {
					if ( ano % 4 == 0) {
						double[] temperatures = new double[29];
						for (int i = 0; i < 29; i++) { 
						System.out.print("Temperatura no dia:" + (i + 1));
						temperatures[i] = ler.nextDouble();
						
						
						}
						double smallest = temperatures [0];
						double largest = temperatures  [0];
						
						for(int i=0; i< temperatures.length; i++) {
							sum += temperatures[i];
							avarege =  sum /29;
						}
						
						for(int i=0; i<temperatures.length; i++) {
						if(temperatures[i] < smallest){
							smallest = temperatures[i];
						}
						}
						for(int i=0; i< temperatures.length; i++) {
						if( temperatures[i] == smallest) {
						    System.out.println("Dias de temperatura mínima: " + (i+1));
						}	
						}
						
						for(int i=0; i<temperatures.length; i++) {
							if(temperatures[i] > largest){
								largest = temperatures[i];
							}
							}
						
						for(int i=0; i< temperatures.length; i++) {
							if( temperatures[i] == largest) {
							    System.out.println("Dias de temperatura máxima: " + (i+1));
							}	
							}
						
							
						
						
						System.out.println("Temperatura mínima do mês é :" + smallest);
						System.out.println("Temperatura máxima do mês é :" + largest);
						System.out.println("Temperatura média do mês é :" + avarege);
						}else {
							double[] temperatures = new double[28];
							for (int i = 0; i < 28; i++) { 
							System.out.print("Temperatura no dia:" + (i + 1));
							temperatures[i] = ler.nextDouble();
							
							}
							double smallest = temperatures [0];
							double largest = temperatures  [0];
							
							for(int i=0; i< temperatures.length; i++) {
								sum += temperatures[i];
								avarege =  sum /28;
							}
							
							for(int i=0; i<temperatures.length; i++) {
							if(temperatures[i] < smallest){
								smallest = temperatures[i];
							}
							}
							for(int i=0; i< temperatures.length; i++) {
							if( temperatures[i] == smallest) {
							    System.out.println("Dias de temperatura mínima: " + (i+1));
							}	
							}
							
							for(int i=0; i<temperatures.length; i++) {
								if(temperatures[i] > largest){
									largest = temperatures[i];
								}
								}
							
							for(int i=0; i< temperatures.length; i++) {
								if( temperatures[i] == largest) {
								    System.out.println("Dias de temperatura máxima: " + (i+1));
								}	
								}
							
								
							
							
							System.out.println("Temperatura mínima do mês é :" + smallest);
							System.out.println("Temperatura máxima do mês é :" + largest);
							System.out.println("Temperatura média do mês é :" + avarege);
						}
						
					
				}
			}
		}	
			
				else {
				System.out.print("Data Inválida ");
			}
		
		
}else {
	System.out.print("Data Inválida ");
}
		
		
}
}

