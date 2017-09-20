package br.estacio.progII;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

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
	funcao calculo = new funcao();
	public void Janela()
	{
		configurarLayout();
		instanciarComponentes();
		definirEventos();
		montarLayout();
	}
	private void definirEventos() {

		for(int i = 0; i < 10; i++)
		{ int j = i;
		btnValor[i].addActionListener(new ActionListener() {
			
        
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				String valor = visor.getText();
				pnlTopo.removeAll();
				visor = new JTextField(valor + Integer.toString(j),25);
				 pnlTopo.add(visor);  
				}
				finally {
					pnlTopo.revalidate();
				}
			}
		});
		}
		
		 btnSoma.addActionListener(new ActionListener() {
			 
		      @Override
		      public void actionPerformed(ActionEvent e) {        
		        
		        try {     
                  calculo.funcaoSomar(Integer.parseInt(visor.getText()));
                  
		          pnlTopo.removeAll();
		          visor = new JTextField("",25);
		          pnlTopo.add(visor);        
		        }
		        finally {
		          
		          pnlTopo.revalidate();
		        }        
		      }
		    });
		 btnResultado.addActionListener(new ActionListener() {
			
			 @Override
			 public void actionPerformed(ActionEvent e)
			 {
				 try {
					 pnlTopo.removeAll();
					 visor = new JTextField(Integer.toString(calculo.getResultado()),25);
					 pnlTopo.add(visor);
				 }
				 finally {
					 pnlTopo.revalidate();
				 }
			 }
		 });
		  }	
		
		
	
	private void instanciarComponentes()
	{
		    pnlTopo  = new JPanel(new FlowLayout());
		    pnlTopo.setBackground(Color.GRAY);
		    pnlCenter = new JPanel(new FlowLayout());
		    pnlCenter.setBackground(Color.WHITE);
		    visor = new JTextField("",25);
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
