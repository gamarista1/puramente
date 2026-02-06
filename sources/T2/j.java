package T2;

import N2.a;
import N2.e;
import N2.i;
import N2.k;
import N2.n;
import com.google.common.collect.C4770v;
import com.reactnativecommunity.clipboard.ClipboardModule;
import f2.s;
import f2.z;
import i2.C2073A;
import i2.p;
import j2.C2122a;
import z2.B;

abstract class j {
    private static e a(int i10, C2073A a10) {
        int q10 = a10.q();
        if (a10.q() == 1684108385) {
            a10.V(8);
            String C10 = a10.C(q10 - 16);
            return new e("und", C10, C10);
        }
        p.h("MetadataUtil", "Failed to parse comment attribute: " + a.a(i10));
        return null;
    }

    private static a b(C2073A a10) {
        String str;
        int q10 = a10.q();
        if (a10.q() == 1684108385) {
            int b10 = a.b(a10.q());
            if (b10 == 13) {
                str = ClipboardModule.MIMETYPE_JPEG;
            } else if (b10 == 14) {
                str = ClipboardModule.MIMETYPE_PNG;
            } else {
                str = null;
            }
            if (str == null) {
                p.h("MetadataUtil", "Unrecognized cover art flags: " + b10);
                return null;
            }
            a10.V(4);
            int i10 = q10 - 16;
            byte[] bArr = new byte[i10];
            a10.l(bArr, 0, i10);
            return new a(str, (String) null, 3, bArr);
        }
        p.h("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static z.b c(C2073A a10) {
        int f10 = a10.f() + a10.q();
        int q10 = a10.q();
        int i10 = (q10 >> 24) & 255;
        if (i10 == 169 || i10 == 253) {
            int i11 = 16777215 & q10;
            if (i11 == 6516084) {
                e a11 = a(q10, a10);
                a10.U(f10);
                return a11;
            } else if (i11 == 7233901 || i11 == 7631467) {
                n j10 = j(q10, "TIT2", a10);
                a10.U(f10);
                return j10;
            } else if (i11 == 6516589 || i11 == 7828084) {
                n j11 = j(q10, "TCOM", a10);
                a10.U(f10);
                return j11;
            } else if (i11 == 6578553) {
                n j12 = j(q10, "TDRC", a10);
                a10.U(f10);
                return j12;
            } else if (i11 == 4280916) {
                n j13 = j(q10, "TPE1", a10);
                a10.U(f10);
                return j13;
            } else if (i11 == 7630703) {
                n j14 = j(q10, "TSSE", a10);
                a10.U(f10);
                return j14;
            } else if (i11 == 6384738) {
                n j15 = j(q10, "TALB", a10);
                a10.U(f10);
                return j15;
            } else if (i11 == 7108978) {
                n j16 = j(q10, "USLT", a10);
                a10.U(f10);
                return j16;
            } else if (i11 == 6776174) {
                n j17 = j(q10, "TCON", a10);
                a10.U(f10);
                return j17;
            } else if (i11 == 6779504) {
                n j18 = j(q10, "TIT1", a10);
                a10.U(f10);
                return j18;
            }
        } else if (q10 == 1735291493) {
            try {
                return i(a10);
            } finally {
                a10.U(f10);
            }
        } else if (q10 == 1684632427) {
            n d10 = d(q10, "TPOS", a10);
            a10.U(f10);
            return d10;
        } else if (q10 == 1953655662) {
            n d11 = d(q10, "TRCK", a10);
            a10.U(f10);
            return d11;
        } else if (q10 == 1953329263) {
            i f11 = f(q10, "TBPM", a10, true, false);
            a10.U(f10);
            return f11;
        } else if (q10 == 1668311404) {
            i f12 = f(q10, "TCMP", a10, true, true);
            a10.U(f10);
            return f12;
        } else if (q10 == 1668249202) {
            a b10 = b(a10);
            a10.U(f10);
            return b10;
        } else if (q10 == 1631670868) {
            n j19 = j(q10, "TPE2", a10);
            a10.U(f10);
            return j19;
        } else if (q10 == 1936682605) {
            n j20 = j(q10, "TSOT", a10);
            a10.U(f10);
            return j20;
        } else if (q10 == 1936679276) {
            n j21 = j(q10, "TSOA", a10);
            a10.U(f10);
            return j21;
        } else if (q10 == 1936679282) {
            n j22 = j(q10, "TSOP", a10);
            a10.U(f10);
            return j22;
        } else if (q10 == 1936679265) {
            n j23 = j(q10, "TSO2", a10);
            a10.U(f10);
            return j23;
        } else if (q10 == 1936679791) {
            n j24 = j(q10, "TSOC", a10);
            a10.U(f10);
            return j24;
        } else if (q10 == 1920233063) {
            i f13 = f(q10, "ITUNESADVISORY", a10, false, false);
            a10.U(f10);
            return f13;
        } else if (q10 == 1885823344) {
            i f14 = f(q10, "ITUNESGAPLESS", a10, false, true);
            a10.U(f10);
            return f14;
        } else if (q10 == 1936683886) {
            n j25 = j(q10, "TVSHOWSORT", a10);
            a10.U(f10);
            return j25;
        } else if (q10 == 1953919848) {
            n j26 = j(q10, "TVSHOW", a10);
            a10.U(f10);
            return j26;
        } else if (q10 == 757935405) {
            i g10 = g(a10, f10);
            a10.U(f10);
            return g10;
        }
        p.b("MetadataUtil", "Skipped unknown metadata entry: " + a.a(q10));
        a10.U(f10);
        return null;
    }

    private static n d(int i10, String str, C2073A a10) {
        int q10 = a10.q();
        if (a10.q() == 1684108385 && q10 >= 22) {
            a10.V(10);
            int N10 = a10.N();
            if (N10 > 0) {
                String str2 = "" + N10;
                int N11 = a10.N();
                if (N11 > 0) {
                    str2 = str2 + "/" + N11;
                }
                return new n(str, (String) null, C4770v.H(str2));
            }
        }
        p.h("MetadataUtil", "Failed to parse index/count attribute: " + a.a(i10));
        return null;
    }

    private static int e(C2073A a10) {
        int q10 = a10.q();
        if (a10.q() == 1684108385) {
            a10.V(8);
            int i10 = q10 - 16;
            if (i10 == 1) {
                return a10.H();
            }
            if (i10 == 2) {
                return a10.N();
            }
            if (i10 == 3) {
                return a10.K();
            }
            if (i10 == 4 && (a10.j() & 128) == 0) {
                return a10.L();
            }
        }
        p.h("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static i f(int i10, String str, C2073A a10, boolean z10, boolean z11) {
        int e10 = e(a10);
        if (z11) {
            e10 = Math.min(1, e10);
        }
        if (e10 < 0) {
            p.h("MetadataUtil", "Failed to parse uint8 attribute: " + a.a(i10));
            return null;
        } else if (z10) {
            return new n(str, (String) null, C4770v.H(Integer.toString(e10)));
        } else {
            return new e("und", str, Integer.toString(e10));
        }
    }

    private static i g(C2073A a10, int i10) {
        String str = null;
        String str2 = null;
        int i11 = -1;
        int i12 = -1;
        while (a10.f() < i10) {
            int f10 = a10.f();
            int q10 = a10.q();
            int q11 = a10.q();
            a10.V(4);
            if (q11 == 1835360622) {
                str = a10.C(q10 - 12);
            } else if (q11 == 1851878757) {
                str2 = a10.C(q10 - 12);
            } else {
                if (q11 == 1684108385) {
                    i11 = f10;
                    i12 = q10;
                }
                a10.V(q10 - 12);
            }
        }
        if (str == null || str2 == null || i11 == -1) {
            return null;
        }
        a10.U(i11);
        a10.V(16);
        return new k(str, str2, a10.C(i12 - 16));
    }

    public static C2122a h(C2073A a10, int i10, String str) {
        while (true) {
            int f10 = a10.f();
            if (f10 >= i10) {
                return null;
            }
            int q10 = a10.q();
            if (a10.q() == 1684108385) {
                int q11 = a10.q();
                int q12 = a10.q();
                int i11 = q10 - 16;
                byte[] bArr = new byte[i11];
                a10.l(bArr, 0, i11);
                return new C2122a(str, bArr, q12, q11);
            }
            a10.U(f10 + q10);
        }
    }

    private static n i(C2073A a10) {
        String a11 = N2.j.a(e(a10) - 1);
        if (a11 != null) {
            return new n("TCON", (String) null, C4770v.H(a11));
        }
        p.h("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    private static n j(int i10, String str, C2073A a10) {
        int q10 = a10.q();
        if (a10.q() == 1684108385) {
            a10.V(8);
            return new n(str, (String) null, C4770v.H(a10.C(q10 - 16)));
        }
        p.h("MetadataUtil", "Failed to parse text attribute: " + a.a(i10));
        return null;
    }

    public static void k(int i10, B b10, s.b bVar) {
        if (i10 == 1 && b10.a()) {
            bVar.V(b10.f29073a).W(b10.f29074b);
        }
    }

    public static void l(int i10, z zVar, s.b bVar, z... zVarArr) {
        z zVar2 = new z(new z.b[0]);
        if (zVar != null) {
            for (int i11 = 0; i11 < zVar.e(); i11++) {
                z.b d10 = zVar.d(i11);
                if (d10 instanceof C2122a) {
                    C2122a aVar = (C2122a) d10;
                    if (!aVar.f22696a.equals("com.android.capture.fps")) {
                        zVar2 = zVar2.a(aVar);
                    } else if (i10 == 2) {
                        zVar2 = zVar2.a(aVar);
                    }
                }
            }
        }
        for (z b10 : zVarArr) {
            zVar2 = zVar2.b(b10);
        }
        if (zVar2.e() > 0) {
            bVar.h0(zVar2);
        }
    }
}
