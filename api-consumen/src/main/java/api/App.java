package api;

import org.dom4j.DocumentException;

import javax.swing.*;
import java.io.IOException;

public class App {
    public static void main(String[] agrs) throws IOException, InterruptedException, DocumentException {

        var cepConsumer = new CepApiConsumer();

        var cep = JOptionPane.showInputDialog("Digite o cep: ");

        var enderenco = cepConsumer.getenderenco(cep);

        var enderencoBuilder = new StringBuilder();

        JOptionPane.showMessageDialog(null, enderencoBuilder.append("Endereço: \n")
                .append("Cidade : " + enderenco.getLocalidade()).append("\n")
                .append("UF: " + enderenco.getUf()).append("\n")
                .append("Gia: " + enderenco.getGia()).append("\n")
                .append("Bairro: " + enderenco.getBairro()).append("\n")
                .append("Complemento: " + enderenco.getComplemento()).append("\n")
                .append("Logradouro: " + enderenco.getLogradouro()).append("\n")
                .append("CEP: " + enderenco.getCep()).append("\n"));


    }
}
