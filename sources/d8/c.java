package D8;

import E8.b;
import com.github.penfeizhou.animation.decode.a;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;

public class c extends a {

    /* renamed from: f  reason: collision with root package name */
    private static final byte[] f30583f = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: g  reason: collision with root package name */
    private static final byte[] f30584g = {0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};

    /* renamed from: h  reason: collision with root package name */
    private static final ThreadLocal f30585h = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    public final byte f30586a;

    /* renamed from: b  reason: collision with root package name */
    public final byte f30587b;

    /* renamed from: c  reason: collision with root package name */
    byte[] f30588c;

    /* renamed from: d  reason: collision with root package name */
    List f30589d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    List f30590e = new ArrayList();

    public c(E8.a aVar, f fVar) {
        super(aVar);
        this.f30586a = fVar.f30604m;
        this.f30587b = fVar.f30603l;
        int i10 = fVar.f30601j * 1000;
        short s10 = fVar.f30602k;
        int i11 = i10 / (s10 == 0 ? 100 : s10);
        this.frameDuration = i11;
        if (i11 < 10) {
            this.frameDuration = 100;
        }
        this.frameWidth = fVar.f30597f;
        this.frameHeight = fVar.f30598g;
        this.frameX = fVar.f30599h;
        this.frameY = fVar.f30600i;
    }

    private int b(b bVar) {
        int i10;
        int i11 = 33;
        for (e eVar : this.f30590e) {
            i11 += eVar.f30591a + 12;
        }
        for (e eVar2 : this.f30589d) {
            if (eVar2 instanceof h) {
                i10 = eVar2.f30591a + 12;
            } else if (eVar2 instanceof g) {
                i10 = eVar2.f30591a + 8;
            }
            i11 += i10;
        }
        int length = i11 + f30584g.length;
        bVar.d(length);
        bVar.c(f30583f);
        bVar.h(13);
        int a10 = bVar.a();
        bVar.g(j.f30609h);
        bVar.h(this.frameWidth);
        bVar.h(this.frameHeight);
        bVar.c(this.f30588c);
        CRC32 c10 = c();
        c10.reset();
        c10.update(bVar.f(), a10, 17);
        bVar.h((int) c10.getValue());
        for (e eVar3 : this.f30590e) {
            if (!(eVar3 instanceof i)) {
                ((E8.a) this.reader).reset();
                ((E8.a) this.reader).skip((long) eVar3.f30594d);
                ((E8.a) this.reader).read(bVar.f(), bVar.a(), eVar3.f30591a + 12);
                bVar.e(eVar3.f30591a + 12);
            }
        }
        for (e eVar4 : this.f30589d) {
            if (eVar4 instanceof h) {
                ((E8.a) this.reader).reset();
                ((E8.a) this.reader).skip((long) eVar4.f30594d);
                ((E8.a) this.reader).read(bVar.f(), bVar.a(), eVar4.f30591a + 12);
                bVar.e(eVar4.f30591a + 12);
            } else if (eVar4 instanceof g) {
                bVar.h(eVar4.f30591a - 4);
                int a11 = bVar.a();
                bVar.g(h.f30607e);
                ((E8.a) this.reader).reset();
                ((E8.a) this.reader).skip((long) (eVar4.f30594d + 12));
                ((E8.a) this.reader).read(bVar.f(), bVar.a(), eVar4.f30591a - 4);
                bVar.e(eVar4.f30591a - 4);
                c10.reset();
                c10.update(bVar.f(), a11, eVar4.f30591a);
                bVar.h((int) c10.getValue());
            }
        }
        bVar.c(f30584g);
        return length;
    }

