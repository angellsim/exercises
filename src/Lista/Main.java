package Lista;

import javax.swing.JOptionPane;

class No {
    float nota;
    No proximo;

    public No(float nota) {
        this.nota = nota;
        this.proximo = null;
    }
}

class ListaEncadeada {
    private No inicio;

    public void adicionar(float nota) {
        No novoNo = new No(nota);

        if (inicio == null) {
            inicio = novoNo;
        } else {
            No atual = inicio;

            while (atual.proximo != null) {
                atual = atual.proximo;
            }

            atual.proximo = novoNo;
        }
    }

    public float calcularMedia() {
        float soma = 0;
        int quantidade = 0;

        No atual = inicio;

        while (atual != null) {
            soma += atual.nota;
            quantidade++;
            atual = atual.proximo;
        }

        if (quantidade == 0) {
            return 0;
        }

        return soma / quantidade;
    }

    public String listarNotas() {
        String resultado = "As notas obtidas foram:\n";

        No atual = inicio;

        while (atual != null) {
            resultado += atual.nota + "\n";
            atual = atual.proximo;
        }

        return resultado;
    }
}

public class Main {

    public static void main(String[] args) {

        ListaEncadeada notas = new ListaEncadeada();

        while (true) {

            String entrada = JOptionPane.showInputDialog(
                    "Informe uma nota ou digite FIM para encerrar:");

            if (entrada == null || entrada.equalsIgnoreCase("FIM")) {
                break;
            }

            float nota = Float.parseFloat(entrada);
            notas.adicionar(nota);
        }

        String resposta = notas.listarNotas();
        resposta += "\nA média do aluno é: "
                + String.format("%.2f", notas.calcularMedia());

        JOptionPane.showMessageDialog(null, resposta);
    }
}