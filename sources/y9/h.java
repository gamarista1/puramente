package y9;

import D9.a;
import I9.a;
import I9.e;
import I9.i;
import I9.j;
import I9.m;
import com.reactnativecommunity.clipboard.ClipboardModule;
import ja.B;
import ja.s;
import k9.C3717q0;
import q9.v;

abstract class h {

    /* renamed from: a  reason: collision with root package name */
    static final String[] f49981a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    private static e a(int i10, B b10) {
        int n10 = b10.n();
        if (b10.n() == 1684108385) {
            b10.Q(8);
            String y10 = b10.y(n10 - 16);
            return new e("und", y10, y10);
        }
        s.i("MetadataUtil", "Failed to parse comment attribute: " + C4227a.a(i10));
        return null;
    }

    private static a b(B b10) {
        String str;
        int n10 = b10.n();
        if (b10.n() == 1684108385) {
            int b11 = C4227a.b(b10.n());
            if (b11 == 13) {
                str = ClipboardModule.MIMETYPE_JPEG;
            } else if (b11 == 14) {
                str = ClipboardModule.MIMETYPE_PNG;
            } else {
                str = null;
            }
            if (str == null) {
                s.i("MetadataUtil", "Unrecognized cover art flags: " + b11);
                return null;
            }
            b10.Q(4);
            int i10 = n10 - 16;
            byte[] bArr = new byte[i10];
            b10.j(bArr, 0, i10);
            return new a(str, (String) null, 3, bArr);
        }
        s.i("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static a.b c(B b10) {
        int e10 = b10.e() + b10.n();
        int n10 = b10.n();
        int i10 = (n10 >> 24) & 255;
        if (i10 == 169 || i10 == 253) {
            int i11 = 16777215 & n10;
            if (i11 == 6516084) {
                e a10 = a(n10, b10);
                b10.P(e10);
                return a10;
            } else if (i11 == 7233901 || i11 == 7631467) {
                m h10 = h(n10, "TIT2", b10);
                b10.P(e10);
                return h10;
            } else if (i11 == 6516589 || i11 == 7828084) {
                m h11 = h(n10, "TCOM", b10);
                b10.P(e10);
                return h11;
            } else if (i11 == 6578553) {
                m h12 = h(n10, "TDRC", b10);
                b10.P(e10);
                return h12;
            } else if (i11 == 4280916) {
                m h13 = h(n10, "TPE1", b10);
                b10.P(e10);
                return h13;
            } else if (i11 == 7630703) {
                m h14 = h(n10, "TSSE", b10);
                b10.P(e10);
                return h14;
            } else if (i11 == 6384738) {
                m h15 = h(n10, "TALB", b10);
                b10.P(e10);
                return h15;
            } else if (i11 == 7108978) {
                m h16 = h(n10, "USLT", b10);
                b10.P(e10);
                return h16;
            } else if (i11 == 6776174) {
                m h17 = h(n10, "TCON", b10);
                b10.P(e10);
                return h17;
            } else if (i11 == 6779504) {
                m h18 = h(n10, "TIT1", b10);
                b10.P(e10);
                return h18;
            }
        } else if (n10 == 1735291493) {
            try {
                return g(b10);
            } finally {
                b10.P(e10);
            }
        } else if (n10 == 1684632427) {
            m d10 = d(n10, "TPOS", b10);
            b10.P(e10);
            return d10;
        } else if (n10 == 1953655662) {
            m d11 = d(n10, "TRCK", b10);
            b10.P(e10);
            return d11;
        } else if (n10 == 1953329263) {
            i i12 = i(n10, "TBPM", b10, true, false);
            b10.P(e10);
            return i12;
        } else if (n10 == 1668311404) {
            i i13 = i(n10, "TCMP", b10, true, true);
            b10.P(e10);
            return i13;
        } else if (n10 == 1668249202) {
            I9.a b11 = b(b10);
            b10.P(e10);
            return b11;
        } else if (n10 == 1631670868) {
            m h19 = h(n10, "TPE2", b10);
            b10.P(e10);
            return h19;
        } else if (n10 == 1936682605) {
            m h20 = h(n10, "TSOT", b10);
            b10.P(e10);
            return h20;
        } else if (n10 == 1936679276) {
            m h21 = h(n10, "TSO2", b10);
            b10.P(e10);
            return h21;
        } else if (n10 == 1936679282) {
            m h22 = h(n10, "TSOA", b10);
            b10.P(e10);
            return h22;
        } else if (n10 == 1936679265) {
            m h23 = h(n10, "TSOP", b10);
            b10.P(e10);
            return h23;
        } else if (n10 == 1936679791) {
            m h24 = h(n10, "TSOC", b10);
            b10.P(e10);
            return h24;
        } else if (n10 == 1920233063) {
            i i14 = i(n10, "ITUNESADVISORY", b10, false, false);
            b10.P(e10);
            return i14;
        } else if (n10 == 1885823344) {
            i i15 = i(n10, "ITUNESGAPLESS", b10, false, true);
            b10.P(e10);
            return i15;
        } else if (n10 == 1936683886) {
            m h25 = h(n10, "TVSHOWSORT", b10);
            b10.P(e10);
            return h25;
        } else if (n10 == 1953919848) {
            m h26 = h(n10, "TVSHOW", b10);
            b10.P(e10);
            return h26;
        } else if (n10 == 757935405) {
            i e11 = e(b10, e10);
            b10.P(e10);
            return e11;
        }
        s.b("MetadataUtil", "Skipped unknown metadata entry: " + C4227a.a(n10));
        b10.P(e10);
        return null;
    }

    private static m d(int i10, String str, B b10) {
        int n10 = b10.n();
        if (b10.n() == 1684108385 && n10 >= 22) {
            b10.Q(10);
            int J10 = b10.J();
            if (J10 > 0) {
                String str2 = "" + J10;
                int J11 = b10.J();
                if (J11 > 0) {
                    str2 = str2 + "/" + J11;
                }
                return new m(str, (String) null, str2);
            }
        }
        s.i("MetadataUtil", "Failed to parse index/count attribute: " + C4227a.a(i10));
        return null;
    }

    private static i e(B b10, int i10) {
        String str = null;
        String str2 = null;
        int i11 = -1;
        int i12 = -1;
        while (b10.e() < i10) {
            int e10 = b10.e();
            int n10 = b10.n();
            int n11 = b10.n();
            b10.Q(4);
            if (n11 == 1835360622) {
                str = b10.y(n10 - 12);
            } else if (n11 == 1851878757) {
                str2 = b10.y(n10 - 12);
            } else {
                if (n11 == 1684108385) {
                    i11 = e10;
                    i12 = n10;
                }
                b10.Q(n10 - 12);
            }
        }
        if (str == null || str2 == null || i11 == -1) {
            return null;
        }
        b10.P(i11);
        b10.Q(16);
        return new j(str, str2, b10.y(i12 - 16));
    }

    public static J9.a f(B b10, int i10, String str) {
        while (true) {
            int e10 = b10.e();
            if (e10 >= i10) {
                return null;
            }
            int n10 = b10.n();
            if (b10.n() == 1684108385) {
                int n11 = b10.n();
                int n12 = b10.n();
                int i11 = n10 - 16;
                byte[] bArr = new byte[i11];
                b10.j(bArr, 0, i11);
                return new J9.a(str, bArr, n12, n11);
            }
            b10.P(e10 + n10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static I9.m g(ja.B r3) {
        /*
            int r3 = j(r3)
            r0 = 0
            if (r3 <= 0) goto L_0x0011
            java.lang.String[] r1 = f49981a
            int r2 = r1.length
            if (r3 > r2) goto L_0x0011
            int r3 = r3 + -1
            r3 = r1[r3]
            goto L_0x0012
        L_0x0011:
            r3 = r0
        L_0x0012:
            if (r3 == 0) goto L_0x001c
            I9.m r1 = new I9.m
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L_0x001c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            ja.s.i(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.h.g(ja.B):I9.m");
    }

    private static m h(int i10, String str, B b10) {
        int n10 = b10.n();
        if (b10.n() == 1684108385) {
            b10.Q(8);
            return new m(str, (String) null, b10.y(n10 - 16));
        }
        s.i("MetadataUtil", "Failed to parse text attribute: " + C4227a.a(i10));
        return null;
    }

    private static i i(int i10, String str, B b10, boolean z10, boolean z11) {
        int j10 = j(b10);
        if (z11) {
            j10 = Math.min(1, j10);
        }
        if (j10 < 0) {
            s.i("MetadataUtil", "Failed to parse uint8 attribute: " + C4227a.a(i10));
            return null;
        } else if (z10) {
            return new m(str, (String) null, Integer.toString(j10));
        } else {
            return new e("und", str, Integer.toString(j10));
        }
    }

    private static int j(B b10) {
        b10.Q(4);
        if (b10.n() == 1684108385) {
            b10.Q(8);
            return b10.D();
        }
        s.i("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static void k(int i10, v vVar, C3717q0.b bVar) {
        if (i10 == 1 && vVar.a()) {
            bVar.N(vVar.f47912a).O(vVar.f47913b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        if (r6 != null) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f A[LOOP:1: B:17:0x003d->B:18:0x003f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void l(int r5, D9.a r6, D9.a r7, k9.C3717q0.b r8, D9.a... r9) {
        /*
            D9.a r0 = new D9.a
            r1 = 0
            D9.a$b[] r2 = new D9.a.b[r1]
            r0.<init>((D9.a.b[]) r2)
            r2 = 1
            if (r5 != r2) goto L_0x000e
            if (r6 == 0) goto L_0x003b
            goto L_0x003c
        L_0x000e:
            r6 = 2
            if (r5 != r6) goto L_0x003b
            if (r7 == 0) goto L_0x003b
            r5 = r1
        L_0x0014:
            int r6 = r7.d()
            if (r5 >= r6) goto L_0x003b
            D9.a$b r6 = r7.c(r5)
            boolean r3 = r6 instanceof J9.a
            if (r3 == 0) goto L_0x0039
            J9.a r6 = (J9.a) r6
            java.lang.String r3 = r6.f32212a
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0039
            D9.a r5 = new D9.a
            D9.a$b[] r7 = new D9.a.b[r2]
            r7[r1] = r6
            r5.<init>((D9.a.b[]) r7)
            r6 = r5
            goto L_0x003c
        L_0x0039:
            int r5 = r5 + r2
            goto L_0x0014
        L_0x003b:
            r6 = r0
        L_0x003c:
            int r5 = r9.length
        L_0x003d:
            if (r1 >= r5) goto L_0x0047
            r7 = r9[r1]
            D9.a r6 = r6.b(r7)
            int r1 = r1 + r2
            goto L_0x003d
        L_0x0047:
            int r5 = r6.d()
            if (r5 <= 0) goto L_0x0050
            r8.X(r6)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.h.l(int, D9.a, D9.a, k9.q0$b, D9.a[]):void");
    }
}
