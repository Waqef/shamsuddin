import com.example.EncryptionStrategy;
public class RSAEncryptionStrategy implements EncryptionStrategy {
    @Override
    public String encrypt(String data){
                
        // Code of RSA encryption algorithm 
        System.out.println("RSA Encrypted: " + data);

    return "RSA-encrypted" + data;
}
}
