package com.gilbertomorales.perceptron;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        System.out.println("Exemplo de RNA Perceptron para classificação de equipes");

        List<Ponto> amostras = new ArrayList<>();
        List<Integer> saidas = new ArrayList<>();

        // Caminho para o arquivo CSV
        String caminhoCSV = "D:\\amostras_saidas_problemaTimes.csv";

        // Leitura do arquivo CSV
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoCSV))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.trim().split(";");
                if (partes.length != 3) continue;

                double x = Double.parseDouble(partes[0]);
                double y = Double.parseDouble(partes[1]);
                int saida = Integer.parseInt(partes[2]);

                amostras.add(new Ponto(x, y));
                saidas.add(saida);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            return;
        }

        double taxa_aprendizado = 0.1;
        int geracoes = 1000;
        int limiar = 1;

        Perceptron p = new Perceptron(amostras, saidas, taxa_aprendizado, geracoes, limiar);
        p.treinar();

        System.out.println("\n--- Classificação das amostras ---");
        for (Ponto ponto : amostras) {
            System.out.printf("Ponto (x=%.2f, y=%.2f): ", ponto.x, ponto.y);
            p.testar(ponto);
        }
    }
}
