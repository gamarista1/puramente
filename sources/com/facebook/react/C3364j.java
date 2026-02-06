package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import kotlin.jvm.internal.C6496s;

/* renamed from: com.facebook.react.j  reason: case insensitive filesystem */
public final class C3364j {

    /* renamed from: a  reason: collision with root package name */
    private final ReactApplicationContext f40915a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap f40916b = new HashMap();

    public C3364j(ReactApplicationContext reactApplicationContext) {
        C6496s.h(reactApplicationContext, "reactApplicationContext");
        this.f40915a = reactApplicationContext;
    }

    public final NativeModuleRegistry a() {
        return new NativeModuleRegistry(this.f40915a, this.f40916b);
    }

    public final void b(P p10) {
        Iterable<ModuleHolder> iterable;
        C6496s.h(p10, "reactPackage");
        if (p10 instanceof C3328a) {
            iterable = ((C3328a) p10).getNativeModuleIterator$ReactAndroid_release(this.f40915a);
        } else {
            iterable = Q.f40301a.a(p10, this.f40915a);
        }
        for (ModuleHolder next : iterable) {
            String name = next.getName();
            ModuleHolder moduleHolder = (ModuleHolder) this.f40916b.get(name);
            if (moduleHolder == null || next.getCanOverrideExistingModule()) {
                this.f40916b.put(name, next);
            } else {
                String className = moduleHolder.getClassName();
                throw new IllegalStateException(("\nNative module " + name + " tried to override " + className + ".\n\nCheck the getPackages() method in MainApplication.java, it might be that module is being created twice. \nIf this was your intention, set canOverrideExistingModule=true. This error may also be present if the \npackage is present only once in getPackages() but is also automatically added later during build time \nby autolinking. Try removing the existing entry and rebuild.\n").toString());
            }
        }
    }
}
