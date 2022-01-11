package lessons.io;

import models.Cliente;
import models.ContaCorrente;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacaoComHeranca {
    public static void main(String[] args) throws IOException {

        Cliente cliente = new Cliente();
        cliente.setNome("Jordan Rivers");
        cliente.setCpf("000.000.000-01");
        cliente.setProfissao("Fisher");

        ContaCorrente contaCorrente = new ContaCorrente(0, 1);
        contaCorrente.setTitular(cliente);
        contaCorrente.depositar(222.3);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        objectOutputStream.writeObject(contaCorrente);
        objectOutputStream.close();

    }
}
