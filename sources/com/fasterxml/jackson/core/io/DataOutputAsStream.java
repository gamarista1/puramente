package com.fasterxml.jackson.core.io;

import java.io.DataOutput;
import java.io.OutputStream;

public class DataOutputAsStream extends OutputStream {
    protected final DataOutput _output;

    public DataOutputAsStream(DataOutput dataOutput) {
        this._output = dataOutput;
    }

    public void write(int i10) {
        this._output.write(i10);
    }

    public void write(byte[] bArr) {
        this._output.write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i10, int i11) {
        this._output.write(bArr, i10, i11);
    }
}
