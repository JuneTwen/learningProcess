package com.learn.internet.home04;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamUtils {
    public static byte[] toArray(InputStream bis) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] b = new byte[1024];
        int len;
        while((len = bis.read(b)) != -1) {
            baos.write(b, 0, len);
        }
        byte[] array = baos.toByteArray();
        baos.close();
        return array;
    }
}
