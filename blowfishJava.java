import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class BlowfishTester {

    public static void main(String[] args) throws Exception {


        String text = "Teste para aula de Sistemas Operacionais";

        KeyGenerator KG = KeyGenerator.getInstance("Blowfish");
        KG.init(128);
        SecretKey SK = KG.generateKey();

        SecretKeySpec key = new SecretKeySpec(SK.getEncoded(), "Blowfish");
        Cipher cipher = Cipher.getInstance("Blowfish");

        cipher.init(Cipher.ENCRYPT_MODE, key);

        byte[] encrypted = cipher.doFinal(text.getBytes());
        String encryptedString = bytesToHex(encrypted);
        System.out.println("Encryptado -> Hexadecimal: " + encryptedString);
        System.out.print("Resultado da encriptaçao: ");
        System.out.println(new String(encrypted, "UTF8"));

        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decrypted = cipher.doFinal(encrypted);
        System.out.println("Texto decifrado: " + new String(decrypted, "UTF8"));

        cipher.init(Cipher.ENCRYPT_MODE, key);
        //Cifrando uma imagem qualquer.
        FileInputStream fin = new FileInputStream("Blowfish/BlowFish_Algorithm.png");
        FileOutputStream fout = new FileOutputStream("Blowfish/imagemCriptografada.png");
        CipherOutputStream cout = new CipherOutputStream(fout, cipher);

        int input = 0;
        while ((input = fin.read()) != -1) {
            cout.write(input);
        }

        //Decifrando a imagem
        cipher.init(Cipher.DECRYPT_MODE, key);

        fin = new FileInputStream("Blowfish/imagemCriptografada.png");
        fout = new FileOutputStream("Blowfish/imagemDecrip.png");
        cout = new CipherOutputStream(fout, cipher);

        while ((input = fin.read()) != -1) {
            cout.write(input);
        }
        fin.close();
        cout.close();
    }

    public static String bytesToHex(byte[] data) {
        if (data == null) {
            return null;
        } else {
            int len = data.length;
            String str = "";
            for (int i = 0; i < len; i++) {
                if ((data[i] & 0xFF) < 16) {
                    str = str + "0" + java.lang.Integer.toHexString(data[i] & 0xFF);
                } else {
                    str = str + java.lang.Integer.toHexString(data[i] & 0xFF);
                }
            }
            return str.toUpperCase();
        }
    }
}