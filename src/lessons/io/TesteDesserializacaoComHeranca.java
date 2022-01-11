package lessons.io;

import models.ContaCorrente;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDesserializacaoComHeranca {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("cc.bin"));
        ContaCorrente contaCorrente = (ContaCorrente) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(contaCorrente);
        System.out.println(contaCorrente.getTitular()); // should return null

    }
}
