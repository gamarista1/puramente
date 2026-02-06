package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import zf.C6828a;

public final class Q {

    /* renamed from: a  reason: collision with root package name */
    public static final Q f40301a = new Q();

    public static final class a implements Iterable, C6828a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f40302a;

        public a(List list) {
            this.f40302a = list;
        }

        public Iterator iterator() {
            return new b(this.f40302a);
        }
    }

    public static final class b implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private int f40303a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f40304b;

        b(List list) {
            this.f40304b = list;
        }

        /* renamed from: a */
        public ModuleHolder next() {
            List list = this.f40304b;
            int i10 = this.f40303a;
            this.f40303a = i10 + 1;
            return new ModuleHolder((NativeModule) list.get(i10));
        }

        public boolean hasNext() {
            if (this.f40303a < this.f40304b.size()) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private Q() {
    }

    public final Iterable a(P p10, ReactApplicationContext reactApplicationContext) {
        C6496s.h(p10, "reactPackage");
        C6496s.h(reactApplicationContext, "reactApplicationContext");
        String simpleName = p10.getClass().getSimpleName();
        U5.a.b("ReactNative", simpleName + " is not a LazyReactPackage, falling back to old version.");
        return new a(p10.createNativeModules(reactApplicationContext));
    }
}
