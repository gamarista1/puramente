package com.facebook.react.devsupport;

import Gh.C5404e;
import Gh.C5406g;
import Gh.C5407h;
import com.revenuecat.purchases.common.Constants;
import java.util.HashMap;
import java.util.Map;

class X {

    /* renamed from: a  reason: collision with root package name */
    private final C5406g f40752a;

    /* renamed from: b  reason: collision with root package name */
    private final String f40753b;

    /* renamed from: c  reason: collision with root package name */
    private long f40754c;

    public interface a {
        void a(Map map, long j10, long j11);

        void b(Map map, C5404e eVar, boolean z10);
    }

    public X(C5406g gVar, String str) {
        this.f40752a = gVar;
        this.f40753b = str;
    }

    private void a(C5404e eVar, boolean z10, a aVar) {
        C5407h f10 = C5407h.f("\r\n\r\n");
        long N02 = eVar.N0(f10);
        if (N02 == -1) {
            aVar.b((Map) null, eVar, z10);
            return;
        }
        C5404e eVar2 = new C5404e();
        C5404e eVar3 = new C5404e();
        eVar.y1(eVar2, N02);
        eVar.skip((long) f10.O());
        eVar.d0(eVar3);
        aVar.b(c(eVar2), eVar3, z10);
    }

    private void b(Map map, long j10, boolean z10, a aVar) {
        long j11;
        if (map != null && aVar != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f40754c > 16 || z10) {
                this.f40754c = currentTimeMillis;
                if (map.get("Content-Length") != null) {
                    j11 = Long.parseLong((String) map.get("Content-Length"));
                } else {
                    j11 = 0;
                }
                aVar.a(map, j10, j11);
            }
        }
    }

    private Map c(C5404e eVar) {
        HashMap hashMap = new HashMap();
        for (String str : eVar.p1().split("\r\n")) {
            int indexOf = str.indexOf(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
            if (indexOf != -1) {
                hashMap.put(str.substring(0, indexOf).trim(), str.substring(indexOf + 1).trim());
            }
        }
        return hashMap;
    }

    public boolean d(a aVar) {
        boolean z10;
        long j10;
        C5407h f10 = C5407h.f("\r\n--" + this.f40753b + "\r\n");
        C5407h f11 = C5407h.f("\r\n--" + this.f40753b + "--" + "\r\n");
        C5407h f12 = C5407h.f("\r\n\r\n");
        C5404e eVar = new C5404e();
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        Map map = null;
        while (true) {
            long max = Math.max(j11 - ((long) f11.O()), j12);
            long T10 = eVar.T(f10, max);
            if (T10 == -1) {
                T10 = eVar.T(f11, max);
                z10 = true;
            } else {
                z10 = false;
            }
            if (T10 == -1) {
                long B02 = eVar.B0();
                if (map == null) {
                    long T11 = eVar.T(f12, max);
                    if (T11 >= 0) {
                        this.f40752a.y1(eVar, T11);
                        C5404e eVar2 = new C5404e();
                        j10 = j12;
                        eVar.y(eVar2, max, T11 - max);
                        j13 = eVar2.B0() + ((long) f12.O());
                        map = c(eVar2);
                    } else {
                        j10 = j12;
                    }
                } else {
                    j10 = j12;
                    b(map, eVar.B0() - j13, false, aVar);
                }
                if (this.f40752a.y1(eVar, (long) 4096) <= 0) {
                    return false;
                }
                j11 = B02;
                j12 = j10;
            } else {
                long j14 = j12;
                long j15 = T10 - j14;
                if (j14 > 0) {
                    C5404e eVar3 = new C5404e();
                    eVar.skip(j14);
                    eVar.y1(eVar3, j15);
                    b(map, eVar3.B0() - j13, true, aVar);
                    a(eVar3, z10, aVar);
                    j13 = 0;
                    map = null;
                } else {
                    a aVar2 = aVar;
                    eVar.skip(T10);
                }
                if (z10) {
                    return true;
                }
                j12 = (long) f10.O();
                j11 = j12;
            }
        }
    }
}
