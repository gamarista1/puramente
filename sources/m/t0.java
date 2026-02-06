package M;

import X0.d;
import X0.e;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    public static final t0 f4274a = new t0();

    private t0() {
    }

    public final void a(EditorInfo editorInfo, e eVar) {
        if (C6496s.c(eVar, e.f9568c.b())) {
            editorInfo.hintLocales = null;
            return;
        }
        ArrayList arrayList = new ArrayList(C6565s.y(eVar, 10));
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) it.next()).a());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
