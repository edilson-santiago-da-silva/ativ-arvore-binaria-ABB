package br.com.ativdesc;

class ArvoreBinaria {
    private BIntNo raiz;

    private class BIntNo {
        double valor;
        BIntNo esq, dir;

        BIntNo(double valor) {
            this.valor = valor;
            esq = dir = null;
        }
    }

    public void inserirNo(double novoValor) {
        raiz = inserir(raiz, novoValor);
    }

        private BIntNo inserir(BIntNo no, double novoValor) {
        if (no == null) {
            return new BIntNo(novoValor);
        }
        if (novoValor < no.valor) {
            no.esq = inserir(no.esq, novoValor);
        } else if (novoValor > no.valor) {
            no.dir = inserir(no.dir, novoValor);
        }
        return no;
    }

    public void exibirRaiz() {
        if (raiz != null) {
            System.out.println("Raiz: " + raiz.valor);
        } else {
            System.out.println("A árvore está vazia.");
        }
    }

    public void exibirNo() {
        exibirRaiz();
        exibirEmOrdem(raiz);
    }

    private void exibirEmOrdem(BIntNo no) {
        if (no != null) {
            exibirEmOrdem(no.esq);
            System.out.print(no.valor + " ");
            exibirEmOrdem(no.dir);
        }
    }
}
