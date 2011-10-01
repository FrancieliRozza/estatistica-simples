import java.lang.reflect.Array;


public class EstatisticasSimples {

	public static double calculaValorMinimo(double[] valoresDeEntrada) {
		double valorMinimo = valoresDeEntrada[0];
		for(int i = 0; i < valoresDeEntrada.length; i++){
			if(valorMinimo > valoresDeEntrada[i]){
				valorMinimo = valoresDeEntrada[i];
			}
		}
		return valorMinimo;
	}
		
	
	public static double calculaValorMaximo(double[] valoresDeEntrada) {
		double valorMaximo = valoresDeEntrada[0];
		for (int i = 0; i < valoresDeEntrada.length; i++){
			if(valorMaximo < valoresDeEntrada[i]) {
				valorMaximo = valoresDeEntrada[i];
			}
		}
		return valorMaximo;
	}
	
	public static int calculaQuantidade(double[] valoresDeEntrada) {
		
		int quantidade = valoresDeEntrada.length;
		
		return quantidade;
	}

	public static double calculaMedia(double[] valoresDeEntrada) {
		
		double a = valoresDeEntrada[0];
		double b = valoresDeEntrada[1];
		
		double media = (a + b)/2;
		
		return media;
	}

	public static double[] calcula(double[] valoresDeEntrada) {
				
		double Array[]= new double[4];
		
		double a = calculaValorMinimo(valoresDeEntrada);
		double b = calculaValorMaximo(valoresDeEntrada);
		int quantidade = calculaQuantidade(valoresDeEntrada);
		double media = calculaMedia(valoresDeEntrada);
		
		Array[0] = a;
		Array[1] = b;
		Array[2] = quantidade;
		Array[3] = media;
		
		return Array;
	}

}
