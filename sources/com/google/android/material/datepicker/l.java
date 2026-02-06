package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

public final class l<S> extends q {

    /* renamed from: b  reason: collision with root package name */
    private int f55902b;

    /* renamed from: c  reason: collision with root package name */
    private e f55903c;

    /* renamed from: d  reason: collision with root package name */
    private a f55904d;

    class a extends p {
        a() {
        }

        public void a() {
            Iterator it = l.this.f55927a.iterator();
            while (it.hasNext()) {
                ((p) it.next()).a();
            }
        }

        public void b(Object obj) {
            Iterator it = l.this.f55927a.iterator();
            while (it.hasNext()) {
                ((p) it.next()).b(obj);
            }
        }
    }

    static l E(e eVar, int i10, a aVar) {
        l lVar = new l();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("DATE_SELECTOR_KEY", eVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        lVar.setArguments(bundle);
        return lVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f55902b = bundle.getInt("THEME_RES_ID_KEY");
        this.f55903c = (e) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f55904d = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f55903c.Z(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f55902b)), viewGroup, bundle, this.f55904d, new a());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f55902b);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f55903c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f55904d);
    }
}
