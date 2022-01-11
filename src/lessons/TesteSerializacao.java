package lessons;

import models.Cliente;

import java.io.*;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cliente cliente = new Cliente();
        cliente.setNome("Andrew Monteiro");
        cliente.setCpf("000.000.000-00");
        cliente.setProfissao("Programador");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        objectOutputStream.writeObject(cliente);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente clienteLido = (Cliente) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(clienteLido.getNome());

    }
}
