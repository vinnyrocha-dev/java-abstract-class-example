package br.com.vini.mod13.Abstratas;

public class Programa {
    public static void main(String[] args) {
        Assalariado assalariado = new Assalariado();
        assalariado.setNome("Vinicius");
        assalariado.setSobrenome("Pacheco");
        assalariado.setCpf("1");
        assalariado.setSalario(5000d);
        System.out.println("O Funcionário " + assalariado.getNome()  + "\n"
                + "Portador do CPF: " + assalariado.getCpf() + "\n"
                + "Recebe por mês: " + assalariado.vencimento());

        System.out.println();

        Comissionado comissionado = new Comissionado();
        comissionado.setNome("Vinicius");
        comissionado.setSobrenome("Pacheco");
        comissionado.setCpf("2");
        comissionado.setTotalVenda(1000d);
        comissionado.setTaxaComissao(03.5d);
        System.out.println("O Comissionado " + comissionado.getNome()  + "\n" + "Portador do CPF: "
                + comissionado.getCpf() + "\n"
                + "Teve uma comissão de: " + comissionado.vencimento());

        System.out.println();

        Horista horista = new Horista();
        horista.setNome("Vinicius");
        horista.setSobrenome("Pacheco");
        horista.setCpf("3");
        horista.setHorasTrabalhadas(45d);
        horista.setPrecoHora(8d);
        System.out.println("O horista " + horista.getNome()  + "\n" + "Portador do CPF: "
                + horista.getCpf() + "\n"
                + "Recebeu um total de horas trabalhadas: " + horista.vencimento());


    }
}
