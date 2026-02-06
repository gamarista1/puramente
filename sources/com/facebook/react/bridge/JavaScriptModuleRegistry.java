package com.facebook.react.bridge;

import E7.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.HashSet;

public final class JavaScriptModuleRegistry {
    private final HashMap<Class<? extends JavaScriptModule>, JavaScriptModule> mModuleInstances = new HashMap<>();

    private static class JavaScriptModuleInvocationHandler implements InvocationHandler {
        private final CatalystInstance mCatalystInstance;
        private final Class<? extends JavaScriptModule> mModuleInterface;
        private String mName;

        public JavaScriptModuleInvocationHandler(CatalystInstance catalystInstance, Class<? extends JavaScriptModule> cls) {
            this.mCatalystInstance = catalystInstance;
            this.mModuleInterface = cls;
            if (a.f30669b) {
                HashSet hashSet = new HashSet();
                Method[] declaredMethods = cls.getDeclaredMethods();
                int length = declaredMethods.length;
                int i10 = 0;
                while (i10 < length) {
                    Method method = declaredMethods[i10];
                    if (hashSet.add(method.getName())) {
                        i10++;
                    } else {
                        throw new AssertionError("Method overloading is unsupported: " + this.mModuleInterface.getName() + "#" + method.getName());
                    }
                }
            }
        }

        private String getJSModuleName() {
            if (this.mName == null) {
                this.mName = JavaScriptModuleRegistry.getJSModuleName(this.mModuleInterface);
            }
            return this.mName;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            WritableNativeArray writableNativeArray;
            if (objArr != null) {
                writableNativeArray = Arguments.fromJavaArgs(objArr);
            } else {
                writableNativeArray = new WritableNativeArray();
            }
            this.mCatalystInstance.callFunction(getJSModuleName(), method.getName(), writableNativeArray);
            return null;
        }
    }

    public static String getJSModuleName(Class<? extends JavaScriptModule> cls) {
        String simpleName = cls.getSimpleName();
        int lastIndexOf = simpleName.lastIndexOf(36);
        if (lastIndexOf != -1) {
            return simpleName.substring(lastIndexOf + 1);
        }
        return simpleName;
    }

    public synchronized <T extends JavaScriptModule> T getJavaScriptModule(CatalystInstance catalystInstance, Class<T> cls) {
        T t10 = (JavaScriptModule) this.mModuleInstances.get(cls);
        if (t10 != null) {
            return t10;
        }
        T t11 = (JavaScriptModule) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new JavaScriptModuleInvocationHandler(catalystInstance, cls));
        this.mModuleInstances.put(cls, t11);
        return t11;
    }
}