    private CRC32 c() {
        ThreadLocal threadLocal = f30585h;
        CRC32 crc32 = (CRC32) threadLocal.get();
        if (crc32 != null) {
            return crc32;
        }
        CRC32 crc322 = new CRC32();
        threadLocal.set(crc322);
        return crc322;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r9 = new android.graphics.BitmapFactory.Options();
        r9.inJustDecodeBounds = false;
        r9.inSampleSize = r7;
        r9.inMutable = true;
        r8 = android.graphics.BitmapFactory.decodeByteArray(r8, 0, r0, r9);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap draw(android.graphics.Canvas r5, android.graphics.Paint r6, int r7, android.graphics.Bitmap r8, E8.b r9) {
        /*
            r4 = this;
            int r0 = r4.b(r9)     // Catch:{ IOException -> 0x001c }
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x001c }
            r1.<init>()     // Catch:{ IOException -> 0x001c }
            r2 = 0
            r1.inJustDecodeBounds = r2     // Catch:{ IOException -> 0x001c }
            r1.inSampleSize = r7     // Catch:{ IOException -> 0x001c }
            r3 = 1
            r1.inMutable = r3     // Catch:{ IOException -> 0x001c }
            r1.inBitmap = r8     // Catch:{ IOException -> 0x001c }
            byte[] r8 = r9.f()     // Catch:{ IOException -> 0x001c }
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeByteArray(r8, r2, r0, r1)     // Catch:{ IllegalArgumentException -> 0x001e }
            goto L_0x002d
        L_0x001c:
            r5 = move-exception
            goto L_0x0074
        L_0x001e:
            android.graphics.BitmapFactory$Options r9 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x001c }
            r9.<init>()     // Catch:{ IOException -> 0x001c }
            r9.inJustDecodeBounds = r2     // Catch:{ IOException -> 0x001c }
            r9.inSampleSize = r7     // Catch:{ IOException -> 0x001c }
            r9.inMutable = r3     // Catch:{ IOException -> 0x001c }
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeByteArray(r8, r2, r0, r9)     // Catch:{ IOException -> 0x001c }
        L_0x002d:
            android.graphics.Rect r9 = r4.srcRect     // Catch:{ IOException -> 0x001c }
            r9.left = r2     // Catch:{ IOException -> 0x001c }
            r9.top = r2     // Catch:{ IOException -> 0x001c }
            int r0 = r8.getWidth()     // Catch:{ IOException -> 0x001c }
            r9.right = r0     // Catch:{ IOException -> 0x001c }
            android.graphics.Rect r9 = r4.srcRect     // Catch:{ IOException -> 0x001c }
            int r0 = r8.getHeight()     // Catch:{ IOException -> 0x001c }
            r9.bottom = r0     // Catch:{ IOException -> 0x001c }
            android.graphics.Rect r9 = r4.dstRect     // Catch:{ IOException -> 0x001c }
            int r0 = r4.frameX     // Catch:{ IOException -> 0x001c }
            float r1 = (float) r0     // Catch:{ IOException -> 0x001c }
            float r7 = (float) r7     // Catch:{ IOException -> 0x001c }
            float r1 = r1 / r7
            int r1 = (int) r1     // Catch:{ IOException -> 0x001c }
            r9.left = r1     // Catch:{ IOException -> 0x001c }
            int r1 = r4.frameY     // Catch:{ IOException -> 0x001c }
            float r1 = (float) r1     // Catch:{ IOException -> 0x001c }
            float r1 = r1 / r7
            int r1 = (int) r1     // Catch:{ IOException -> 0x001c }
            r9.top = r1     // Catch:{ IOException -> 0x001c }
            float r0 = (float) r0     // Catch:{ IOException -> 0x001c }
            float r0 = r0 / r7
            int r1 = r8.getWidth()     // Catch:{ IOException -> 0x001c }
            float r1 = (float) r1     // Catch:{ IOException -> 0x001c }
            float r0 = r0 + r1
            int r0 = (int) r0     // Catch:{ IOException -> 0x001c }
            r9.right = r0     // Catch:{ IOException -> 0x001c }
            android.graphics.Rect r9 = r4.dstRect     // Catch:{ IOException -> 0x001c }
            int r0 = r4.frameY     // Catch:{ IOException -> 0x001c }
            float r0 = (float) r0     // Catch:{ IOException -> 0x001c }
            float r0 = r0 / r7
            int r7 = r8.getHeight()     // Catch:{ IOException -> 0x001c }
            float r7 = (float) r7     // Catch:{ IOException -> 0x001c }
            float r0 = r0 + r7
            int r7 = (int) r0     // Catch:{ IOException -> 0x001c }
            r9.bottom = r7     // Catch:{ IOException -> 0x001c }
            android.graphics.Rect r7 = r4.srcRect     // Catch:{ IOException -> 0x001c }
            android.graphics.Rect r9 = r4.dstRect     // Catch:{ IOException -> 0x001c }
            r5.drawBitmap(r8, r7, r9, r6)     // Catch:{ IOException -> 0x001c }
            return r8
        L_0x0074:
            r5.printStackTrace()
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.c.draw(android.graphics.Canvas, android.graphics.Paint, int, android.graphics.Bitmap, E8.b):android.graphics.Bitmap");
    }
}
