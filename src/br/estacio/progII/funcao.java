package br.estacio.progII;

public class funcao {
   private int resultado = 0;
   private int soma = 0;
	public void funcaoSomar(int a)
	{   
		this.soma +=  a;
		this.resultado = this.soma;
	}
	public int getResultado()
	{
		return this.resultado;
	}
}
