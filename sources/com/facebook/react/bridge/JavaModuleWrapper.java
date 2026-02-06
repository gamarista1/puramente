package com.facebook.react.bridge;

import B7.a;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import z8.C4236a;
import z8.C4237b;

@a
class JavaModuleWrapper {
    private final ArrayList<MethodDescriptor> mDescs = new ArrayList<>();
    private final JSInstance mJSInstance;
    private final ArrayList<NativeMethod> mMethods = new ArrayList<>();
    private final ModuleHolder mModuleHolder;

    @a
    public static class MethodDescriptor {
        @a
        Method method;
        @a
        String name;
        @a
        String signature;
        @a
        String type;
    }

    interface NativeMethod {
        String getType();

        void invoke(JSInstance jSInstance, ReadableArray readableArray);
    }

    public JavaModuleWrapper(JSInstance jSInstance, ModuleHolder moduleHolder) {
        this.mJSInstance = jSInstance;
        this.mModuleHolder = moduleHolder;
    }

    @a
    private void findMethods() {
        C4236a.c(0, "findMethods");
        Class<?> cls = this.mModuleHolder.getModule().getClass();
        Class<? super Object> superclass = cls.getSuperclass();
        if (TurboModule.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        for (Method method : cls.getDeclaredMethods()) {
            ReactMethod reactMethod = (ReactMethod) method.getAnnotation(ReactMethod.class);
            if (reactMethod != null) {
                String name = method.getName();
                MethodDescriptor methodDescriptor = new MethodDescriptor();
                JavaMethodWrapper javaMethodWrapper = new JavaMethodWrapper(this, method, reactMethod.isBlockingSynchronousMethod());
                methodDescriptor.name = name;
                String type = javaMethodWrapper.getType();
                methodDescriptor.type = type;
                if (BaseJavaModule.METHOD_TYPE_SYNC.equals(type)) {
                    methodDescriptor.signature = javaMethodWrapper.getSignature();
                    methodDescriptor.method = method;
                }
                this.mMethods.add(javaMethodWrapper);
                this.mDescs.add(methodDescriptor);
            }
        }
        C4236a.i(0);
    }

    @a
    public NativeMap getConstants() {
        String name = getName();
        C4237b.a(0, "JavaModuleWrapper.getConstants").b("moduleName", name).c();
        ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_START, name);
        BaseJavaModule module = getModule();
        C4236a.c(0, "module.getConstants");
        Map<String, Object> constants = module.getConstants();
        C4236a.i(0);
        C4236a.c(0, "create WritableNativeMap");
        ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_START, name);
        try {
            return Arguments.makeNativeMap(constants);
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_END, name);
            C4236a.i(0);
            ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_END, name);
            C4237b.b(0).c();
        }
    }

    @a
    public List<MethodDescriptor> getMethodDescriptors() {
        if (this.mDescs.isEmpty()) {
            findMethods();
        }
        return this.mDescs;
    }

    @a
    public BaseJavaModule getModule() {
        return (BaseJavaModule) this.mModuleHolder.getModule();
    }

    @a
    public String getName() {
        return this.mModuleHolder.getName();
    }

    @a
    public void invoke(int i10, ReadableNativeArray readableNativeArray) {
        if (i10 < this.mMethods.size()) {
            this.mMethods.get(i10).invoke(this.mJSInstance, readableNativeArray);
        }
    }
}
