package D8;

import com.github.penfeizhou.animation.decode.a;

public class k extends a {
    public k(E8.a aVar) {
        super(aVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r8 = new android.graphics.BitmapFactory.Options();
        r8.inJustDecodeBounds = false;
        r8.inSampleSize = r6;
        r8.inMutable = true;
        r6 = android.graphics.BitmapFactory.decodeStream(((E8.a) r3.reader).toInputStream(), (android.graphics.Rect) null, r8);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0026 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap draw(android.graphics.Canvas r4, android.graphics.Paint r5, int r6, android.graphics.Bitmap r7, E8.b r8) {
        /*
            r3 = this;
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options
            r8.<init>()
            r0 = 0
            r8.inJustDecodeBounds = r0
            r8.inSampleSize = r6
            r1 = 1
            r8.inMutable = r1
            r8.inBitmap = r7
            r7 = 0
            com.github.penfeizhou.animation.io.Reader r2 = r3.reader     // Catch:{ IOException -> 0x0024 }
            E8.a r2 = (E8.a) r2     // Catch:{ IOException -> 0x0024 }
            r2.reset()     // Catch:{ IOException -> 0x0024 }
            com.github.penfeizhou.animation.io.Reader r2 = r3.reader     // Catch:{ IllegalArgumentException -> 0x0026 }
            E8.a r2 = (E8.a) r2     // Catch:{ IllegalArgumentException -> 0x0026 }
            java.io.InputStream r2 = r2.toInputStream()     // Catch:{ IllegalArgumentException -> 0x0026 }
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r2, r7, r8)     // Catch:{ IllegalArgumentException -> 0x0026 }
            goto L_0x003d
        L_0x0024:
            r4 = move-exception
            goto L_0x0047
        L_0x0026:
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x0024 }
            r8.<init>()     // Catch:{ IOException -> 0x0024 }
            r8.inJustDecodeBounds = r0     // Catch:{ IOException -> 0x0024 }
            r8.inSampleSize = r6     // Catch:{ IOException -> 0x0024 }
            r8.inMutable = r1     // Catch:{ IOException -> 0x0024 }
            com.github.penfeizhou.animation.io.Reader r6 = r3.reader     // Catch:{ IOException -> 0x0024 }
            E8.a r6 = (E8.a) r6     // Catch:{ IOException -> 0x0024 }
            java.io.InputStream r6 = r6.toInputStream()     // Catch:{ IOException -> 0x0024 }
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r6, r7, r8)     // Catch:{ IOException -> 0x0024 }
        L_0x003d:
            r5.setXfermode(r7)     // Catch:{ IOException -> 0x0045 }
            r7 = 0
            r4.drawBitmap(r6, r7, r7, r5)     // Catch:{ IOException -> 0x0045 }
            goto L_0x004b
        L_0x0045:
            r4 = move-exception
            r7 = r6
        L_0x0047:
            r4.printStackTrace()
            r6 = r7
        L_0x004b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.k.draw(android.graphics.Canvas, android.graphics.Paint, int, android.graphics.Bitmap, E8.b):android.graphics.Bitmap");
    }
}
