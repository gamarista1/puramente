package com.facebook.react.common.mapbuffer;

import Ef.i;
import Sg.C5541d;
import com.facebook.jni.HybridData;
import com.facebook.react.common.mapbuffer.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6511J;
import lf.C6535s;
import mf.C6565s;
import zf.C6828a;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 N2\u00020\u0001:\u0002FDB\u0011\b\u0013\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006H ¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010\u0012J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\bH\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b/\u0010\u0012J\u0017\u00100\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u0010(J\u0017\u00101\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u0010\u0012J\u0017\u00102\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u0010!J\u0017\u00103\u001a\u00020)2\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u0010+J\u0017\u00104\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b4\u0010(J\u0017\u00105\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b5\u0010.J\u000f\u00106\u001a\u00020\bH\u0016¢\u0006\u0004\b6\u00107J\u001a\u0010:\u001a\u00020&2\b\u00109\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020)H\u0016¢\u0006\u0004\b<\u0010=J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>H\u0002¢\u0006\u0004\b@\u0010AR\u0016\u0010B\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010\u0015R$\u0010K\u001a\u00020\b2\u0006\u0010H\u001a\u00020\b8\u0016@RX\u000e¢\u0006\f\n\u0004\bI\u0010\u0015\u001a\u0004\bJ\u00107R\u0014\u0010M\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\bL\u00107¨\u0006O"}, d2 = {"Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;", "Lcom/facebook/react/common/mapbuffer/a;", "Lcom/facebook/jni/HybridData;", "hybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "Ljava/nio/ByteBuffer;", "buffer", "", "offset", "(Ljava/nio/ByteBuffer;I)V", "importByteBuffer", "()Ljava/nio/ByteBuffer;", "Llf/M;", "P", "()V", "intKey", "z", "(I)I", "bucketIndex", "Lcom/facebook/react/common/mapbuffer/a$b;", "I", "(I)Lcom/facebook/react/common/mapbuffer/a$b;", "key", "expected", "E", "(ILcom/facebook/react/common/mapbuffer/a$b;)I", "bufferPosition", "Llf/J;", "Z", "(I)S", "", "N", "(I)D", "Q", "", "R", "(I)J", "", "H", "(I)Z", "", "W", "(I)Ljava/lang/String;", "position", "S", "(I)Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;", "A", "p", "getInt", "getDouble", "getString", "getBoolean", "C", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "Lcom/facebook/react/common/mapbuffer/a$c;", "iterator", "()Ljava/util/Iterator;", "mHybridData", "Lcom/facebook/jni/HybridData;", "a", "Ljava/nio/ByteBuffer;", "b", "offsetToMapBuffer", "value", "c", "getCount", "count", "D", "offsetForDynamicData", "d", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@B7.a
public final class ReadableMapBuffer implements a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f40596d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final ByteBuffer f40597a;

    /* renamed from: b  reason: collision with root package name */
    private final int f40598b;

    /* renamed from: c  reason: collision with root package name */
    private int f40599c;
    @B7.a
    private final HybridData mHybridData;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final class b implements a.c {

        /* renamed from: a  reason: collision with root package name */
        private final int f40600a;

        public b(int i10) {
            this.f40600a = i10;
        }

        private final void g(a.b bVar) {
            a.b type = getType();
            if (bVar != type) {
                int key = getKey();
                throw new IllegalStateException(("Expected " + bVar + " for key: " + key + " found " + type + " instead.").toString());
            }
        }

        public long a() {
            g(a.b.LONG);
            return ReadableMapBuffer.this.R(this.f40600a + 4);
        }

        public int b() {
            g(a.b.INT);
            return ReadableMapBuffer.this.Q(this.f40600a + 4);
        }

        public double c() {
            g(a.b.DOUBLE);
            return ReadableMapBuffer.this.N(this.f40600a + 4);
        }

        public String d() {
            g(a.b.STRING);
            return ReadableMapBuffer.this.W(this.f40600a + 4);
        }

        public a e() {
            g(a.b.MAP);
            return ReadableMapBuffer.this.S(this.f40600a + 4);
        }

        public boolean f() {
            g(a.b.BOOL);
            return ReadableMapBuffer.this.H(this.f40600a + 4);
        }

        public int getKey() {
            return ReadableMapBuffer.this.Z(this.f40600a) & 65535;
        }

        public a.b getType() {
            return a.b.values()[ReadableMapBuffer.this.Z(this.f40600a + 2) & 65535];
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f40602a;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.facebook.react.common.mapbuffer.a$b[] r0 = com.facebook.react.common.mapbuffer.a.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.react.common.mapbuffer.a$b r1 = com.facebook.react.common.mapbuffer.a.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.facebook.react.common.mapbuffer.a$b r1 = com.facebook.react.common.mapbuffer.a.b.INT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.facebook.react.common.mapbuffer.a$b r1 = com.facebook.react.common.mapbuffer.a.b.LONG     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.facebook.react.common.mapbuffer.a$b r1 = com.facebook.react.common.mapbuffer.a.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.facebook.react.common.mapbuffer.a$b r1 = com.facebook.react.common.mapbuffer.a.b.STRING     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.facebook.react.common.mapbuffer.a$b r1 = com.facebook.react.common.mapbuffer.a.b.MAP     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f40602a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.common.mapbuffer.ReadableMapBuffer.c.<clinit>():void");
        }
    }

    public static final class d implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private int f40603a;

        /* renamed from: b  reason: collision with root package name */
        private final int f40604b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ReadableMapBuffer f40605c;

        d(ReadableMapBuffer readableMapBuffer) {
            this.f40605c = readableMapBuffer;
            this.f40604b = readableMapBuffer.getCount() - 1;
        }

        /* renamed from: a */
        public a.c next() {
            ReadableMapBuffer readableMapBuffer = this.f40605c;
            int i10 = this.f40603a;
            this.f40603a = i10 + 1;
            return new b(readableMapBuffer.A(i10));
        }

        public boolean hasNext() {
            if (this.f40603a <= this.f40604b) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    static {
        F7.a.a();
    }

    @B7.a
    private ReadableMapBuffer(HybridData hybridData) {
        this.mHybridData = hybridData;
        this.f40597a = importByteBuffer();
        this.f40598b = 0;
        P();
    }

    /* access modifiers changed from: private */
    public final int A(int i10) {
        return this.f40598b + 8 + (i10 * 12);
    }

    private final int D() {
        return A(getCount());
    }

    private final int E(int i10, a.b bVar) {
        int z10 = z(i10);
        if (z10 != -1) {
            a.b I10 = I(z10);
            if (I10 == bVar) {
                return A(z10) + 4;
            }
            throw new IllegalStateException(("Expected " + bVar + " for key: " + i10 + ", found " + I10 + " instead.").toString());
        }
        throw new IllegalArgumentException(("Key not found: " + i10).toString());
    }

    /* access modifiers changed from: private */
    public final boolean H(int i10) {
        if (Q(i10) == 1) {
            return true;
        }
        return false;
    }

    private final a.b I(int i10) {
        return a.b.values()[Z(A(i10) + 2) & 65535];
    }

    /* access modifiers changed from: private */
    public final double N(int i10) {
        return this.f40597a.getDouble(i10);
    }

    private final void P() {
        if (this.f40597a.getShort() != 254) {
            this.f40597a.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.f40599c = Z(this.f40597a.position()) & 65535;
    }

    /* access modifiers changed from: private */
    public final int Q(int i10) {
        return this.f40597a.getInt(i10);
    }

    /* access modifiers changed from: private */
    public final long R(int i10) {
        return this.f40597a.getLong(i10);
    }

    /* access modifiers changed from: private */
    public final ReadableMapBuffer S(int i10) {
        return new ReadableMapBuffer(this.f40597a, D() + this.f40597a.getInt(i10) + 4);
    }

    /* access modifiers changed from: private */
    public final String W(int i10) {
        int D10 = D() + this.f40597a.getInt(i10);
        int i11 = this.f40597a.getInt(D10);
        byte[] bArr = new byte[i11];
        this.f40597a.position(D10 + 4);
        this.f40597a.get(bArr, 0, i11);
        return new String(bArr, C5541d.f65029b);
    }

    /* access modifiers changed from: private */
    public final short Z(int i10) {
        return C6511J.b(this.f40597a.getShort(i10));
    }

    /* access modifiers changed from: private */
    public static final CharSequence a0(a.c cVar) {
        C6496s.h(cVar, "entry");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar.getKey());
        sb2.append('=');
        switch (c.f40602a[cVar.getType().ordinal()]) {
            case 1:
                sb2.append(cVar.f());
                break;
            case 2:
                sb2.append(cVar.b());
                break;
            case 3:
                sb2.append(cVar.a());
                break;
            case 4:
                sb2.append(cVar.c());
                break;
            case 5:
                sb2.append('\"');
                sb2.append(cVar.d());
                sb2.append('\"');
                break;
            case 6:
                sb2.append(cVar.e().toString());
                break;
            default:
                throw new C6535s();
        }
        return sb2;
    }

    private final native ByteBuffer importByteBuffer();

    private final int z(int i10) {
        i a10 = a.f40614U.a();
        int k10 = a10.k();
        if (i10 <= a10.n() && k10 <= i10) {
            short b10 = C6511J.b((short) i10);
            int count = getCount() - 1;
            int i11 = 0;
            while (i11 <= count) {
                int i12 = (i11 + count) >>> 1;
                short Z10 = Z(A(i12)) & 65535;
                short s10 = 65535 & b10;
                if (C6496s.i(Z10, s10) < 0) {
                    i11 = i12 + 1;
                } else if (C6496s.i(Z10, s10) <= 0) {
                    return i12;
                } else {
                    count = i12 - 1;
                }
            }
        }
        return -1;
    }

    /* renamed from: C */
    public ReadableMapBuffer F(int i10) {
        return S(E(i10, a.b.MAP));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ReadableMapBuffer)) {
            return false;
        }
        ByteBuffer byteBuffer = this.f40597a;
        ByteBuffer byteBuffer2 = ((ReadableMapBuffer) obj).f40597a;
        if (byteBuffer == byteBuffer2) {
            return true;
        }
        byteBuffer.rewind();
        byteBuffer2.rewind();
        return C6496s.c(byteBuffer, byteBuffer2);
    }

    public boolean getBoolean(int i10) {
        return H(E(i10, a.b.BOOL));
    }

    public int getCount() {
        return this.f40599c;
    }

    public double getDouble(int i10) {
        return N(E(i10, a.b.DOUBLE));
    }

    public int getInt(int i10) {
        return Q(E(i10, a.b.INT));
    }

    public String getString(int i10) {
        return W(E(i10, a.b.STRING));
    }

    public int hashCode() {
        this.f40597a.rewind();
        return this.f40597a.hashCode();
    }

    public Iterator iterator() {
        return new d(this);
    }

    public boolean p(int i10) {
        if (z(i10) != -1) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        C6565s.v0(this, sb2, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new F7.b(), 62, (Object) null);
        sb2.append('}');
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    private ReadableMapBuffer(ByteBuffer byteBuffer, int i10) {
        this.mHybridData = null;
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i10);
        this.f40597a = duplicate;
        this.f40598b = i10;
        P();
    }
}
