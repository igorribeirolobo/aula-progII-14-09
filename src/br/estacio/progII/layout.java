package br.estacio.progII;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

public class layout extends JFrame {
	private JPanel pnlTopo;
	private JPanel pnlCenter;
	private LayoutManager grid;
	private JTextField visor;
	private JButton[] btnValor = new JButton[10];
	private JButton btnSoma;
	private JButton btnSubtrai;
	private JButton btnDivisao;
	private JButton btnMultiplicar;
	private JButton btnResultado;
	private JButton btnPonto;
	
	public void Janela()
	{
		configurarLayout();
		instanciarComponentes();
		montarLayout();
	}
	private void instanciarComponentes()
	{
		    pnlTopo  = new JPanel(new FlowLayout());
		    pnlTopo.setBackground(Color.GRAY);
		    pnlCenter = new JPanel(new FlowLayout());
		    pnlCenter.setBackground(Color.WHITE);
		    visor = new JTextField("0",25);
		    for(int i = 0; i < btnValor.length;i++)
		    {
		    	btnValor[i] = new JButton(Integer.toString(i));
 		    }
		    btnSoma = new JButton("+");
		    btnSubtrai = new JButton("-");
		    btnDivisao = new JButton("/");
		    btnMultiplicar = new JButton("*");
		    btnResultado = new JButton("=");
		    btnPonto = new JButton(".");

		    
	}
	private void montarLayout()
	{   grid = new GridLayout(4,4,5,5);
		pnlTopo.add(visor);
		pnlCenter.setLayout(grid);
	    pnlCenter.add(btnValor[7]);
	    pnlCenter.add(btnValor[8]);
	    pnlCenter.add(btnValor[9]);
	    pnlCenter.add(btnDivisao);
	    pnlCenter.add(btnValor[4]);
	    pnlCenter.add(btnValor[5]);
	    pnlCenter.add(btnValor[6]);
	    pnlCenter.add(btnMultiplicar);
	    pnlCenter.add(btnValor[1]);
	    pnlCenter.add(btnValor[2]);
	    pnlCenter.add(btnValor[3]);
	    pnlCenter.add(btnSubtrai);
	    pnlCenter.add(btnValor[0]);
	    pnlCenter.add(btnPonto);
	    pnlCenter.add(btnResultado);
	    pnlCenter.add(btnSoma);
		
	    this.add(pnlTopo, BorderLayout.PAGE_START);
	    this.add(pnlCenter, BorderLayout.CENTER);
	}
	private void configurarLayout()
	{  
		
		this.setSize(320, 360);
	    this.setLocationRelativeTo(null);
	    this.setResizable(true);    
	    this.setTitle("Calculadora");
	}

}
