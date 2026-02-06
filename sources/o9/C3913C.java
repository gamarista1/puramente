package o9;

import ja.M;
import java.util.UUID;
import n9.C3866b;

/* renamed from: o9.C  reason: case insensitive filesystem */
public final class C3913C implements C3866b {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f47415d;

    /* renamed from: a  reason: collision with root package name */
    public final UUID f47416a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f47417b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f47418c;

    static {
        boolean z10;
        if ("Amazon".equals(M.f44983c)) {
            String str = M.f44984d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f47415d = z10;
            }
        }
        z10 = false;
        f47415d = z10;
    }

    public C3913C(UUID uuid, byte[] bArr, boolean z10) {
        this.f47416a = uuid;
        this.f47417b = bArr;
        this.f47418c = z10;
    }
}
