package o9;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.collect.C4771w;
import ia.C3612j;
import ia.I;
import ia.l;
import ia.n;
import ia.y;
import ja.C3645a;
import ja.M;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import k9.C3702j;
import o9.C3912B;

public final class G implements I {

    /* renamed from: a  reason: collision with root package name */
    private final C3612j.a f47425a;

    /* renamed from: b  reason: collision with root package name */
    private final String f47426b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f47427c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f47428d;

    public G(String str, boolean z10, C3612j.a aVar) {
        boolean z11;
        if (!z10 || !TextUtils.isEmpty(str)) {
            z11 = true;
        } else {
            z11 = false;
        }
        C3645a.a(z11);
        this.f47425a = aVar;
        this.f47426b = str;
        this.f47427c = z10;
        this.f47428d = new HashMap();
    }

    private static byte[] c(C3612j.a aVar, String str, byte[] bArr, Map map) {
        l lVar;
        I i10 = new I(aVar.a());
        n a10 = new n.b().j(str).e(map).d(2).c(bArr).b(1).a();
        int i11 = 0;
        n nVar = a10;
        while (true) {
            try {
                lVar = new l(i10, nVar);
                byte[] V02 = M.V0(lVar);
                M.n(lVar);
                return V02;
            } catch (y.f e10) {
                String d10 = d(e10, i11);
                if (d10 != null) {
                    i11++;
                    nVar = nVar.a().j(d10).a();
                    M.n(lVar);
                } else {
                    throw e10;
                }
            } catch (Exception e11) {
                throw new J(a10, (Uri) C3645a.e(i10.p()), i10.d(), i10.o(), e11);
            } catch (Throwable th2) {
                M.n(lVar);
                throw th2;
            }
        }
    }

    private static String d(y.f fVar, int i10) {
        Map map;
        List list;
        int i11 = fVar.f44562d;
        if ((i11 == 307 || i11 == 308) && i10 < 5 && (map = fVar.f44564f) != null && (list = (List) map.get("Location")) != null && !list.isEmpty()) {
            return (String) list.get(0);
        }
        return null;
    }

    public byte[] a(UUID uuid, C3912B.d dVar) {
        return c(this.f47425a, dVar.b() + "&signedRequest=" + M.D(dVar.a()), (byte[]) null, Collections.emptyMap());
    }

    public byte[] b(UUID uuid, C3912B.a aVar) {
        String str;
        String b10 = aVar.b();
        if (this.f47427c || TextUtils.isEmpty(b10)) {
            b10 = this.f47426b;
        }
        if (!TextUtils.isEmpty(b10)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = C3702j.f45579e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (C3702j.f45577c.equals(uuid)) {
                str = "application/json";
            } else {
                str = "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f47428d) {
                hashMap.putAll(this.f47428d);
            }
            return c(this.f47425a, b10, aVar.a(), hashMap);
        }
        n.b bVar = new n.b();
        Uri uri = Uri.EMPTY;
        throw new J(bVar.i(uri).a(), uri, C4771w.n(), 0, new IllegalStateException("No license URL"));
    }

    public void e(String str, String str2) {
        C3645a.e(str);
        C3645a.e(str2);
        synchronized (this.f47428d) {
            this.f47428d.put(str, str2);
        }
    }
}
