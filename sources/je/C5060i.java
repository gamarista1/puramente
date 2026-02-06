package je;

import sf.C6714a;

/* renamed from: je.i  reason: case insensitive filesystem */
public enum C5060i {
    Int8Array(0, 1, (int) null),
    Int16Array(0, 1, (int) null),
    Int32Array(0, 1, (int) null),
    Uint8Array(0, 1, (int) null),
    Uint8ClampedArray(0, 1, (int) null),
    Uint16Array(0, 1, (int) null),
    Uint32Array(0, 1, (int) null),
    Float32Array(0, 1, (int) null),
    Float64Array(0, 1, (int) null),
    BigInt64Array(0, 1, (int) null),
    BigUint64Array(0, 1, (int) null);
    

    /* renamed from: a  reason: collision with root package name */
    private final int f60901a;

    static {
        C5060i[] a10;
        f60900n = C6714a.a(a10);
    }

    private C5060i(int i10) {
        this.f60901a = i10;
    }

    public final int b() {
        return this.f60901a;
    }
}
