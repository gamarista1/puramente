package io.intercom.android.sdk.api;

import android.content.Context;
import android.os.LocaleList;
import com.amazon.a.a.o.b.f;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"getUserLocaleString", "", "context", "Landroid/content/Context;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UserLocaleUtilKt {
    public static final String getUserLocaleString(Context context) {
        C6496s.h(context, "context");
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        C6496s.g(locales, "getLocales(...)");
        ArrayList arrayList = new ArrayList();
        int size = locales.size();
        for (int i10 = 0; i10 < size; i10++) {
            Locale locale = locales.get(i10);
            arrayList.add(locale.getLanguage() + '-' + locale.getCountry());
        }
        return C6565s.x0(arrayList, f.f37529a, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null);
    }
}
