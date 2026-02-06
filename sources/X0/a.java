package X0;

import Y0.q;
import Y0.r;
import android.os.LocaleList;
import android.util.Log;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.C6496s;

public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    private LocaleList f9562a;

    /* renamed from: b  reason: collision with root package name */
    private e f9563b;

    /* renamed from: c  reason: collision with root package name */
    private final r f9564c = q.a();

    public e b() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.f9564c) {
            e eVar = this.f9563b;
            if (eVar != null && localeList == this.f9562a) {
                return eVar;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new d(localeList.get(i10)));
            }
            e eVar2 = new e(arrayList);
            this.f9562a = localeList;
            this.f9563b = eVar2;
            return eVar2;
        }
    }

    public Locale c(String str) {
        Locale forLanguageTag = Locale.forLanguageTag(str);
        if (C6496s.c(forLanguageTag.toLanguageTag(), "und")) {
            String a10 = b.f9565a;
            Log.e(a10, "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return forLanguageTag;
    }
}
