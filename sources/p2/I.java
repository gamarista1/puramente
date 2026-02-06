package p2;

import T2.o;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import f2.C1973h;
import f2.C1979n;
import i2.C2073A;
import i2.C2076a;
import i2.L;
import i2.p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import n2.u1;
import nb.C5110e;
import p2.C2390A;

public final class I implements C2390A {

    /* renamed from: d  reason: collision with root package name */
    public static final C2390A.c f25187d = new C2392C();

    /* renamed from: a  reason: collision with root package name */
    private final UUID f25188a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaDrm f25189b;

    /* renamed from: c  reason: collision with root package name */
    private int f25190c = 1;

    private static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, u1 u1Var) {
            LogSessionId a10 = u1Var.a();
            if (!a10.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                C2395F.a(C2076a.e(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(a10);
            }
        }
    }

    private I(UUID uuid) {
        C2076a.e(uuid);
        C2076a.b(!C1973h.f19973b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f25188a = uuid;
        MediaDrm mediaDrm = new MediaDrm(u(uuid));
        this.f25189b = mediaDrm;
        if (C1973h.f19975d.equals(uuid) && C()) {
            w(mediaDrm);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A(C2390A.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        bVar.a(this, bArr, i10, i11, bArr2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C2390A B(UUID uuid) {
        try {
            return D(uuid);
        } catch (N unused) {
            p.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new y();
        }
    }

    private static boolean C() {
        return "ASUS_Z00AD".equals(L.f22075d);
    }

    public static I D(UUID uuid) {
        try {
            return new I(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new N(1, e10);
        } catch (Exception e11) {
            throw new N(2, e11);
        }
    }

    private boolean E() {
        if (L.f22072a >= 21 || !C1973h.f19975d.equals(this.f25188a) || !"L3".equals(x("securityLevel"))) {
            return false;
        }
        return true;
    }

    private static byte[] p(byte[] bArr) {
        C2073A a10 = new C2073A(bArr);
        int u10 = a10.u();
        short w10 = a10.w();
        short w11 = a10.w();
        if (w10 == 1 && w11 == 1) {
            short w12 = a10.w();
            Charset charset = C5110e.f61087e;
            String F10 = a10.F(w12, charset);
            if (F10.contains("<LA_URL>")) {
                return bArr;
            }
            int indexOf = F10.indexOf("</DATA>");
            if (indexOf == -1) {
                p.h("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            String str = F10.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + F10.substring(indexOf);
            int i10 = u10 + 52;
            ByteBuffer allocate = ByteBuffer.allocate(i10);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i10);
            allocate.putShort((short) w10);
            allocate.putShort((short) w11);
            allocate.putShort((short) (str.length() * 2));
            allocate.put(str.getBytes(charset));
            return allocate.array();
        }
        p.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    private String q(String str) {
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            return "";
        }
        if (L.f22072a >= 33 && "https://default.url".equals(str)) {
            String x10 = x(DiagnosticsEntry.VERSION_KEY);
            if (Objects.equals(x10, "1.2") || Objects.equals(x10, "aidl-1")) {
                return "";
            }
        }
        return str;
    }

    private static byte[] r(UUID uuid, byte[] bArr) {
        if (C1973h.f19974c.equals(uuid)) {
            return C2397a.a(bArr);
        }
        return bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if ("AFTT".equals(r0) == false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] s(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = f2.C1973h.f19976e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L_0x0018
            byte[] r1 = T2.o.e(r4, r3)
            if (r1 != 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r4 = r1
        L_0x0010:
            byte[] r4 = p(r4)
            byte[] r4 = T2.o.a(r0, r4)
        L_0x0018:
            int r1 = i2.L.f22072a
            r2 = 23
            if (r1 >= r2) goto L_0x0026
            java.util.UUID r1 = f2.C1973h.f19975d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0058
        L_0x0026:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = i2.L.f22074c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = i2.L.f22075d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005f
        L_0x0058:
            byte[] r3 = T2.o.e(r4, r3)
            if (r3 == 0) goto L_0x005f
            return r3
        L_0x005f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.I.s(java.util.UUID, byte[]):byte[]");
    }

    private static String t(UUID uuid, String str) {
        if (L.f22072a >= 26 || !C1973h.f19974c.equals(uuid) || (!"video/mp4".equals(str) && !"audio/mp4".equals(str))) {
            return str;
        }
        return "cenc";
    }

    private static UUID u(UUID uuid) {
        if (L.f22072a >= 27 || !C1973h.f19974c.equals(uuid)) {
            return uuid;
        }
        return C1973h.f19973b;
    }

    private static void w(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static C1979n.b y(UUID uuid, List list) {
        if (!C1973h.f19975d.equals(uuid)) {
            return (C1979n.b) list.get(0);
        }
        if (L.f22072a >= 28 && list.size() > 1) {
            C1979n.b bVar = (C1979n.b) list.get(0);
            int i10 = 0;
            int i11 = 0;
            while (i10 < list.size()) {
                C1979n.b bVar2 = (C1979n.b) list.get(i10);
                byte[] bArr = (byte[]) C2076a.e(bVar2.f20020e);
                if (L.c(bVar2.f20019d, bVar.f20019d) && L.c(bVar2.f20018c, bVar.f20018c) && o.c(bArr)) {
                    i11 += bArr.length;
                    i10++;
                }
            }
            byte[] bArr2 = new byte[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                byte[] bArr3 = (byte[]) C2076a.e(((C1979n.b) list.get(i13)).f20020e);
                int length = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i12, length);
                i12 += length;
            }
            return bVar.a(bArr2);
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            C1979n.b bVar3 = (C1979n.b) list.get(i14);
            int g10 = o.g((byte[]) C2076a.e(bVar3.f20020e));
            int i15 = L.f22072a;
            if (i15 < 23 && g10 == 0) {
                return bVar3;
            }
            if (i15 >= 23 && g10 == 1) {
                return bVar3;
            }
        }
        return (C1979n.b) list.get(0);
    }

    private boolean z() {
        if (!this.f25188a.equals(C1973h.f19975d)) {
            return this.f25188a.equals(C1973h.f19974c);
        }
        String x10 = x(DiagnosticsEntry.VERSION_KEY);
        if (x10.startsWith("v5.") || x10.startsWith("14.") || x10.startsWith("15.") || x10.startsWith("16.0")) {
            return false;
        }
        return true;
    }

    public Map a(byte[] bArr) {
        return this.f25189b.queryKeyStatus(bArr);
    }

    public C2390A.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f25189b.getProvisionRequest();
        return new C2390A.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    public byte[] c() {
        return this.f25189b.openSession();
    }

    public void d(byte[] bArr, byte[] bArr2) {
        this.f25189b.restoreKeys(bArr, bArr2);
    }

    public void e(byte[] bArr) {
        this.f25189b.provideProvisionResponse(bArr);
    }

    public int f() {
        return 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean h(byte[] r5, java.lang.String r6) {
        /*
            r4 = this;
            int r0 = i2.L.f22072a
            r1 = 31
            r2 = 1
            if (r0 < r1) goto L_0x0014
            boolean r0 = r4.z()
            if (r0 == 0) goto L_0x0014
            android.media.MediaDrm r5 = r4.f25189b
            boolean r5 = p2.I.a.a(r5, r6)
            goto L_0x0036
        L_0x0014:
            r0 = 0
            android.media.MediaCrypto r1 = new android.media.MediaCrypto     // Catch:{ MediaCryptoException -> 0x0030, all -> 0x0029 }
            java.util.UUID r3 = r4.f25188a     // Catch:{ MediaCryptoException -> 0x0030, all -> 0x0029 }
            r1.<init>(r3, r5)     // Catch:{ MediaCryptoException -> 0x0030, all -> 0x0029 }
            boolean r5 = r1.requiresSecureDecoderComponent(r6)     // Catch:{ MediaCryptoException -> 0x0027, all -> 0x0024 }
            r1.release()
            goto L_0x0036
        L_0x0024:
            r5 = move-exception
            r0 = r1
            goto L_0x002a
        L_0x0027:
            r0 = r1
            goto L_0x0030
        L_0x0029:
            r5 = move-exception
        L_0x002a:
            if (r0 == 0) goto L_0x002f
            r0.release()
        L_0x002f:
            throw r5
        L_0x0030:
            if (r0 == 0) goto L_0x0035
            r0.release()
        L_0x0035:
            r5 = r2
        L_0x0036:
            if (r5 == 0) goto L_0x003f
            boolean r5 = r4.E()
            if (r5 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.I.h(byte[], java.lang.String):boolean");
    }

    public void i(byte[] bArr) {
        this.f25189b.closeSession(bArr);
    }

    public byte[] j(byte[] bArr, byte[] bArr2) {
        if (C1973h.f19974c.equals(this.f25188a)) {
            bArr2 = C2397a.b(bArr2);
        }
        return this.f25189b.provideKeyResponse(bArr, bArr2);
    }

    public C2390A.a k(byte[] bArr, List list, int i10, HashMap hashMap) {
        C1979n.b bVar;
        String str;
        byte[] bArr2;
        int i11;
        if (list != null) {
            bVar = y(this.f25188a, list);
            bArr2 = s(this.f25188a, (byte[]) C2076a.e(bVar.f20020e));
            str = t(this.f25188a, bVar.f20019d);
        } else {
            bVar = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f25189b.getKeyRequest(bArr, bArr2, str, i10, hashMap);
        byte[] r10 = r(this.f25188a, keyRequest.getData());
        String q10 = q(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(q10) && bVar != null && !TextUtils.isEmpty(bVar.f20018c)) {
            q10 = bVar.f20018c;
        }
        if (L.f22072a >= 23) {
            i11 = keyRequest.getRequestType();
        } else {
            i11 = Integer.MIN_VALUE;
        }
        return new C2390A.a(r10, q10, i11);
    }

    public void l(byte[] bArr, u1 u1Var) {
        if (L.f22072a >= 31) {
            try {
                a.b(this.f25189b, bArr, u1Var);
            } catch (UnsupportedOperationException unused) {
                p.h("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    public void m(C2390A.b bVar) {
        C2393D d10;
        MediaDrm mediaDrm = this.f25189b;
        if (bVar == null) {
            d10 = null;
        } else {
            d10 = new C2393D(this, bVar);
        }
        mediaDrm.setOnEventListener(d10);
    }

    public synchronized void release() {
        int i10 = this.f25190c - 1;
        this.f25190c = i10;
        if (i10 == 0) {
            this.f25189b.release();
        }
    }

    /* renamed from: v */
    public C2391B g(byte[] bArr) {
        return new C2391B(u(this.f25188a), bArr, E());
    }

    public String x(String str) {
        return this.f25189b.getPropertyString(str);
    }
}
