import com.example.EncryptionStrategy;


public class Main {
    public static void main(String[] args) {
        // Create encryption strategies
        EncryptionStrategy aesEncryptionStrategy = new AESEncryptionStrategy();
        EncryptionStrategy rsaEncryptionStrategy = new RSAEncryptionStrategy();
        EncryptionStrategy blowfishEncryptionStrategy = new BlowfishEncryptionStrategy();
        

        // Create encryption processor
        EncryptionProcessor encryptionProcessor = new EncryptionProcessor();

        // Encrypt data using AES encryption
        encryptionProcessor.setEncryptionStrategy(aesEncryptionStrategy);
        String encryptedData = encryptionProcessor.encryptData("Hello, World!");
        System.out.println(encryptedData);

        // Encrypt data using RSA encryption
        encryptionProcessor.setEncryptionStrategy(rsaEncryptionStrategy);
        encryptedData = encryptionProcessor.encryptData("data for encrypt");
        System.out.println(encryptedData);

        // Encrypt data using Blowfish encryption
        encryptionProcessor.setEncryptionStrategy(blowfishEncryptionStrategy);
        encryptedData = encryptionProcessor.encryptData("mydata for encrypt");
        System.out.println(encryptedData);

    }
}