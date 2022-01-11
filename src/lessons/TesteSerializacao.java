package lessons;

import models.Cliente;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException {

        Cliente cliente = new Cliente();
        cliente.setNome("Andrew Monteiro");
        cliente.setCpf("000.000.000-00");
        cliente.setProfissao("Programador");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        objectOutputStream.writeObject(cliente);
        objectOutputStream.close();

    }
}
