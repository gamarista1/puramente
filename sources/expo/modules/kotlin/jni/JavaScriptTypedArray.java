package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.NoSuchElementException;
import je.C5055d;
import je.C5056e;
import je.C5057f;
import je.C5058g;
import je.C5060i;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6531o;
import pe.j;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H ¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH ¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H ¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H ¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0007H ¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0007H ¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H ¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u0007H ¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u0007H ¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u0007H ¢\u0006\u0004\b$\u0010%J \u0010'\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0015H ¢\u0006\u0004\b'\u0010(J \u0010)\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0018H ¢\u0006\u0004\b)\u0010*J \u0010+\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H ¢\u0006\u0004\b+\u0010,J \u0010-\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u001dH ¢\u0006\u0004\b-\u0010.J \u0010/\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010&\u001a\u00020 H ¢\u0006\u0004\b/\u00100J \u00101\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010&\u001a\u00020#H ¢\u0006\u0004\b1\u00102R\u001b\u00108\u001a\u0002038VX\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001b\u0010:\u001a\u00020\u00078VX\u0002¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b4\u0010\tR\u001b\u0010=\u001a\u00020\u00078VX\u0002¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b<\u0010\tR\u001b\u0010@\u001a\u00020\u00078VX\u0002¢\u0006\f\n\u0004\b>\u00105\u001a\u0004\b?\u0010\t¨\u0006A"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptTypedArray;", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "Lpe/j;", "Lcom/facebook/jni/HybridData;", "hybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "", "getRawKind", "()I", "Ljava/nio/ByteBuffer;", "toDirectBuffer", "()Ljava/nio/ByteBuffer;", "", "buffer", "position", "size", "Llf/M;", "read", "([BII)V", "write", "", "readByte", "(I)B", "", "read2Byte", "(I)S", "read4Byte", "(I)I", "", "read8Byte", "(I)J", "", "readFloat", "(I)F", "", "readDouble", "(I)D", "value", "writeByte", "(IB)V", "write2Byte", "(IS)V", "write4Byte", "(II)V", "write8Byte", "(IJ)V", "writeFloat", "(IF)V", "writeDouble", "(ID)V", "Lje/i;", "a", "Lkotlin/Lazy;", "getKind", "()Lje/i;", "kind", "b", "length", "c", "getByteLength", "byteLength", "d", "getByteOffset", "byteOffset", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JavaScriptTypedArray extends JavaScriptObject implements j {

    /* renamed from: a  reason: collision with root package name */
    private final Lazy f60443a = C6531o.b(new C5055d(this));

    /* renamed from: b  reason: collision with root package name */
    private final Lazy f60444b = C6531o.b(new C5056e(this));

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f60445c = C6531o.b(new C5057f(this));

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f60446d = C6531o.b(new C5058g(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JavaScriptTypedArray(HybridData hybridData) {
        super(hybridData);
        C6496s.h(hybridData, "hybridData");
    }

    private final native int getRawKind();

    /* access modifiers changed from: private */
    public static final int n(JavaScriptTypedArray javaScriptTypedArray) {
        return (int) javaScriptTypedArray.getProperty("byteLength").getDouble();
    }

    /* access modifiers changed from: private */
    public static final int o(JavaScriptTypedArray javaScriptTypedArray) {
        return (int) javaScriptTypedArray.getProperty("byteOffset").getDouble();
    }

    /* access modifiers changed from: private */
    public static final C5060i p(JavaScriptTypedArray javaScriptTypedArray) {
        int rawKind = javaScriptTypedArray.getRawKind();
        for (C5060i iVar : C5060i.values()) {
            if (iVar.b() == rawKind) {
                return iVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* access modifiers changed from: private */
    public static final int q(JavaScriptTypedArray javaScriptTypedArray) {
        return (int) javaScriptTypedArray.getProperty("length").getDouble();
    }

    public int a() {
        return ((Number) this.f60444b.getValue()).intValue();
    }

    public native void read(byte[] bArr, int i10, int i11);

    public native short read2Byte(int i10);

    public native int read4Byte(int i10);

    public native long read8Byte(int i10);

    public native byte readByte(int i10);

    public native double readDouble(int i10);

    public native float readFloat(int i10);

    public native ByteBuffer toDirectBuffer();

    public native void write(byte[] bArr, int i10, int i11);

    public native void write2Byte(int i10, short s10);

    public native void write4Byte(int i10, int i11);

    public native void write8Byte(int i10, long j10);

    public native void writeByte(int i10, byte b10);

    public native void writeDouble(int i10, double d10);

    public native void writeFloat(int i10, float f10);
}
