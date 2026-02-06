package p2;

import i2.L;
import java.util.UUID;
import l2.C2170b;

/* renamed from: p2.B  reason: case insensitive filesystem */
public final class C2391B implements C2170b {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f25181d;

    /* renamed from: a  reason: collision with root package name */
    public final UUID f25182a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f25183b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f25184c;

    static {
        boolean z10;
        if ("Amazon".equals(L.f22074c)) {
            String str = L.f22075d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f25181d = z10;
            }
        }
        z10 = false;
        f25181d = z10;
    }

    public C2391B(UUID uuid, byte[] bArr, boolean z10) {
        this.f25182a = uuid;
        this.f25183b = bArr;
        this.f25184c = z10;
    }
}
