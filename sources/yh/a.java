package Yh;

import Ph.a;
import Sh.b;
import ai.e;
import com.adjust.sdk.Constants;
import io.intercom.android.sdk.models.AttributeType;
import java.nio.ByteBuffer;
import java.util.List;

public final class a extends ai.a {

    /* renamed from: A  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66865A;

    /* renamed from: B  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66866B;

    /* renamed from: C  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66867C;

    /* renamed from: D  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66868D;

    /* renamed from: E  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66869E;

    /* renamed from: F  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66870F;

    /* renamed from: G  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66871G;

    /* renamed from: H  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66872H;

    /* renamed from: I  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66873I;

    /* renamed from: h  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66874h;

    /* renamed from: i  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66875i;

    /* renamed from: j  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66876j;

    /* renamed from: k  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66877k;

    /* renamed from: l  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66878l;

    /* renamed from: m  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66879m;

    /* renamed from: n  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66880n;

    /* renamed from: o  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66881o;

    /* renamed from: p  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66882p;

    /* renamed from: q  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66883q;

    /* renamed from: r  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66884r;

    /* renamed from: s  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66885s;

    /* renamed from: t  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66886t;

    /* renamed from: u  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66887u;

    /* renamed from: v  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66888v;

    /* renamed from: w  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66889w;

    /* renamed from: x  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66890x;

    /* renamed from: y  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66891y;

    /* renamed from: z  reason: collision with root package name */
    private static /* synthetic */ a.C0949a f66892z;

    /* renamed from: g  reason: collision with root package name */
    public b f66893g = new b();

    static {
        j();
    }

    public a() {
        super("avcC");
    }

    private static /* synthetic */ void j() {
        b bVar = new b("AvcConfigurationBox.java", a.class);
        f66874h = bVar.f("method-execution", bVar.e("1", "getConfigurationVersion", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 44);
        f66875i = bVar.f("method-execution", bVar.e("1", "setConfigurationVersion", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "", "void"), 48);
        f66884r = bVar.f("method-execution", bVar.e("1", "getSequenceParameterSets", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 84);
        f66885s = bVar.f("method-execution", bVar.e("1", "setSequenceParameterSets", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "", "void"), 88);
        f66886t = bVar.f("method-execution", bVar.e("1", "getPictureParameterSets", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 92);
        f66887u = bVar.f("method-execution", bVar.e("1", "setPictureParameterSets", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "", "void"), 96);
        f66888v = bVar.f("method-execution", bVar.e("1", "getChromaFormat", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 100);
        f66889w = bVar.f("method-execution", bVar.e("1", "setChromaFormat", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "", "void"), 104);
        f66890x = bVar.f("method-execution", bVar.e("1", "getBitDepthLumaMinus8", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 108);
        f66891y = bVar.f("method-execution", bVar.e("1", "setBitDepthLumaMinus8", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "", "void"), 112);
        f66892z = bVar.f("method-execution", bVar.e("1", "getBitDepthChromaMinus8", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 116);
        f66865A = bVar.f("method-execution", bVar.e("1", "setBitDepthChromaMinus8", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "", "void"), 120);
        f66876j = bVar.f("method-execution", bVar.e("1", "getAvcProfileIndication", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 52);
        f66866B = bVar.f("method-execution", bVar.e("1", "getSequenceParameterSetExts", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 124);
        f66867C = bVar.f("method-execution", bVar.e("1", "setSequenceParameterSetExts", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "", "void"), 128);
        f66868D = bVar.f("method-execution", bVar.e("1", "hasExts", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", AttributeType.BOOLEAN), 132);
        f66869E = bVar.f("method-execution", bVar.e("1", "setHasExts", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", AttributeType.BOOLEAN, "hasExts", "", "void"), 136);
        f66870F = bVar.f("method-execution", bVar.e("1", "getContentSize", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", Constants.LONG), 147);
        f66871G = bVar.f("method-execution", bVar.e("1", "getContent", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 153);
        f66872H = bVar.f("method-execution", bVar.e("1", "getavcDecoderConfigurationRecord", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "org.mp4parser.boxes.iso14496.part15.AvcDecoderConfigurationRecord"), 158);
        f66873I = bVar.f("method-execution", bVar.e("1", "toString", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "java.lang.String"), 163);
        f66877k = bVar.f("method-execution", bVar.e("1", "setAvcProfileIndication", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "", "void"), 56);
        f66878l = bVar.f("method-execution", bVar.e("1", "getProfileCompatibility", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 60);
        f66879m = bVar.f("method-execution", bVar.e("1", "setProfileCompatibility", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "", "void"), 64);
        f66880n = bVar.f("method-execution", bVar.e("1", "getAvcLevelIndication", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 68);
        f66881o = bVar.f("method-execution", bVar.e("1", "setAvcLevelIndication", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "", "void"), 72);
        f66882p = bVar.f("method-execution", bVar.e("1", "getLengthSizeMinusOne", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 76);
        f66883q = bVar.f("method-execution", bVar.e("1", "setLengthSizeMinusOne", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "", "void"), 80);
    }

    public void a(ByteBuffer byteBuffer) {
        this.f66893g = new b(byteBuffer);
    }

    public void b(ByteBuffer byteBuffer) {
        e.b().c(b.c(f66871G, this, this, byteBuffer));
        this.f66893g.a(byteBuffer);
    }

    public long c() {
        e.b().c(b.b(f66870F, this, this));
        return this.f66893g.b();
    }

    public void k(int i10) {
        e.b().c(b.c(f66881o, this, this, Rh.a.d(i10)));
        this.f66893g.f66897d = i10;
    }

    public void l(int i10) {
        e.b().c(b.c(f66877k, this, this, Rh.a.d(i10)));
        this.f66893g.f66895b = i10;
    }

    public void m(int i10) {
        e.b().c(b.c(f66865A, this, this, Rh.a.d(i10)));
        this.f66893g.f66904k = i10;
    }

    public void n(int i10) {
        e.b().c(b.c(f66891y, this, this, Rh.a.d(i10)));
        this.f66893g.f66903j = i10;
    }

    public void o(int i10) {
        e.b().c(b.c(f66889w, this, this, Rh.a.d(i10)));
        this.f66893g.f66902i = i10;
    }

    public void p(int i10) {
        e.b().c(b.c(f66875i, this, this, Rh.a.d(i10)));
        this.f66893g.f66894a = i10;
    }

    public void q(int i10) {
        e.b().c(b.c(f66883q, this, this, Rh.a.d(i10)));
        this.f66893g.f66898e = i10;
    }

    public void r(List list) {
        e.b().c(b.c(f66887u, this, this, list));
        this.f66893g.f66900g = list;
    }

    public void s(int i10) {
        e.b().c(b.c(f66879m, this, this, Rh.a.d(i10)));
        this.f66893g.f66896c = i10;
    }

    public void t(List list) {
        e.b().c(b.c(f66885s, this, this, list));
        this.f66893g.f66899f = list;
    }

    public String toString() {
        e.b().c(b.b(f66873I, this, this));
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.f66893g + '}';
    }
}
