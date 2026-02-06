package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.Writer;

public final class SegmentedStringWriter extends Writer {
    private final TextBuffer _buffer;

    public SegmentedStringWriter(BufferRecycler bufferRecycler) {
        this._buffer = new TextBuffer(bufferRecycler);
    }

    public void close() {
    }

    public void flush() {
    }

    public String getAndClear() {
        String contentsAsString = this._buffer.contentsAsString();
        this._buffer.releaseBuffers();
        return contentsAsString;
    }

    public void write(char[] cArr) {
        this._buffer.append(cArr, 0, cArr.length);
    }

    public void write(char[] cArr, int i10, int i11) {
        this._buffer.append(cArr, i10, i11);
    }

    public void write(int i10) {
        this._buffer.append((char) i10);
    }

    public Writer append(char c10) {
        write((int) c10);
        return this;
    }

    public void write(String str) {
        this._buffer.append(str, 0, str.length());
    }

    public Writer append(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        this._buffer.append(charSequence2, 0, charSequence2.length());
        return this;
    }

    public void write(String str, int i10, int i11) {
        this._buffer.append(str, i10, i11);
    }

    public Writer append(CharSequence charSequence, int i10, int i11) {
        String charSequence2 = charSequence.subSequence(i10, i11).toString();
        this._buffer.append(charSequence2, 0, charSequence2.length());
        return this;
    }
}
