package ja;

import org.xmlpull.v1.XmlPullParser;

public abstract class N {
    public static String a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static String b(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (h(xmlPullParser.getAttributeName(i10)).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static boolean c(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 3) {
            return true;
        }
        return false;
    }

    public static boolean d(XmlPullParser xmlPullParser, String str) {
        if (!c(xmlPullParser) || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean e(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            return true;
        }
        return false;
    }

    public static boolean f(XmlPullParser xmlPullParser, String str) {
        if (!e(xmlPullParser) || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean g(XmlPullParser xmlPullParser, String str) {
        if (!e(xmlPullParser) || !h(xmlPullParser.getName()).equals(str)) {
            return false;
        }
        return true;
    }

    private static String h(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf == -1) {
            return str;
        }
        return str.substring(indexOf + 1);
    }
}
