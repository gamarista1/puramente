package k9;

import N9.C3069s;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.adjust.sdk.network.ErrorCodes;
import ja.C3645a;
import ja.M;
import java.io.IOException;
import k9.C3700i;

public final class r extends P0 {

    /* renamed from: k  reason: collision with root package name */
    public static final C3700i.a f45815k = new C3716q();

    /* renamed from: d  reason: collision with root package name */
    public final int f45816d;

    /* renamed from: e  reason: collision with root package name */
    public final String f45817e;

    /* renamed from: f  reason: collision with root package name */
    public final int f45818f;

    /* renamed from: g  reason: collision with root package name */
    public final C3717q0 f45819g;

    /* renamed from: h  reason: collision with root package name */
    public final int f45820h;

    /* renamed from: i  reason: collision with root package name */
    public final C3069s f45821i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f45822j;

    private r(int i10, Throwable th2, int i11) {
        this(i10, th2, (String) null, i11, (String) null, -1, (C3717q0) null, 4, false);
    }

    public static /* synthetic */ r e(Bundle bundle) {
        return new r(bundle);
    }

    public static r g(Throwable th2, String str, int i10, C3717q0 q0Var, int i11, boolean z10, int i12) {
        int i13;
        if (q0Var == null) {
            i13 = 4;
        } else {
            i13 = i11;
        }
        return new r(1, th2, (String) null, i12, str, i10, q0Var, i13, z10);
    }

    public static r h(IOException iOException, int i10) {
        return new r(0, iOException, i10);
    }

    public static r i(RuntimeException runtimeException) {
        return j(runtimeException, 1000);
    }

    public static r j(RuntimeException runtimeException, int i10) {
        return new r(2, runtimeException, i10);
    }

    private static String k(int i10, String str, String str2, int i11, C3717q0 q0Var, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 == 1) {
            str3 = str2 + " error, index=" + i11 + ", format=" + q0Var + ", format_supported=" + M.X(i12);
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
    public r f(C3069s sVar) {
        return new r((String) M.j(getMessage()), getCause(), this.f45348a, this.f45816d, this.f45817e, this.f45818f, this.f45819g, this.f45820h, sVar, this.f45349b, this.f45822j);
    }

    private r(int i10, Throwable th2, String str, int i11, String str2, int i12, C3717q0 q0Var, int i13, boolean z10) {
        this(k(i10, str, str2, i12, q0Var, i13), th2, i11, i10, str2, i12, q0Var, i13, (C3069s) null, SystemClock.elapsedRealtime(), z10);
    }

    private r(Bundle bundle) {
        super(bundle);
        C3717q0 q0Var;
        this.f45816d = bundle.getInt(P0.d(ErrorCodes.SERVER_RETRY_IN), 2);
        this.f45817e = bundle.getString(P0.d(ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION));
        this.f45818f = bundle.getInt(P0.d(ErrorCodes.MALFORMED_URL_EXCEPTION), -1);
        Bundle bundle2 = bundle.getBundle(P0.d(ErrorCodes.PROTOCOL_EXCEPTION));
        if (bundle2 == null) {
            q0Var = null;
        } else {
            q0Var = (C3717q0) C3717q0.f45752H.a(bundle2);
        }
        this.f45819g = q0Var;
        this.f45820h = bundle.getInt(P0.d(ErrorCodes.SOCKET_TIMEOUT_EXCEPTION), 4);
        this.f45822j = bundle.getBoolean(P0.d(ErrorCodes.SSL_HANDSHAKE_EXCEPTION), false);
        this.f45821i = null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private r(String str, Throwable th2, int i10, int i11, String str2, int i12, C3717q0 q0Var, int i13, C3069s sVar, long j10, boolean z10) {
        super(str, th2, i10, j10);
        int i14 = i11;
        boolean z11 = z10;
        boolean z12 = false;
        C3645a.a(!z11 || i14 == 1);
        C3645a.a((th2 != null || i14 == 3) ? true : z12);
        this.f45816d = i14;
        this.f45817e = str2;
        this.f45818f = i12;
        this.f45819g = q0Var;
        this.f45820h = i13;
        this.f45821i = sVar;
        this.f45822j = z11;
    }
}
