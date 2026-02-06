package v9;

import com.google.common.collect.C4770v;
import com.reactnativecommunity.clipboard.ClipboardModule;
import ja.N;
import ja.s;
import java.io.StringReader;
import k9.L0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import v9.C4115b;

abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f48988a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f48989b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f48990c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static C4115b a(String str) {
        try {
            return b(str);
        } catch (NumberFormatException | L0 | XmlPullParserException unused) {
            s.i("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static C4115b b(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (N.f(newPullParser, "x:xmpmeta")) {
            C4770v E10 = C4770v.E();
            long j10 = -9223372036854775807L;
            do {
                newPullParser.next();
                if (N.f(newPullParser, "rdf:Description")) {
                    if (!d(newPullParser)) {
                        return null;
                    }
                    j10 = e(newPullParser);
                    E10 = c(newPullParser);
                } else if (N.f(newPullParser, "Container:Directory")) {
                    E10 = f(newPullParser, "Container", "Item");
                } else if (N.f(newPullParser, "GContainer:Directory")) {
                    E10 = f(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!N.d(newPullParser, "x:xmpmeta"));
            if (E10.isEmpty()) {
                return null;
            }
            return new C4115b(j10, E10);
        }
        throw L0.a("Couldn't find xmp metadata", (Throwable) null);
    }

    private static C4770v c(XmlPullParser xmlPullParser) {
        for (String a10 : f48990c) {
            String a11 = N.a(xmlPullParser, a10);
            if (a11 != null) {
                return C4770v.I(new C4115b.a(ClipboardModule.MIMETYPE_JPEG, "Primary", 0, 0), new C4115b.a("video/mp4", "MotionPhoto", Long.parseLong(a11), 0));
            }
        }
        return C4770v.E();
    }

    private static boolean d(XmlPullParser xmlPullParser) {
        String[] strArr = f48988a;
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String a10 = N.a(xmlPullParser, strArr[i10]);
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
        for (String a10 : f48989b) {
            String a11 = N.a(xmlPullParser, a10);
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
            if (N.f(xmlPullParser, str3)) {
                String a10 = N.a(xmlPullParser, str2 + ":Mime");
                String a11 = N.a(xmlPullParser, str2 + ":Semantic");
                String a12 = N.a(xmlPullParser, str2 + ":Length");
                String a13 = N.a(xmlPullParser, str2 + ":Padding");
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
                t10.a(new C4115b.a(a10, a11, j10, j11));
            }
        } while (!N.d(xmlPullParser, str4));
        return t10.k();
    }
}
