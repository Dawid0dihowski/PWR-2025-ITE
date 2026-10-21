package pl.edu.pwr.dkocyla.np;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import tools.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import java.io.File;

public class Main {

    public static void main(String[] args)
            throws ConfigurationException, NoSuchAlgorithmException {
        //zadanie 3
        Configurations configs = new Configurations();
        PropertiesConfiguration config = configs.properties(new File("src/main/resources/appsettings.properties"));
        String ordersDirectory = config.getString("ordersDirectory");
        System.out.println("Katalog zamówień: " + ordersDirectory);

        //zadanie 4
        File directory = new File(ordersDirectory);

        File[] jsonFiles = directory.listFiles((dir, name) -> name.endsWith(".json")); // lista wsystkich jsonow

        if (jsonFiles == null) { // konczymy jak nie ma zadnego jsona
            System.out.println("Nie udało się odczytać katalogu: " + ordersDirectory);
            return;
        }
        //zadanie 5
        ObjectMapper mapper = new ObjectMapper();

        for (File file : jsonFiles) {
            OrderRequest order = mapper.readValue(file, OrderRequest.class);
            String orderNumber = generateOrderNumber(order);
            System.out.println("Plik: " + file.getName() + " | Numer zamówienia: " + orderNumber);
        }


    }

    private static String generateOrderNumber(OrderRequest order)
            throws NoSuchAlgorithmException {

        StringBuilder data = new StringBuilder();

        data.append(order.getCustomer().getName()).append("|");
        data.append(order.getCustomer().getLastName()).append("|");
        data.append(order.getCustomer().getEmail()).append("|");
        data.append(order.getCustomer().getPhoneNumber()).append("|");

        for (Product product : order.getProducts()) {
            data.append(product.getCode()).append("|");
            data.append(product.getQuantity()).append("|");
            data.append(product.getUnit()).append("|");
        }
        MessageDigest digest = MessageDigest.getInstance("SHA-256");


        byte[] hash = digest.digest(data.toString().getBytes(StandardCharsets.UTF_8)); // daje na stringa zamieninoeg na bajty bo digest pracuje na bajtrach nie stringach


        StringBuilder hex = new StringBuilder();

        for (byte b : hash) {
            hex.append(String.format("%02x", b));
        }
        return "ORD-" + hex;
    }
}