package pe;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import pe.e;

public final class d implements j, e, i {

    /* renamed from: a  reason: collision with root package name */
    private final JavaScriptTypedArray f61332a;

    public d(JavaScriptTypedArray javaScriptTypedArray) {
        C6496s.h(javaScriptTypedArray, "rawArray");
        this.f61332a = javaScriptTypedArray;
    }

    public int a() {
        return this.f61332a.a();
    }

    public JavaScriptTypedArray b() {
        return this.f61332a;
    }

    /* renamed from: g */
    public Double get(int i10) {
        if (i10 >= 0 && i10 < a()) {
            return Double.valueOf(k(i10 * 8));
        }
        throw new IndexOutOfBoundsException();
    }

    public Iterator iterator() {
        return e.a.a(this);
    }

    public double k(int i10) {
        return this.f61332a.readDouble(i10);
    }

    public ByteBuffer toDirectBuffer() {
        return this.f61332a.toDirectBuffer();
    }
}
