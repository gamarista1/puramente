package com.facebook.react.views.image;

import M5.d;
import M5.f;
import android.graphics.Bitmap;
import i7.C3595d;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import yf.C6798l;

public final class e implements C3595d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f41878b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final List f41879a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3595d a(List list) {
            C6496s.h(list, "postprocessors");
            int size = list.size();
            if (size == 0) {
                return null;
            }
            if (size != 1) {
                return new e(list, (DefaultConstructorMarker) null);
            }
            return (C3595d) list.get(0);
        }

        private a() {
        }
    }

    public /* synthetic */ e(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    public d a() {
        Iterable<C3595d> iterable = this.f41879a;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (C3595d a10 : iterable) {
            arrayList.add(a10.a());
        }
        return new f(arrayList);
    }

    public X5.a b(Bitmap bitmap, U6.d dVar) {
        Bitmap bitmap2;
        C6496s.h(bitmap, "sourceBitmap");
        C6496s.h(dVar, "bitmapFactory");
        X5.a aVar = null;
        try {
            X5.a aVar2 = null;
            for (C3595d dVar2 : this.f41879a) {
                if (aVar2 != null) {
                    bitmap2 = (Bitmap) aVar2.I();
                    if (bitmap2 != null) {
                        aVar = dVar2.b(bitmap2, dVar);
                        X5.a.E(aVar2);
                        aVar2 = aVar.o();
                    }
                }
                bitmap2 = bitmap;
                aVar = dVar2.b(bitmap2, dVar);
                X5.a.E(aVar2);
                aVar2 = aVar.o();
            }
            if (aVar != null) {
                X5.a o10 = aVar.o();
                C6496s.g(o10, "clone(...)");
                X5.a.E(aVar);
                return o10;
            }
            throw new IllegalStateException(("MultiPostprocessor returned null bitmap - Number of Postprocessors: " + this.f41879a.size()).toString());
        } catch (Throwable th2) {
            X5.a.E(aVar);
            throw th2;
        }
    }

    public String getName() {
        String x02 = C6565s.x0(this.f41879a, com.amazon.a.a.o.b.f.f37529a, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null);
        return "MultiPostProcessor (" + x02 + ")";
    }

    private e(List list) {
        this.f41879a = new LinkedList(list);
    }
}
