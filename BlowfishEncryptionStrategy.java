import com.example.EncryptionStrategy;

public class BlowfishEncryptionStrategy implements EncryptionStrategy {
    @Override
    public String encrypt(String data){
        // code of Blosfish encrypted algorithm
        System.out.println("Blofish Encrypted: " + data);
        return "Blofish-Encrypted: " + data;
    }
    
}
