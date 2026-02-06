package com.facebook.react;

import R7.a;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.inject.Provider;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import zf.C6828a;

/* renamed from: com.facebook.react.a  reason: case insensitive filesystem */
public abstract class C3328a implements P {

    /* renamed from: com.facebook.react.a$a  reason: collision with other inner class name */
    private final class C0635a implements Provider {

        /* renamed from: a  reason: collision with root package name */
        private final String f40335a;

        /* renamed from: b  reason: collision with root package name */
        private final ReactApplicationContext f40336b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C3328a f40337c;

        public C0635a(C3328a aVar, String str, ReactApplicationContext reactApplicationContext) {
            C6496s.h(str, "name");
            C6496s.h(reactApplicationContext, "reactContext");
            this.f40337c = aVar;
            this.f40335a = str;
            this.f40336b = reactApplicationContext;
        }

        /* renamed from: a */
        public NativeModule get() {
            return this.f40337c.getModule(this.f40335a, this.f40336b);
        }
    }

    /* renamed from: com.facebook.react.a$b */
    public static final class b implements Iterable, C6828a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterator f40338a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C3328a f40339b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f40340c;

        public b(Iterator it, C3328a aVar, ReactApplicationContext reactApplicationContext) {
            this.f40338a = it;
            this.f40339b = aVar;
            this.f40340c = reactApplicationContext;
        }

        public Iterator iterator() {
            return new c(this.f40338a, this.f40339b, this.f40340c);
        }
    }

    /* renamed from: com.facebook.react.a$c */
    public static final class c implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private Map.Entry f40341a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Iterator f40342b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C3328a f40343c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f40344d;

        c(Iterator it, C3328a aVar, ReactApplicationContext reactApplicationContext) {
            this.f40342b = it;
            this.f40343c = aVar;
            this.f40344d = reactApplicationContext;
        }

        /* JADX WARNING: Removed duplicated region for block: B:2:0x0008  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void a() {
            /*
                r3 = this;
            L_0x0000:
                java.util.Iterator r0 = r3.f40342b
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L_0x0026
                java.util.Iterator r0 = r3.f40342b
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getValue()
                com.facebook.react.module.model.ReactModuleInfo r1 = (com.facebook.react.module.model.ReactModuleInfo) r1
                boolean r2 = M7.b.x()
                if (r2 == 0) goto L_0x0023
                boolean r1 = r1.e()
                if (r1 == 0) goto L_0x0023
                goto L_0x0000
            L_0x0023:
                r3.f40341a = r0
                return
            L_0x0026:
                r0 = 0
                r3.f40341a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.C3328a.c.a():void");
        }

        /* renamed from: b */
        public ModuleHolder next() {
            if (this.f40341a == null) {
                a();
            }
            Map.Entry entry = this.f40341a;
            if (entry != null) {
                a();
                return new ModuleHolder((ReactModuleInfo) entry.getValue(), new C0635a(this.f40343c, (String) entry.getKey(), this.f40344d));
            }
            throw new NoSuchElementException("ModuleHolder not found");
        }

        public boolean hasNext() {
            if (this.f40341a == null) {
                a();
            }
            if (this.f40341a != null) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        C6496s.h(reactApplicationContext, "reactContext");
        throw new UnsupportedOperationException("createNativeModules method is not supported. Use getModule() method instead.");
    }

    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        C6496s.h(reactApplicationContext, "reactContext");
        List<ModuleSpec> viewManagers = getViewManagers(reactApplicationContext);
        Collection collection = viewManagers;
        if (collection == null || collection.isEmpty()) {
            return C6565s.n();
        }
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec provider : viewManagers) {
            Object obj = provider.getProvider().get();
            C6496s.f(obj, "null cannot be cast to non-null type com.facebook.react.uimanager.ViewManager<*, *>");
            arrayList.add((ViewManager) obj);
        }
        return arrayList;
    }

    public abstract NativeModule getModule(String str, ReactApplicationContext reactApplicationContext);

    public final Iterable<ModuleHolder> getNativeModuleIterator$ReactAndroid_release(ReactApplicationContext reactApplicationContext) {
        C6496s.h(reactApplicationContext, "reactContext");
        return new b(getReactModuleInfoProvider().a().entrySet().iterator(), this, reactApplicationContext);
    }

    public abstract a getReactModuleInfoProvider();

    /* access modifiers changed from: protected */
    public List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        C6496s.h(reactApplicationContext, "reactContext");
        return C6565s.n();
    }
}
