package Wh;

import Ph.a;
import Sh.b;
import ai.c;
import bi.d;
import bi.e;
import bi.f;
import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

public class g extends c {

    /* renamed from: r  reason: collision with root package name */
    public static final Map f66060r;

    /* renamed from: s  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66061s;

    /* renamed from: t  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66062t;

    /* renamed from: u  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66063u;

    /* renamed from: v  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66064v;

    /* renamed from: w  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66065w;

    /* renamed from: x  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66066x;

    /* renamed from: k  reason: collision with root package name */
    private String f66067k;

    /* renamed from: l  reason: collision with root package name */
    private String f66068l = null;

    /* renamed from: m  reason: collision with root package name */
    private long f66069m;

    /* renamed from: n  reason: collision with root package name */
    private long f66070n;

    /* renamed from: o  reason: collision with root package name */
    private long f66071o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f66072p = true;

    /* renamed from: q  reason: collision with root package name */
    private long f66073q;

    static {
        j();
        HashMap hashMap = new HashMap();
        hashMap.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mdir", "Apple Meta Data iTunes Reader");
        hashMap.put("mp7b", "MPEG-7 binary XML");
        hashMap.put("mp7t", "MPEG-7 XML");
        hashMap.put("vide", "Video Track");
        hashMap.put("soun", "Sound Track");
        hashMap.put("hint", "Hint Track");
        hashMap.put("appl", "Apple specific");
        hashMap.put(Constants.REFERRER_API_META, "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        f66060r = Collections.unmodifiableMap(hashMap);
    }

    public g() {
        super("hdlr");
    }

    private static /* synthetic */ void j() {
        b bVar = new b("HandlerBox.java", g.class);
        f66061s = bVar.f("method-execution", bVar.e("1", "getHandlerType", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "", "", "", "java.lang.String"), 78);
        f66062t = bVar.f("method-execution", bVar.e("1", "setHandlerType", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "java.lang.String", "handlerType", "", "void"), 82);
        f66063u = bVar.f("method-execution", bVar.e("1", "getName", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "", "", "", "java.lang.String"), 86);
        f66064v = bVar.f("method-execution", bVar.e("1", "setName", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "java.lang.String", "name", "", "void"), 95);
        f66065w = bVar.f("method-execution", bVar.e("1", "getHumanReadableTrackType", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "", "", "", "java.lang.String"), 99);
        f66066x = bVar.f("method-execution", bVar.e("1", "toString", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "", "", "", "java.lang.String"), 149);
    }

    public void a(ByteBuffer byteBuffer) {
        m(byteBuffer);
        this.f66073q = d.j(byteBuffer);
        this.f66067k = d.b(byteBuffer);
        this.f66069m = d.j(byteBuffer);
        this.f66070n = d.j(byteBuffer);
        this.f66071o = d.j(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            String g10 = d.g(byteBuffer, byteBuffer.remaining());
            this.f66068l = g10;
            if (g10.endsWith(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)) {
                String str = this.f66068l;
                this.f66068l = str.substring(0, str.length() - 1);
                this.f66072p = true;
                return;
            }
            this.f66072p = false;
            return;
        }
        this.f66072p = false;
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        p(byteBuffer);
        e.g(byteBuffer, this.f66073q);
        byteBuffer.put(Uh.c.o(this.f66067k));
        e.g(byteBuffer, this.f66069m);
        e.g(byteBuffer, this.f66070n);
        e.g(byteBuffer, this.f66071o);
        String str = this.f66068l;
        if (str != null) {
            byteBuffer.put(f.b(str));
        }
        if (this.f66072p) {
            byteBuffer.put((byte) 0);
        }
    }

    /* access modifiers changed from: protected */
    public long c() {
        int c10;
        if (this.f66072p) {
            c10 = f.c(this.f66068l) + 25;
        } else {
            c10 = f.c(this.f66068l) + 24;
        }
        return (long) c10;
    }

    public String q() {
        ai.e.b().c(b.b(f66061s, this, this));
        return this.f66067k;
    }

    public String r() {
        ai.e.b().c(b.b(f66063u, this, this));
        return this.f66068l;
    }

    public void s(String str) {
        ai.e.b().c(b.c(f66062t, this, this, str));
        this.f66067k = str;
    }

    public void t(String str) {
        ai.e.b().c(b.c(f66064v, this, this, str));
        this.f66068l = str;
    }

    public String toString() {
        ai.e.b().c(b.b(f66066x, this, this));
        return "HandlerBox[handlerType=" + q() + ";name=" + r() + "]";
    }
}
