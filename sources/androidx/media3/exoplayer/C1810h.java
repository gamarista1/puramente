package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.adjust.sdk.network.ErrorCodes;
import f2.C1962C;
import f2.s;
import i2.C2076a;
import i2.L;
import java.io.IOException;
import t2.C2615C;

/* renamed from: androidx.media3.exoplayer.h  reason: case insensitive filesystem */
public final class C1810h extends C1962C {

    /* renamed from: q  reason: collision with root package name */
    private static final String f17697q = L.y0(ErrorCodes.SERVER_RETRY_IN);

    /* renamed from: r  reason: collision with root package name */
    private static final String f17698r = L.y0(ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION);

    /* renamed from: s  reason: collision with root package name */
    private static final String f17699s = L.y0(ErrorCodes.MALFORMED_URL_EXCEPTION);

    /* renamed from: t  reason: collision with root package name */
    private static final String f17700t = L.y0(ErrorCodes.PROTOCOL_EXCEPTION);

    /* renamed from: u  reason: collision with root package name */
    private static final String f17701u = L.y0(ErrorCodes.SOCKET_TIMEOUT_EXCEPTION);

    /* renamed from: v  reason: collision with root package name */
    private static final String f17702v = L.y0(ErrorCodes.SSL_HANDSHAKE_EXCEPTION);

    /* renamed from: j  reason: collision with root package name */
    public final int f17703j;

    /* renamed from: k  reason: collision with root package name */
    public final String f17704k;

    /* renamed from: l  reason: collision with root package name */
    public final int f17705l;

    /* renamed from: m  reason: collision with root package name */
    public final s f17706m;

    /* renamed from: n  reason: collision with root package name */
    public final int f17707n;

    /* renamed from: o  reason: collision with root package name */
    public final C2615C.b f17708o;

    /* renamed from: p  reason: collision with root package name */
    final boolean f17709p;

    private C1810h(int i10, Throwable th2, int i11) {
        this(i10, th2, (String) null, i11, (String) null, -1, (s) null, 4, false);
    }

    public static C1810h b(Throwable th2, String str, int i10, s sVar, int i11, boolean z10, int i12) {
        int i13;
        if (sVar == null) {
            i13 = 4;
        } else {
            i13 = i11;
        }
        return new C1810h(1, th2, (String) null, i12, str, i10, sVar, i13, z10);
    }

    public static C1810h c(IOException iOException, int i10) {
        return new C1810h(0, iOException, i10);
    }

    public static C1810h d(RuntimeException runtimeException, int i10) {
        return new C1810h(2, runtimeException, i10);
    }

    private static String e(int i10, String str, String str2, int i11, s sVar, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 == 1) {
            str3 = str2 + " error, index=" + i11 + ", format=" + sVar + ", format_supported=" + L.X(i12);
        } else if (i10 != 3) {
            str3 = "Unexpected runtime error";
        } else {
            str3 = "Remote error";
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    /* access modifiers changed from: package-private */
    public C1810h a(C2615C.b bVar) {
        return new C1810h((String) L.h(getMessage()), getCause(), this.f19703a, this.f17703j, this.f17704k, this.f17705l, this.f17706m, this.f17707n, bVar, this.f19704b, this.f17709p);
    }

    private C1810h(int i10, Throwable th2, String str, int i11, String str2, int i12, s sVar, int i13, boolean z10) {
        this(e(i10, str, str2, i12, sVar, i13), th2, i11, i10, str2, i12, sVar, i13, (C2615C.b) null, SystemClock.elapsedRealtime(), z10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C1810h(String str, Throwable th2, int i10, int i11, String str2, int i12, s sVar, int i13, C2615C.b bVar, long j10, boolean z10) {
        super(str, th2, i10, Bundle.EMPTY, j10);
        int i14 = i11;
        boolean z11 = z10;
        boolean z12 = false;
        C2076a.a(!z11 || i14 == 1);
        C2076a.a((th2 != null || i14 == 3) ? true : z12);
        this.f17703j = i14;
        this.f17704k = str2;
        this.f17705l = i12;
        this.f17706m = sVar;
        this.f17707n = i13;
        this.f17708o = bVar;
        this.f17709p = z11;
    }
}
