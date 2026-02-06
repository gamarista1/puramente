package ia;

import com.adjust.sdk.network.ErrorCodes;
import ia.C3612j;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import nb.C5108c;

public interface y extends C3612j {

    public static abstract class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final g f44558a = new g();

        /* renamed from: b */
        public final y a() {
            return c(this.f44558a);
        }

        /* access modifiers changed from: protected */
        public abstract y c(g gVar);

        public final c d(Map map) {
            this.f44558a.a(map);
            return this;
        }
    }

    public static final class b extends d {
        public b(IOException iOException, n nVar) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, nVar, 2007, 1);
        }
    }

    public interface c extends C3612j.a {
    }

    public static final class e extends d {

        /* renamed from: d  reason: collision with root package name */
        public final String f44561d;

        public e(String str, n nVar) {
            super("Invalid content type: " + str, nVar, 2003, 1);
            this.f44561d = str;
        }
    }

    public static final class f extends d {

        /* renamed from: d  reason: collision with root package name */
        public final int f44562d;

        /* renamed from: e  reason: collision with root package name */
        public final String f44563e;

        /* renamed from: f  reason: collision with root package name */
        public final Map f44564f;

        /* renamed from: g  reason: collision with root package name */
        public final byte[] f44565g;

        public f(int i10, String str, IOException iOException, Map map, n nVar, byte[] bArr) {
            super("Response code: " + i10, iOException, nVar, 2004, 1);
            this.f44562d = i10;
            this.f44563e = str;
            this.f44564f = map;
            this.f44565g = bArr;
        }
    }

    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        private final Map f44566a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private Map f44567b;

        public synchronized void a(Map map) {
            this.f44567b = null;
            this.f44566a.clear();
            this.f44566a.putAll(map);
        }

        public synchronized Map b() {
            try {
                if (this.f44567b == null) {
                    this.f44567b = Collections.unmodifiableMap(new HashMap(this.f44566a));
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
            return this.f44567b;
        }
    }

    public static class d extends C3613k {

        /* renamed from: b  reason: collision with root package name */
        public final n f44559b;

        /* renamed from: c  reason: collision with root package name */
        public final int f44560c;

        public d(n nVar, int i10, int i11) {
            super(b(i10, i11));
            this.f44559b = nVar;
            this.f44560c = i11;
        }

        private static int b(int i10, int i11) {
            if (i10 == 2000 && i11 == 1) {
                return 2001;
            }
            return i10;
        }

        public static d c(IOException iOException, n nVar, int i10) {
            int i11;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i11 = 2002;
            } else if (iOException instanceof InterruptedIOException) {
                i11 = ErrorCodes.PROTOCOL_EXCEPTION;
            } else if (message == null || !C5108c.e(message).matches("cleartext.*not permitted.*")) {
                i11 = 2001;
            } else {
                i11 = 2007;
            }
            if (i11 == 2007) {
                return new b(iOException, nVar);
            }
            return new d(iOException, nVar, i11, i10);
        }

        public d(String str, n nVar, int i10, int i11) {
            super(str, b(i10, i11));
            this.f44559b = nVar;
            this.f44560c = i11;
        }

        public d(IOException iOException, n nVar, int i10, int i11) {
            super((Throwable) iOException, b(i10, i11));
            this.f44559b = nVar;
            this.f44560c = i11;
        }

        public d(String str, IOException iOException, n nVar, int i10, int i11) {
            super(str, iOException, b(i10, i11));
            this.f44559b = nVar;
            this.f44560c = i11;
        }
    }
}
