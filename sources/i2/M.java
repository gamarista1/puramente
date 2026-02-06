package i2;

import org.xmlpull.v1.XmlPullParser;

public abstract class M {
    public static String a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static boolean b(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 3) {
            return true;
        }
        return false;
    }

    public static boolean c(XmlPullParser xmlPullParser, String str) {
        if (!b(xmlPullParser) || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean d(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            return true;
        }
        return false;
    }

    public static boolean e(XmlPullParser xmlPullParser, String str) {
        if (!d(xmlPullParser) || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }
}
