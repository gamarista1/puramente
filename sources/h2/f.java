package H2;

import H2.c;
import com.google.common.collect.C4770v;
import com.reactnativecommunity.clipboard.ClipboardModule;
import f2.C1961B;
import i2.M;
import i2.p;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

abstract class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f2660a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f2661b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f2662c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static c a(String str) {
        try {
            return b(str);
        } catch (C1961B | NumberFormatException | XmlPullParserException unused) {
            p.h("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static c b(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (M.e(newPullParser, "x:xmpmeta")) {
            C4770v E10 = C4770v.E();
            long j10 = -9223372036854775807L;
            do {
                newPullParser.next();
                if (M.e(newPullParser, "rdf:Description")) {
                    if (!d(newPullParser)) {
                        return null;
                    }
                    j10 = e(newPullParser);
                    E10 = c(newPullParser);
                } else if (M.e(newPullParser, "Container:Directory")) {
                    E10 = f(newPullParser, "Container", "Item");
                } else if (M.e(newPullParser, "GContainer:Directory")) {
                    E10 = f(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!M.c(newPullParser, "x:xmpmeta"));
            if (E10.isEmpty()) {
                return null;
            }
            return new c(j10, E10);
        }
        throw C1961B.a("Couldn't find xmp metadata", (Throwable) null);
    }

    private static C4770v c(XmlPullParser xmlPullParser) {
        for (String a10 : f2662c) {
            String a11 = M.a(xmlPullParser, a10);
            if (a11 != null) {
                return C4770v.I(new c.a(ClipboardModule.MIMETYPE_JPEG, "Primary", 0, 0), new c.a("video/mp4", "MotionPhoto", Long.parseLong(a11), 0));
            }
        }
        return C4770v.E();
    }

    private static boolean d(XmlPullParser xmlPullParser) {
        String[] strArr = f2660a;
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String a10 = M.a(xmlPullParser, strArr[i10]);
            if (a10 == null) {
                i10++;
            } else if (Integer.parseInt(a10) == 1) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    private static long e(XmlPullParser xmlPullParser) {
        for (String a10 : f2661b) {
            String a11 = M.a(xmlPullParser, a10);
            if (a11 != null) {
                long parseLong = Long.parseLong(a11);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    private static C4770v f(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        long j11;
        C4770v.a t10 = C4770v.t();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (M.e(xmlPullParser, str3)) {
                String a10 = M.a(xmlPullParser, str2 + ":Mime");
                String a11 = M.a(xmlPullParser, str2 + ":Semantic");
                String a12 = M.a(xmlPullParser, str2 + ":Length");
                String a13 = M.a(xmlPullParser, str2 + ":Padding");
                if (a10 == null || a11 == null) {
                    return C4770v.E();
                }
                if (a12 != null) {
                    j10 = Long.parseLong(a12);
                } else {
                    j10 = 0;
                }
                if (a13 != null) {
                    j11 = Long.parseLong(a13);
                } else {
                    j11 = 0;
                }
                t10.a(new c.a(a10, a11, j10, j11));
            }
        } while (!M.c(xmlPullParser, str4));
        return t10.k();
    }
}
