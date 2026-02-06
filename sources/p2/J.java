package p2;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.collect.C4771w;
import f2.C1973h;
import i2.C2076a;
import i2.L;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import k2.f;
import k2.h;
import k2.j;
import k2.s;
import k2.w;
import ob.C5120a;
import p2.C2390A;

public final class J implements L {

    /* renamed from: a  reason: collision with root package name */
    private final f.a f25191a;

    /* renamed from: b  reason: collision with root package name */
    private final String f25192b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f25193c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f25194d;

    public J(String str, boolean z10, f.a aVar) {
        boolean z11;
        if (!z10 || !TextUtils.isEmpty(str)) {
            z11 = true;
        } else {
            z11 = false;
        }
        C2076a.a(z11);
        this.f25191a = aVar;
        this.f25192b = str;
        this.f25193c = z10;
        this.f25194d = new HashMap();
    }

    private static byte[] c(f.a aVar, String str, byte[] bArr, Map map) {
        h hVar;
        w wVar = new w(aVar.a());
        j a10 = new j.b().i(str).e(map).d(2).c(bArr).b(1).a();
        int i10 = 0;
        j jVar = a10;
        while (true) {
            try {
                hVar = new h(wVar, jVar);
                byte[] b10 = C5120a.b(hVar);
                L.l(hVar);
                return b10;
            } catch (s e10) {
                String d10 = d(e10, i10);
                if (d10 != null) {
                    i10++;
                    jVar = jVar.a().i(d10).a();
                    L.l(hVar);
                } else {
                    throw e10;
                }
            } catch (Exception e11) {
                throw new M(a10, (Uri) C2076a.e(wVar.p()), wVar.d(), wVar.o(), e11);
            } catch (Throwable th2) {
                L.l(hVar);
                throw th2;
            }
        }
    }

    private static String d(s sVar, int i10) {
        Map map;
        List list;
        int i11 = sVar.f23262d;
        if ((i11 == 307 || i11 == 308) && i10 < 5 && (map = sVar.f23264f) != null && (list = (List) map.get("Location")) != null && !list.isEmpty()) {
            return (String) list.get(0);
        }
        return null;
    }

    public byte[] a(UUID uuid, C2390A.a aVar) {
        String str;
        String b10 = aVar.b();
        if (this.f25193c || TextUtils.isEmpty(b10)) {
            b10 = this.f25192b;
        }
        if (!TextUtils.isEmpty(b10)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = C1973h.f19976e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (C1973h.f19974c.equals(uuid)) {
                str = "application/json";
            } else {
                str = "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f25194d) {
                hashMap.putAll(this.f25194d);
            }
            return c(this.f25191a, b10, aVar.a(), hashMap);
        }
        j.b bVar = new j.b();
        Uri uri = Uri.EMPTY;
        throw new M(bVar.h(uri).a(), uri, C4771w.n(), 0, new IllegalStateException("No license URL"));
    }

    public byte[] b(UUID uuid, C2390A.d dVar) {
        return c(this.f25191a, dVar.b() + "&signedRequest=" + L.G(dVar.a()), (byte[]) null, Collections.emptyMap());
    }

    public void e(String str, String str2) {
        C2076a.e(str);
        C2076a.e(str2);
        synchronized (this.f25194d) {
            this.f25194d.put(str, str2);
        }
    }
}
