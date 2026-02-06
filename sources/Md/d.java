package Md;

public interface d {
    void reject(String str, String str2) {
        reject(str, str2, (Throwable) null);
    }

    void reject(String str, String str2, Throwable th2);

    void resolve(Object obj);
}
