package Gh;

import Sg.C5541d;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C6496s;

public abstract class a0 {
    public static final byte[] a(String str) {
        C6496s.h(str, "<this>");
        byte[] bytes = str.getBytes(C5541d.f65029b);
        C6496s.g(bytes, "getBytes(...)");
        return bytes;
    }

    public static final ReentrantLock b() {
        return new ReentrantLock();
    }

    public static final String c(byte[] bArr) {
        C6496s.h(bArr, "<this>");
        return new String(bArr, C5541d.f65029b);
    }
}
