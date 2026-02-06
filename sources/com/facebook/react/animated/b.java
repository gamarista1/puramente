package com.facebook.react.animated;

import Sg.p;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import yf.C6798l;

public abstract class b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f40444e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public List f40445a;

    /* renamed from: b  reason: collision with root package name */
    public int f40446b;

    /* renamed from: c  reason: collision with root package name */
    public int f40447c;

    /* renamed from: d  reason: collision with root package name */
    public int f40448d = -1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final void b(b bVar) {
        C6496s.h(bVar, "child");
        List list = this.f40445a;
        if (list == null) {
            list = new ArrayList(1);
            this.f40445a = list;
        }
        list.add(bVar);
        bVar.c(this);
    }

    public void c(b bVar) {
        C6496s.h(bVar, "parent");
    }

    public void d(b bVar) {
        C6496s.h(bVar, "parent");
    }

    public abstract String e();

    public final String f() {
        String str;
        String str2;
        List list = this.f40445a;
        if (list != null) {
            str = C6565s.x0(list, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null);
        } else {
            str = null;
        }
        String e10 = e();
        if (str == null || p.d0(str)) {
            str2 = "";
        } else {
            str2 = " children: " + str;
        }
        return e10 + str2;
    }

    public final void g(b bVar) {
        C6496s.h(bVar, "child");
        List list = this.f40445a;
        if (list != null) {
            bVar.d(this);
            list.remove(bVar);
        }
    }

    public void h() {
    }
}
