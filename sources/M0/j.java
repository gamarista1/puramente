package M0;

import M0.d;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x0.C2891d;
import y0.C2927a;
import y0.C2929c;

public abstract class j {
    public static final d.a a(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i10) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        C2927a aVar = new C2927a(xmlResourceParser, 0, 2, (DefaultConstructorMarker) null);
        C2891d.a a10 = C2929c.a(aVar, resources, theme, asAttributeSet);
        int i11 = 0;
        while (!C2929c.d(xmlResourceParser)) {
            i11 = C2929c.g(aVar, resources, asAttributeSet, theme, a10, i11);
            xmlResourceParser.next();
        }
        return new d.a(a10.f(), i10);
    }
}
