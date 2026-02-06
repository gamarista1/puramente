package com.facebook.imagepipeline.nativecode;

import java.lang.reflect.InvocationTargetException;
import k7.d;
import kotlin.jvm.internal.C6496s;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f39773a = new c();

    private c() {
    }

    public static final d a(int i10, boolean z10, boolean z11) {
        Class<NativeJpegTranscoderFactory> cls = NativeJpegTranscoderFactory.class;
        try {
            Class cls2 = Integer.TYPE;
            Class cls3 = Boolean.TYPE;
            NativeJpegTranscoderFactory newInstance = cls.getConstructor(new Class[]{cls2, cls3, cls3}).newInstance(new Object[]{Integer.valueOf(i10), Boolean.valueOf(z10), Boolean.valueOf(z11)});
            C6496s.f(newInstance, "null cannot be cast to non-null type com.facebook.imagepipeline.transcoder.ImageTranscoderFactory");
            return newInstance;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e10);
        } catch (SecurityException e11) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e13);
        } catch (IllegalAccessException e14) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e14);
        } catch (IllegalArgumentException e15) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e15);
        } catch (ClassNotFoundException e16) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e16);
        }
    }
}
