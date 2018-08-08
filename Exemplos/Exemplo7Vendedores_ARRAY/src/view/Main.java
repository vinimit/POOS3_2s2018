package view;

import model.Loja;
import model.Vendedor;

import javax.swing.*;

public class Main {

    public static Vendedor lerVendedor(){
        String nome;
        double valor;
        Vendedor v;

        nome = JOptionPane.showInputDialog("Nome do vendedor: ");
        v = new Vendedor(nome);

        for(int mes=0; mes<12; mes++){
            valor = Double.parseDouble(JOptionPane.showInputDialog("Vendas do mês " + (mes+1)));
            v.setVendasMes(valor, mes);
        }
        return v;
    }

    public static void main(String[] args) {

        Loja loja = new Loja("Loja do Café");

        loja.insereVendedor(lerVendedor());
        loja.insereVendedor(lerVendedor());
        loja.insereVendedor(lerVendedor());
        loja.insereVendedor(lerVendedor());

        JOptionPane.showMessageDialog(null, "Melhor vendedor: " + loja.getMelhorVendedor().getNome());
    }
}