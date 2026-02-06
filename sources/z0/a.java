package Z0;

import X0.d;
import X0.e;
import Y0.g;
import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import mf.C6565s;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f10383a = new a();

    private a() {
    }

    public final Object a(e eVar) {
        ArrayList arrayList = new ArrayList(C6565s.y(eVar, 10));
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) it.next()).a());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(g gVar, e eVar) {
        ArrayList arrayList = new ArrayList(C6565s.y(eVar, 10));
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) it.next()).a());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        gVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
