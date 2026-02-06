package D8;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import com.github.penfeizhou.animation.decode.b;
import com.github.penfeizhou.animation.io.Reader;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class b extends com.github.penfeizhou.animation.decode.b {

    /* renamed from: A  reason: collision with root package name */
    private static final String f30575A = "b";

    /* renamed from: w  reason: collision with root package name */
    private E8.b f30576w;

    /* renamed from: x  reason: collision with root package name */
    private int f30577x;

    /* renamed from: y  reason: collision with root package name */
    private final Paint f30578y;

    /* renamed from: z  reason: collision with root package name */
    private final C0506b f30579z = new C0506b();

    /* renamed from: D8.b$b  reason: collision with other inner class name */
    private static class C0506b {

        /* renamed from: a  reason: collision with root package name */
        byte f30580a;

        /* renamed from: b  reason: collision with root package name */
        Rect f30581b;

        /* renamed from: c  reason: collision with root package name */
        ByteBuffer f30582c;

        private C0506b() {
            this.f30581b = new Rect();
        }
    }

    public b(N8.b bVar, b.j jVar) {
        super(bVar, jVar);
        Paint paint = new Paint();
        this.f30578y = paint;
        paint.setAntiAlias(true);
    }

    /* access modifiers changed from: protected */
    public void K() {
        this.f30579z.f30582c = null;
        this.f30576w = null;
    }

    /* access modifiers changed from: protected */
    public void M(com.github.penfeizhou.animation.decode.a aVar) {
        if (aVar != null && this.f42729p != null) {
            try {
                Bitmap H10 = H(this.f42729p.width() / this.f42724k, this.f42729p.height() / this.f42724k);
                Canvas canvas = (Canvas) this.f42727n.get(H10);
                if (canvas == null) {
                    canvas = new Canvas(H10);
                    this.f42727n.put(H10, canvas);
                }
                Canvas canvas2 = canvas;
                if (aVar instanceof c) {
                    this.f42728o.rewind();
                    H10.copyPixelsFromBuffer(this.f42728o);
                    if (this.f42718e == 0) {
                        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                    } else {
                        canvas2.save();
                        canvas2.clipRect(this.f30579z.f30581b);
                        C0506b bVar = this.f30579z;
                        byte b10 = bVar.f30580a;
                        if (b10 == 1) {
                            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                        } else if (b10 == 2) {
                            bVar.f30582c.rewind();
                            H10.copyPixelsFromBuffer(this.f30579z.f30582c);
                        }
                        canvas2.restore();
                    }
                    if (((c) aVar).f30587b == 2) {
                        C0506b bVar2 = this.f30579z;
                        if (bVar2.f30580a != 2) {
                            bVar2.f30582c.rewind();
                            H10.copyPixelsToBuffer(this.f30579z.f30582c);
                        }
                    }
                    this.f30579z.f30580a = ((c) aVar).f30587b;
                    canvas2.save();
                    if (((c) aVar).f30586a == 0) {
                        int i10 = aVar.frameX;
                        int i11 = this.f42724k;
                        int i12 = aVar.frameY;
                        canvas2.clipRect(i10 / i11, i12 / i11, (i10 + aVar.frameWidth) / i11, (i12 + aVar.frameHeight) / i11);
                        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                    }
                    Rect rect = this.f30579z.f30581b;
                    int i13 = aVar.frameX;
                    int i14 = this.f42724k;
                    int i15 = aVar.frameY;
                    rect.set(i13 / i14, i15 / i14, (i13 + aVar.frameWidth) / i14, (i15 + aVar.frameHeight) / i14);
                    canvas2.restore();
                }
                Bitmap H11 = H(aVar.frameWidth, aVar.frameHeight);
                J(aVar.draw(canvas2, this.f30578y, this.f42724k, H11, C()));
                J(H11);
                this.f42728o.rewind();
                H10.copyPixelsToBuffer(this.f42728o);
                J(H10);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public E8.a A(Reader reader) {
        return new E8.a(reader);
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public E8.b C() {
        if (this.f30576w == null) {
            this.f30576w = new E8.b();
        }
        return this.f30576w;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public Rect I(E8.a aVar) {
        List b10 = d.b(aVar);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[0];
        Iterator it = b10.iterator();
        c cVar = null;
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            e eVar = (e) it.next();
            boolean z11 = eVar instanceof i;
            if (z11) {
                Log.e(f30575A, "chunk read reach to end");
                break;
            } else if (eVar instanceof a) {
                this.f30577x = ((a) eVar).f30574f;
                z10 = true;
            } else if (eVar instanceof f) {
                cVar = new c(aVar, (f) eVar);
                cVar.f30590e = arrayList;
                cVar.f30588c = bArr;
                this.f42717d.add(cVar);
            } else if (eVar instanceof g) {
                if (cVar != null) {
                    cVar.f30589d.add(eVar);
                }
            } else if (eVar instanceof h) {
                if (!z10) {
                    k kVar = new k(aVar);
                    kVar.frameWidth = i10;
                    kVar.frameHeight = i11;
                    this.f42717d.add(kVar);
                    this.f30577x = 1;
                    break;
                } else if (cVar != null) {
                    cVar.f30589d.add(eVar);
                }
            } else if (eVar instanceof j) {
                j jVar = (j) eVar;
                i10 = jVar.f30610e;
                i11 = jVar.f30611f;
                bArr = jVar.f30612g;
            } else if (!z11) {
                arrayList.add(eVar);
            }
        }
        int i12 = i10 * i11;
        int i13 = this.f42724k;
        this.f42728o = ByteBuffer.allocate(((i12 / (i13 * i13)) + 1) * 4);
        C0506b bVar = this.f30579z;
        int i14 = this.f42724k;
        bVar.f30582c = ByteBuffer.allocate(((i12 / (i14 * i14)) + 1) * 4);
        return new Rect(0, 0, i10, i11);
    }

    /* access modifiers changed from: protected */
    public int x() {
        return this.f30577x;
    }
}
