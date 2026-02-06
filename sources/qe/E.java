package qe;

import android.net.Uri;
import android.os.Bundle;
import expo.modules.kotlin.types.folly.FollyDynamicExtensionConverter;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Map;
import kotlin.Pair;
import qe.L;

public interface E {

    public static final class a implements E {
        public Object a(Object obj) {
            Uri uri = (Uri) obj;
            if (uri != null) {
                return M.n(uri);
            }
            return null;
        }
    }

    public static final class b implements E {
        public Object a(Object obj) {
            return L.b(L.f61392a, obj, (L.a) null, true, 2, (Object) null);
        }
    }

    public static final class c implements E {
        public Object a(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr != null) {
                return M.h(objArr, L.b.f61393a);
            }
            return null;
        }
    }

    public static final class d implements E {
        public Object a(Object obj) {
            boolean[] zArr = (boolean[]) obj;
            if (zArr != null) {
                return M.i(zArr, L.b.f61393a);
            }
            return null;
        }
    }

    public static final class e implements E {
        public Object a(Object obj) {
            Bundle bundle = (Bundle) obj;
            if (bundle != null) {
                return M.j(bundle, L.b.f61393a);
            }
            return null;
        }
    }

    public static final class f implements E {
        public Object a(Object obj) {
            byte[] bArr = (byte[]) obj;
            if (bArr != null) {
                return FollyDynamicExtensionConverter.f60460a.put(bArr);
            }
            return null;
        }
    }

    public static final class g implements E {
        public Object a(Object obj) {
            Collection collection = (Collection) obj;
            if (collection != null) {
                return M.r(collection);
            }
            return null;
        }
    }

    public static final class h implements E {
        public Object a(Object obj) {
            double[] dArr = (double[]) obj;
            if (dArr != null) {
                return M.e(dArr, L.b.f61393a);
            }
            return null;
        }
    }

    public static final class i implements E {
        public Object a(Object obj) {
            Tg.a aVar = (Tg.a) obj;
            if (aVar != null) {
                return Double.valueOf(Tg.a.Q(aVar.X(), Tg.d.SECONDS));
            }
            return null;
        }
    }

    public static final class j implements E {
        public Object a(Object obj) {
            Enum enumR = (Enum) obj;
            if (enumR != null) {
                return M.m(enumR);
            }
            return null;
        }
    }

    public static final class k implements E {
        public Object a(Object obj) {
            File file = (File) obj;
            if (file != null) {
                return M.o(file);
            }
            return null;
        }
    }

    public static final class l implements E {
        public Object a(Object obj) {
            float[] fArr = (float[]) obj;
            if (fArr != null) {
                return M.f(fArr, L.b.f61393a);
            }
            return null;
        }
    }

    public static final class m implements E {
        public Object a(Object obj) {
            int[] iArr = (int[]) obj;
            if (iArr != null) {
                return M.g(iArr, L.b.f61393a);
            }
            return null;
        }
    }

    public static final class n implements E {
        public Object a(Object obj) {
            Long l10 = (Long) obj;
            if (l10 != null) {
                return Double.valueOf((double) l10.longValue());
            }
            return null;
        }
    }

    public static final class o implements E {
        public Object a(Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                return M.t(map);
            }
            return null;
        }
    }

    public static final class p implements E {
        public Object a(Object obj) {
            Pair pair = (Pair) obj;
            if (pair != null) {
                return M.d(pair, L.b.f61393a);
            }
            return null;
        }
    }

    public static final class r implements E {
        public Object a(Object obj) {
            pe.i iVar = (pe.i) obj;
            if (iVar != null) {
                return iVar.b();
            }
            return null;
        }
    }

    public static final class s implements E {
        public Object a(Object obj) {
            ne.c cVar = (ne.c) obj;
            if (cVar != null) {
                return M.l(cVar, L.b.f61393a);
            }
            return null;
        }
    }

    public static final class t implements E {
        public Object a(Object obj) {
            URI uri = (URI) obj;
            if (uri != null) {
                return M.p(uri);
            }
            return null;
        }
    }

    public static final class u implements E {
        public Object a(Object obj) {
            URL url = (URL) obj;
            if (url != null) {
                return M.q(url);
            }
            return null;
        }
    }

    Object a(Object obj);

    public static final class q implements E {
        public Object a(Object obj) {
            return obj;
        }
    }
}
