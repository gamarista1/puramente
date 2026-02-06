package Q0;

import java.util.List;
import mf.C6565s;
import yf.C6798l;

/* renamed from: Q0.n  reason: case insensitive filesystem */
public abstract class C1331n {
    public static final int a(List list, int i10) {
        char c10;
        int b10 = ((C1334q) C6565s.z0(list)).b();
        if (i10 <= ((C1334q) C6565s.z0(list)).b()) {
            int size = list.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                C1334q qVar = (C1334q) list.get(i12);
                if (qVar.f() > i10) {
                    c10 = 1;
                } else if (qVar.b() <= i10) {
                    c10 = 65535;
                } else {
                    c10 = 0;
                }
                if (c10 < 0) {
                    i11 = i12 + 1;
                } else if (c10 <= 0) {
                    return i12;
                } else {
                    size = i12 - 1;
                }
            }
            return -(i11 + 1);
        }
        throw new IllegalArgumentException(("Index " + i10 + " should be less or equal than last line's end " + b10).toString());
    }

    public static final int b(List list, int i10) {
        char c10;
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            C1334q qVar = (C1334q) list.get(i12);
            if (qVar.g() > i10) {
                c10 = 1;
            } else if (qVar.c() <= i10) {
                c10 = 65535;
            } else {
                c10 = 0;
            }
            if (c10 < 0) {
                i11 = i12 + 1;
            } else if (c10 <= 0) {
                return i12;
            } else {
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int c(List list, float f10) {
        char c10;
        if (f10 <= 0.0f) {
            return 0;
        }
        if (f10 >= ((C1334q) C6565s.z0(list)).a()) {
            return C6565s.p(list);
        }
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            C1334q qVar = (C1334q) list.get(i11);
            if (qVar.h() > f10) {
                c10 = 1;
            } else if (qVar.a() <= f10) {
                c10 = 65535;
            } else {
                c10 = 0;
            }
            if (c10 < 0) {
                i10 = i11 + 1;
            } else if (c10 <= 0) {
                return i11;
            } else {
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final void d(List list, long j10, C6798l lVar) {
        int a10 = a(list, Q.l(j10));
        int size = list.size();
        while (a10 < size) {
            C1334q qVar = (C1334q) list.get(a10);
            if (qVar.f() < Q.k(j10)) {
                if (qVar.f() != qVar.b()) {
                    lVar.invoke(qVar);
                }
                a10++;
            } else {
                return;
            }
        }
    }
}
