package Dd;

import Gd.c;
import Pd.f;
import Sd.e;
import Td.m;
import Vd.b;
import ae.o;
import expo.modules.adapters.react.ReactAdapterPackage;
import expo.modules.av.AVPackage;
import expo.modules.av.video.h;
import expo.modules.constants.ConstantsPackage;
import expo.modules.core.BasePackage;
import expo.modules.filesystem.FileSystemPackage;
import java.util.Arrays;
import java.util.List;

public class d implements o {

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        static final List f50612a = Arrays.asList(new f[]{new ReactAdapterPackage(), new AVPackage(), new ConstantsPackage(), new BasePackage(), new FileSystemPackage()});

        /* renamed from: b  reason: collision with root package name */
        static final List f50613b = Arrays.asList(new Class[]{e.class, c.class, h.class, expo.modules.av.c.class, Ld.a.class, m.class, Ud.d.class, b.class, ye.c.class});
    }

    public static List<f> getPackageList() {
        return a.f50612a;
    }

    public List<Class<? extends ke.b>> getModulesList() {
        return a.f50613b;
    }
}
