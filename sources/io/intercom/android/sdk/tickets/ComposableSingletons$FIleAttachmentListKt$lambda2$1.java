package io.intercom.android.sdk.tickets;

import Y.C1500m;
import io.intercom.android.sdk.models.FileType;
import io.intercom.android.sdk.models.Ticket;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import mf.C6565s;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.tickets.ComposableSingletons$FIleAttachmentListKt$lambda-2$1  reason: invalid class name */
final class ComposableSingletons$FIleAttachmentListKt$lambda2$1 implements p {
    public static final ComposableSingletons$FIleAttachmentListKt$lambda2$1 INSTANCE = new ComposableSingletons$FIleAttachmentListKt$lambda2$1();

    ComposableSingletons$FIleAttachmentListKt$lambda2$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            FIleAttachmentListKt.FileAttachmentList((i) null, C6565s.q(new Ticket.TicketAttribute.FilesAttribute.File("", "image.png", "https://www.google.com", FileType.IMAGE), new Ticket.TicketAttribute.FilesAttribute.File("", "video.mp4", "https://www.google.com", FileType.VIDEO), new Ticket.TicketAttribute.FilesAttribute.File("", "attachment.pdf", "https://www.google.com", FileType.ATTACHMENT)), mVar, 0, 1);
        } else {
            mVar.I();
        }
    }
}
