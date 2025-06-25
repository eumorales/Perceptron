
# 👋 Apresentação:

> **Dupla:** Matheus Nogueira e Gilberto Morales

# 🚀 O software

> Este software que desenvolvemos é uma implementação em Java de um Perceptron, uma das formas mais fundamentais e didáticas de uma Rede Neural Artificial (RNA). Nosso objetivo principal é demonstrar como um modelo de aprendizado de máquina pode ser treinado para classificar dados em duas categorias distintas, com base em um conjunto de amostras.

# 🎯 Objetivo 

> O código foi convertido de C# para Java, adicionamos a funcionalidade de leitura de amostras via arquivo.csv, agora os dados não precisam ser mais inseridoss manualmente. <br>

> ***No geral o software foi projetado para:*** <br> 
>
> **1- Receber amostras de treinamento via arquivo CSV:** Diferente de implementações anteriores onde os dados eram inseridos manualmente, agora o sistema lê as coordenadas (x, y) e a classificação correta (-1 ou 1) de cada amostra diretamente de um arquivo .csv. <br>
>
> **2- Aprender a classificar:** O Perceptron é treinado utilizando essas amostras para ajustar seus pesos internos. O objetivo do treinamento é que ele consiga identificar a "fronteira de decisão" entre os dois times. <br>
>
> **3- Classificar novas amostras:** Após o treinamento, o software será capaz de receber novos pontos (coordenadas x, y) e determinar, com base no que aprendeu, a qual time (Azul ou Vermelho) essa nova amostra pertence. <br>

---

# 📊 Gráfico dos times

![image](https://github.com/user-attachments/assets/760f578f-2381-4b29-a384-4e5abee6d245)



# 📁 Amostras de Treinamento: - amostras_saidas_problemaTimes.csv

```
0.72;0.82;-1
0.91;-0.69;-1
0.46;0.80;-1
0.03;0.93;-1
0.12;0.25;-1
0.96;0.47;-1
0.8;-0.75;-1
0.46;0.98;-1
0.66;0.24;-1
0.72;-0.15;-1
0.35;0.01;-1
-0.16;0.84;-1
-0.04;0.68;-1
-0.11;0.1;1
0.31;-0.96;1
0.0;-0.26;1
-0.43;-0.65;1
0.57;-0.97;1
-0.47;-0.03;1
-0.72;-0.64;1
-0.57;0.15;1
-0.25;-0.43;1
0.47;-0.88;1
-0.12;-0.9;1
-0.58;0.62;1
-0.48;0.05;1
-0.79;-0.92;1
-0.42;-0.09;1
-0.76;0.65;1
-0.77;-0.76;1


```

# 💻 Resultados com base nas amostras do arquivo:

![image](https://github.com/user-attachments/assets/94e68015-b8c7-4bab-b6f7-84e1231b3073)
