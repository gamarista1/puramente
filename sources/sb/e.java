package sb;

import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

public interface e {

    public static class a implements e {
        /* renamed from: b */
        public Cipher a(String str, Provider provider) {
            if (provider == null) {
                return Cipher.getInstance(str);
            }
            return Cipher.getInstance(str, provider);
        }
    }

    public static class b implements e {
        /* renamed from: b */
        public KeyAgreement a(String str, Provider provider) {
            if (provider == null) {
                return KeyAgreement.getInstance(str);
            }
            return KeyAgreement.getInstance(str, provider);
        }
    }

    public static class c implements e {
        /* renamed from: b */
        public KeyFactory a(String str, Provider provider) {
            if (provider == null) {
                return KeyFactory.getInstance(str);
            }
            return KeyFactory.getInstance(str, provider);
        }
    }

    public static class d implements e {
        /* renamed from: b */
        public KeyPairGenerator a(String str, Provider provider) {
            if (provider == null) {
                return KeyPairGenerator.getInstance(str);
            }
            return KeyPairGenerator.getInstance(str, provider);
        }
    }

    /* renamed from: sb.e$e  reason: collision with other inner class name */
    public static class C0911e implements e {
        /* renamed from: b */
        public Mac a(String str, Provider provider) {
            if (provider == null) {
                return Mac.getInstance(str);
            }
            return Mac.getInstance(str, provider);
        }
    }

    public static class f implements e {
        /* renamed from: b */
        public MessageDigest a(String str, Provider provider) {
            if (provider == null) {
                return MessageDigest.getInstance(str);
            }
            return MessageDigest.getInstance(str, provider);
        }
    }

    public static class g implements e {
        /* renamed from: b */
        public Signature a(String str, Provider provider) {
            if (provider == null) {
                return Signature.getInstance(str);
            }
            return Signature.getInstance(str, provider);
        }
    }

    Object a(String str, Provider provider);
}
