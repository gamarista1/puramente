package com.google.android.material.datepicker;

import Ua.e;
import Ua.g;
import Ua.h;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.internal.n;
import com.google.android.material.textfield.TextInputLayout;
import fb.C4981b;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

public class r implements e {
    public static final Parcelable.Creator<r> CREATOR = new b();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Long f55928a;

    class a extends d {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p f55929g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, a aVar, p pVar) {
            super(str, dateFormat, textInputLayout, aVar);
            this.f55929g = pVar;
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f55929g.a();
        }

        /* access modifiers changed from: package-private */
        public void f(Long l10) {
            if (l10 == null) {
                r.this.c();
            } else {
                r.this.l0(l10.longValue());
            }
            this.f55929g.b(r.this.i0());
        }
    }

    class b implements Parcelable.Creator {
        b() {
        }

        /* renamed from: a */
        public r createFromParcel(Parcel parcel) {
            r rVar = new r();
            Long unused = rVar.f55928a = (Long) parcel.readValue(Long.class.getClassLoader());
            return rVar;
        }

        /* renamed from: b */
        public r[] newArray(int i10) {
            return new r[i10];
        }
    }

    /* access modifiers changed from: private */
    public void c() {
        this.f55928a = null;
    }

    public int A() {
        return h.f52903s;
    }

    public int C(Context context) {
        return C4981b.c(context, Ua.a.f52743u, j.class.getCanonicalName());
    }

    public String N(Context context) {
        Resources resources = context.getResources();
        Long l10 = this.f55928a;
        if (l10 == null) {
            return resources.getString(h.f52904t);
        }
        return resources.getString(h.f52902r, new Object[]{f.h(l10.longValue())});
    }

    public Collection Q() {
        return new ArrayList();
    }

    public View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, a aVar, p pVar) {
        View inflate = layoutInflater.inflate(g.f52876t, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(e.f52816L);
        EditText editText = textInputLayout.getEditText();
        if (com.google.android.material.internal.g.a()) {
            editText.setInputType(17);
        }
        SimpleDateFormat f10 = u.f();
        String g10 = u.g(inflate.getResources(), f10);
        textInputLayout.setPlaceholderText(g10);
        Long l10 = this.f55928a;
        if (l10 != null) {
            editText.setText(f10.format(l10));
        }
        editText.addTextChangedListener(new a(g10, f10, textInputLayout, aVar, pVar));
        n.h(editText);
        return inflate;
    }

    public boolean c0() {
        if (this.f55928a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public Long i0() {
        return this.f55928a;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public void R(Long l10) {
        Long l11;
        if (l10 == null) {
            l11 = null;
        } else {
            l11 = Long.valueOf(u.a(l10.longValue()));
        }
        this.f55928a = l11;
    }

    public Collection g0() {
        ArrayList arrayList = new ArrayList();
        Long l10 = this.f55928a;
        if (l10 != null) {
            arrayList.add(l10);
        }
        return arrayList;
    }

    public void l0(long j10) {
        this.f55928a = Long.valueOf(j10);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeValue(this.f55928a);
    }
}
